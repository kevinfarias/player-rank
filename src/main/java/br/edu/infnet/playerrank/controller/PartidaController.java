package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Partida;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PartidaController {
    private static ArrayList<Partida> listagem = new ArrayList<Partida>();

    public static void incluir(Partida drible) {
        listagem.add(drible);
    }

    @GetMapping(value = "/partida/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", listagem);

        return "partida/lista";
    }
}
