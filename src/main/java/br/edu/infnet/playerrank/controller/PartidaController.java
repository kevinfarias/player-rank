package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Partida;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("user")
@Controller
public class PartidaController {
	@Autowired
	private PartidaService partidaService;

	@GetMapping(value = "/partida/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", partidaService.obterLista());

		return "partida/lista";
	}

	@GetMapping(value = "/partida")
	public String telaCadastro() {
		return "partida/cadastro";
	}

	@PostMapping(value = "/partida")
	public String incluir(Partida partida, @SessionAttribute("user") Usuario usuario) {
		partida.setUsuario(usuario);
		partidaService.incluir(partida);

		return "redirect:/partida/lista";
	}

	@GetMapping(value = "/partida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		partidaService.excluir(id);

		return "redirect:/partida/lista";
	}
}
