package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.*;
import br.edu.infnet.playerrank.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SessionAttributes("user")
@Controller
public class JogadorPartidaController {

	@Autowired
	private JogadorPartidaService jogadorPartidaService;

	@Autowired
	private JogadorService jogadorService;

	@Autowired
	private PasseService passeService;

	@Autowired
	private PartidaService partidaService;

	@Autowired
	private GolService golService;

	@Autowired
	private DribleService dribleService;

	@Autowired
	private AcaoService acaoService;

	@GetMapping(value = "/jogadorpartida/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", jogadorPartidaService.obterLista(usuario));

		return "jogadorpartida/lista";
	}

	@GetMapping(value = "/jogadorpartida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		jogadorPartidaService.excluir(id);

		return "redirect:/jogadorpartida/lista";
	}

	@GetMapping(value = "/jogadorpartida")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("partidas", partidaService.obterLista(usuario));
		model.addAttribute("jogadores", jogadorService.obterLista(usuario));
		model.addAttribute("gols", golService.obterLista(usuario));
		model.addAttribute("passes", passeService.obterLista(usuario));
		model.addAttribute("dribles", dribleService.obterLista(usuario));
		return "/jogadorpartida/cadastro";
	}

	@PostMapping(value = "/jogadorpartida")
	public String incluir(@RequestParam Map<String,String> jogadorPartidaData, @RequestParam List<Integer> acoes, @SessionAttribute("user") Usuario usuario) {
		JogadorPartida jogadorPartida = new JogadorPartida();

		Optional<Partida> partida = partidaService.buscar(Integer.valueOf(jogadorPartidaData.get("partida")));
		if (partida != null) {
			jogadorPartida.setPartida(partida.get());
		}

		jogadorPartida.setUsuario(usuario);

		Optional<Jogador> jogador = jogadorService.buscar(Integer.valueOf(jogadorPartidaData.get("jogador")));
		if (jogador != null) {
			jogadorPartida.setJogador(jogador.get());
		}

		jogadorPartida.setVencedor(jogadorPartidaData.get("vencedor") == "true");

		List<Acao> acoesAsObject = new ArrayList<Acao>();
		acoes.forEach(acaoId -> {
			Optional<Acao> acao = acaoService.buscar(acaoId);
			if (!acao.isEmpty()) {
				acoesAsObject.add(acao.get());
			}
		});

		jogadorPartida.setAcoes(acoesAsObject);

		jogadorPartidaService.incluir(jogadorPartida);

		return "redirect:/jogadorpartida/lista";
	}
}
