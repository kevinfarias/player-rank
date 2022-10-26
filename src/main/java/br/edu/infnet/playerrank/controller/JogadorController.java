package br.edu.infnet.playerrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogadorController {
    @GetMapping(value = "/jogador/lista")
    public String telaLista() {
        return "jogador/lista";
    }
}
