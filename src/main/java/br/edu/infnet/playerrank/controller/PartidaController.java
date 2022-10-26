package br.edu.infnet.playerrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PartidaController {
    @GetMapping(value = "/partida/lista")
    public String telaLista() {
        return "partida/lista";
    }
}
