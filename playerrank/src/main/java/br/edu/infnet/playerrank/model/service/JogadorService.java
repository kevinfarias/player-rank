package br.edu.infnet.playerrank.model.service;

import br.edu.infnet.playerrank.model.domain.Jogador;
import br.edu.infnet.playerrank.model.domain.Partida;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.repository.JogadorRepository;
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

	public Collection<Jogador> obterLista(Usuario usuario) {
		return (Collection<Jogador>) jogadorRepository.obterLista(usuario.getId());
	}

	public Optional<Jogador> buscar(Integer id) { return jogadorRepository.findById(id); }
}