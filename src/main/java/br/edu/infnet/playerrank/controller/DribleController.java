package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Drible;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.service.DribleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("user")
@Controller
public class DribleController {

	@Autowired
	private DribleService dribleService;

	@GetMapping(value = "/drible/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", dribleService.obterLista(usuario));

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
	public String incluir(Drible drible, @SessionAttribute("user") Usuario usuario) {
		drible.setUsuario(usuario);
		dribleService.incluir(drible);

		return "redirect:/drible/lista";
	}
}
