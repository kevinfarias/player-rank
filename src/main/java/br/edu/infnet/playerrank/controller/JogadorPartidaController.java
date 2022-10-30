package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class JogadorPartidaController {
    private static ArrayList<JogadorPartida> listagem = new ArrayList<JogadorPartida>();

    public static void incluir(JogadorPartida jogadorPartida) {
        listagem.add(jogadorPartida);
    }

    @GetMapping(value = "/jogadorpartida/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", listagem);

        return "jogadorpartida/lista";
    }
}
