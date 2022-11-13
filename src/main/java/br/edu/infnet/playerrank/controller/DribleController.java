package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Drible;
import br.edu.infnet.playerrank.model.service.DribleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("user")
@Controller
public class DribleController {

	@Autowired
	private DribleService dribleService;

	@GetMapping(value = "/drible/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", dribleService.obterLista());

		return "drible/lista";
	}

	@GetMapping(value = "/drible/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		dribleService.excluir(id);

		return "redirect:/drible/lista";
	}


	@GetMapping(value = "/drible")
	public String telaCadastro() {
		return "/drible/cadastro";
	}

	@PostMapping(value = "/drible")
	public String incluir(Drible drible) {
		dribleService.incluir(drible);

		return "redirect:/drible/lista";
	}
}
