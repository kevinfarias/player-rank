package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Gol;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GolController {
    @GetMapping(value = "/gol/lista")
    public String telaLista(Model model) {
        Gol g1 = new Gol();
        g1.setNome("gol 1");
        g1.setDificuldade(10);

        Gol g2 = new Gol();
        g2.setNome("gol 2");
        g2.setDificuldade(7);

        Gol g3 = new Gol();
        g3.setNome("gol 3");
        g3.setDificuldade(5);

        List<Gol> gols = new ArrayList<Gol>();
        gols.add(g1);
        gols.add(g2);
        gols.add(g3);

        model.addAttribute("listagem", gols);

        return "gol/lista";
    }
}
