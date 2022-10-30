package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Gol;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class GolController {

    private static Map<Integer, Gol> mapa = new HashMap<Integer, Gol>();
	private static Integer id = 1;

	public static void incluir(Gol gol) {
		gol.setId(id++);
		mapa.put(gol.getId(), gol);

		System.out.println("> " + gol);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Gol> obterLista(){
		return mapa.values();
	}

	@GetMapping(value = "/gol/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "gol/lista";
	}

	@GetMapping(value = "/gol/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);

		return "redirect:/gol/lista";
	}
}
