package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Passe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PasseController {
    private static Map<Integer, Passe> mapa = new HashMap<Integer, Passe>();
	private static Integer id = 1;

	public static void incluir(Passe passe) {
		passe.setId(id++);
		mapa.put(passe.getId(), passe);

		System.out.println("> " + passe);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Passe> obterLista(){
		return mapa.values();
	}

	@GetMapping(value = "/passe/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "passe/lista";
	}

	@GetMapping(value = "/passe/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/passe/lista";
	}
}
