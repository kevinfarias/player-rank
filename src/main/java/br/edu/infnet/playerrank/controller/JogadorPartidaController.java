package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.JogadorPartida;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.service.JogadorPartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("user")
@Controller
public class JogadorPartidaController {

	@Autowired
	private JogadorPartidaService jogadorPartidaService;

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
	public String telaCadastro() {
		return "/jogadorpartida/cadastro";
	}

	@PostMapping(value = "/jogadorpartida")
	public String incluir(JogadorPartida jogadorPartida) {
		jogadorPartidaService.incluir(jogadorPartida);

		return "redirect:/jogadorpartida/lista";
	}
}
