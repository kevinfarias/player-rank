package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Endereco;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.service.PasseService;
import br.edu.infnet.playerrank.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("user")
@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;


	@GetMapping(value = "/usuario/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", usuarioService.obterLista());

		return "usuario/lista";
	}

	@GetMapping(value = "/usuario")
	public String telaCadastro(Model model) {
		model.addAttribute("endereco", new Endereco());
		return "usuario/cadastro";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		usuarioService.incluir(usuario);

		return "redirect:/usuario/lista";
	}

	@GetMapping(value = "/usuario/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		usuarioService.excluir(id);

		return "redirect:/usuario/lista";
	}

	@PostMapping(value = "/cep")
	public String obterCep(Model model, @RequestParam String cep) {
		model.addAttribute("endereco", usuarioService.obterCep(cep));
		return "usuario/cadastro";
	}
}
