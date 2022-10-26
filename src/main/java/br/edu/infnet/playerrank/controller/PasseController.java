package br.edu.infnet.playerrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasseController {
    @GetMapping(value = "/passe/lista")
    public String telaLista() {
        return "passe/lista";
    }
}
