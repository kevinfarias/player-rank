package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Jogador;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("user")
@Controller
public class JogadorController {

	@Autowired
	private JogadorService jogadorService;

	@GetMapping(value = "/jogador/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", jogadorService.obterLista(usuario));

		return "jogador/lista";
	}

	@GetMapping(value = "/jogador")
	public String telaCadastro() {
		return "jogador/cadastro";
	}

	@PostMapping(value = "/jogador")
	public String incluir(Jogador jogador, @SessionAttribute("user") Usuario usuario) {
		jogador.setUsuario(usuario);

		jogadorService.incluir(jogador);

		return "redirect:/jogador/lista";
	}

	@GetMapping(value = "/jogador/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		jogadorService.excluir(id);

		return "redirect:/jogador/lista";
	}
}
