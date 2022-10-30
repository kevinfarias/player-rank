package br.edu.infnet.playerrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @GetMapping(value = "/")
    public ModelAndView telaHome() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("version", "0.1");

        return mav;
    }
}
