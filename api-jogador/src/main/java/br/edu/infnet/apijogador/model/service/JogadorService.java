package br.edu.infnet.apijogador.model.service;

import br.edu.infnet.apijogador.model.domain.Jogador;
import br.edu.infnet.apijogador.model.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class JogadorService {
	@Autowired
	private JogadorRepository jogadorRepository;

	public void incluir(Jogador drible) {
		jogadorRepository.save(drible);
	}

	public void excluir(Integer id) {
		jogadorRepository.deleteById(id);
	}

	public Collection<Jogador> obterLista(int usuarioId) {
		return (Collection<Jogador>) jogadorRepository.obterLista(usuarioId);
	}

	public Optional<Jogador> buscar(Integer id) { return jogadorRepository.findById(id); }
}