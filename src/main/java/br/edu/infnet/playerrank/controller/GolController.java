package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Gol;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class GolController {
    private static ArrayList<Gol> listagem = new ArrayList<Gol>();

    public static void incluir(Gol gol) {
        listagem.add(gol);
    }

    @GetMapping(value = "/gol/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", listagem);

        return "gol/lista";
    }
}
