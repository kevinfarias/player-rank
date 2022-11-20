package br.edu.infnet.apipartida.controller;

import br.edu.infnet.apipartida.model.domain.Partida;
import br.edu.infnet.apipartida.model.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/partida")
public class PartidaController
{
    @Autowired
    PartidaService partidaService;

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Partida partida) {
        partidaService.incluir(partida);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        partidaService.excluir(id);
    }

    @GetMapping(value = "/listar")
    public List<Partida> obterLista(@RequestParam int userId) {
        return (List<Partida>) partidaService.obterLista(userId);
    }

    @GetMapping(value = "/{id}/visualizar")
    public Optional<Partida> visualizar(@PathVariable Integer id) {
        return partidaService.buscar(id);
    }
}
