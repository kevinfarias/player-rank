package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Passe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PasseController {
    private static ArrayList<Passe> listagem = new ArrayList<Passe>();

    public static void incluir(Passe drible) {
        listagem.add(drible);
    }

    @GetMapping(value = "/passe/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", listagem);

        return "passe/lista";
    }
}
