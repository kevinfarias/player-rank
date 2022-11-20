package br.edu.infnet.apijogador.controller;

import br.edu.infnet.apijogador.model.domain.Jogador;
import br.edu.infnet.apijogador.model.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jogador")
public class JogadorController
{
    @Autowired
    JogadorService jogadorService;

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Jogador jogador) {
        jogadorService.incluir(jogador);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        jogadorService.excluir(id);
    }

    @GetMapping(value = "/listar")
    public List<Jogador> obterLista(@RequestParam int userId) {
        return (List<Jogador>) jogadorService.obterLista(userId);
    }

    @GetMapping(value = "/{id}/visualizar")
    public Optional<Jogador> visualizar(@PathVariable Integer id) {
        return jogadorService.buscar(id);
    }
}
