package br.edu.infnet.playerrank.model.service;

import java.util.Collection;

import br.edu.infnet.playerrank.clients.IEnderecoClient;
import br.edu.infnet.playerrank.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private IEnderecoClient enderecoClient;

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioRepository.findAll();
	}

	public Usuario validar(String email, String senha) {
		Usuario usuario = usuarioRepository.findByEmail(email);

		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}

		return null;
	}

	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
}