package br.edu.infnet.playerrank.model.service;

import java.util.Collection;

import br.edu.infnet.playerrank.clients.IEnderecoClient;
import br.edu.infnet.playerrank.clients.IUsuarioClient;
import br.edu.infnet.playerrank.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.playerrank.model.domain.Usuario;

@Service
public class UsuarioService {
	@Autowired
	private IEnderecoClient enderecoClient;

	@Autowired
	private IUsuarioClient usuarioClient;

	public void incluir(Usuario usuario) {
		usuarioClient.incluir(usuario);
	}

	public void excluir(Integer id) {
		usuarioClient.excluir(id);
	}

	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioClient.obterLista();
	}

	public Usuario validar(String email, String senha) {
		return usuarioClient.validar(email, senha);
	}

	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
}