package br.edu.infnet.playerrank.model.service;

import br.edu.infnet.playerrank.clients.IJogadorClient;
import br.edu.infnet.playerrank.model.domain.Jogador;
import br.edu.infnet.playerrank.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class JogadorService {
	@Autowired
	private IJogadorClient jogadorClient;

	public void incluir(Jogador drible) {
		jogadorClient.incluir(drible);
	}

	public void excluir(Integer id) {
		jogadorClient.excluir(id);
	}

	public Collection<Jogador> obterLista(Usuario usuario) {
		return (Collection<Jogador>) jogadorClient.obterLista(usuario.getId());
	}

	public Optional<Jogador> buscar(Integer id) { return jogadorClient.visualizar(id); }
}