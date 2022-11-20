package br.edu.infnet.playerrank.clients;

import br.edu.infnet.playerrank.model.domain.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "localhost:8081/api/usuario", name = "usuarioClient")
public interface IUsuarioClient {
    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Usuario usuario);

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id);

    @GetMapping(value = "/listar")
    public List<Usuario> obterLista();

    @PostMapping(value = "/validar")
    public Usuario validar(@RequestParam String email, @RequestParam String senha);
}
