package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Drible;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class DribleController {
    private static ArrayList<Drible> listagem = new ArrayList<Drible>();

    public static void incluir(Drible drible) {
        listagem.add(drible);
    }

    @GetMapping(value = "/drible/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", listagem);

        return "drible/lista";
    }
}
