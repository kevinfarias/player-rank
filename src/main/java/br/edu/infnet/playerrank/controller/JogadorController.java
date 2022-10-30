package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Jogador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class JogadorController {
    private static ArrayList<Jogador> listagem = new ArrayList<Jogador>();

    public static void incluir(Jogador drible) {
        listagem.add(drible);
    }

    @GetMapping(value = "/jogador/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", listagem);

        return "jogador/lista";
    }
}
