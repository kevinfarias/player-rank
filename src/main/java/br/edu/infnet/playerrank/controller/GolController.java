package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Gol;
import br.edu.infnet.playerrank.model.service.GolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("user")
@Controller
public class GolController {

	@Autowired
	private GolService golService;

	@GetMapping(value = "/gol/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", golService.obterLista());

		return "gol/lista";
	}

	@GetMapping(value = "/gol/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		golService.excluir(id);

		return "redirect:/gol/lista";
	}

	@GetMapping(value = "/gol")
	public String telaCadastro() {
		return "/gol/cadastro";
	}

	@PostMapping(value = "/gol")
	public String incluir(Gol gol) {
		golService.incluir(gol);

		return "redirect:/gol/lista";
	}

}
