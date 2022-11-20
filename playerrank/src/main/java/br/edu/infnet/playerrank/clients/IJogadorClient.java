package br.edu.infnet.playerrank.clients;

import br.edu.infnet.playerrank.model.domain.Jogador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient(url = "localhost:8082/api/jogador", name = "jogadorClient")
public interface IJogadorClient {
    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Jogador jogador);

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id);

    @GetMapping(value = "/listar")
    public List<Jogador> obterLista(@RequestParam Integer userId);

    @GetMapping(value = "/{id}/visualizar")
    public Optional<Jogador> visualizar(@RequestParam Integer id);
}
