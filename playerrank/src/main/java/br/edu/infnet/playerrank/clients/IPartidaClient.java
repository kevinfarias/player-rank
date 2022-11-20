package br.edu.infnet.playerrank.clients;

import br.edu.infnet.playerrank.model.domain.Partida;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient(url = "localhost:8083/api/partida", name = "partidaClient")
public interface IPartidaClient {
    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Partida jogador);

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id);

    @GetMapping(value = "/listar")
    public List<Partida> obterLista(@RequestParam Integer userId);

    @GetMapping(value = "/{id}/visualizar")
    public Optional<Partida> visualizar(@RequestParam Integer id);
}
