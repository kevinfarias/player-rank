package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Partida;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PartidaController {
	private static Map<Integer, Partida> mapa = new HashMap<Integer, Partida>();
	private static Integer id = 1;

	public static void incluir(Partida partida) {
		partida.setId(id++);
		mapa.put(partida.getId(), partida);

		System.out.println("> " + partida);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Partida> obterLista(){
		return mapa.values();
	}

	@GetMapping(value = "/partida/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "partida/lista";
	}

	@GetMapping(value = "/partida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/partida/lista";
	}
}
