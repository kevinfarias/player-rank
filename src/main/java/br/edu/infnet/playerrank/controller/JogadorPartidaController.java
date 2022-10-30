package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class JogadorPartidaController {
    private static Map<Integer, JogadorPartida> mapa = new HashMap<Integer, JogadorPartida>();
	private static Integer id = 1;

	public static void incluir(JogadorPartida jogadorpartida) {
		jogadorpartida.setId(id++);
		mapa.put(jogadorpartida.getId(), jogadorpartida);

		System.out.println("> " + jogadorpartida);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<JogadorPartida> obterLista(){
		return mapa.values();
	}

	@GetMapping(value = "/jogadorpartida/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "jogadorpartida/lista";
	}

	@GetMapping(value = "/jogadorpartida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/jogadorpartida/lista";
	}
}
