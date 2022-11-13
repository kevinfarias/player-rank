package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Passe;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.service.PasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("user")
@Controller
public class PasseController {
	@Autowired
	private PasseService passeService;

	@GetMapping(value = "/passe/lista")
	public String telaLista(Model model, @SessionAttribute("user")Usuario usuario) {
		model.addAttribute("listagem", passeService.obterLista(usuario));

		return "passe/lista";
	}

	@GetMapping(value = "/passe/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		passeService.excluir(id);

		return "redirect:/passe/lista";
	}

	@GetMapping(value = "/passe")
	public String telaCadastro() {
		return "/passe/cadastro";
	}

	@PostMapping(value = "/passe")
	public String incluir(Passe passe, @SessionAttribute("user") Usuario usuario) {
		passe.setUsuario(usuario);
		passeService.incluir(passe);

		return "redirect:/passe/lista";
	}

}
