package br.edu.infnet.apiusuario.controller;

import br.edu.infnet.apiusuario.model.domain.Usuario;
import br.edu.infnet.apiusuario.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController
{
    @Autowired UsuarioService usuarioService;

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Usuario usuario) {
        usuarioService.incluir(usuario);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        usuarioService.excluir(id);
    }

    @GetMapping(value = "/listar")
    public List<Usuario> obterLista() {
        return (List<Usuario>) usuarioService.obterLista();
    }

    @PostMapping(value = "/validar")
    public Usuario validar(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.validar(email, senha);
    }
}
