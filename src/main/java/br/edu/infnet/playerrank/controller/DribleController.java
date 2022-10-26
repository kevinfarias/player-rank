package br.edu.infnet.playerrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DribleController {
    @GetMapping(value = "/drible/lista")
    public String telaLista() {
        return "drible/lista";
    }
}
