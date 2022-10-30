package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Drible;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DribleController {
    private static Map<Integer, Drible> mapa = new HashMap<Integer, Drible>();
	private static Integer id = 1;

	public static void incluir(Drible drible) {
		drible.setId(id++);
		mapa.put(drible.getId(), drible);

		System.out.println("> " + drible);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Drible> obterLista(){
		return mapa.values();
	}

	@GetMapping(value = "/drible/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "drible/lista";
	}

	@GetMapping(value = "/drible/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);

		return "redirect:/drible/lista";
	}
}
