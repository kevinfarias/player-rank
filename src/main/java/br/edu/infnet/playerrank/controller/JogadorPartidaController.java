package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogadorPartidaController {
    @GetMapping(value = "/jogadorpartida/lista")
    public String telaLista() {
        return "jogadorpartida/lista";
    }
}
