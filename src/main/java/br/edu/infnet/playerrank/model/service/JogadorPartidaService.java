package br.edu.infnet.playerrank.model.service;

import br.edu.infnet.playerrank.model.domain.JogadorPartida;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.repository.JogadorPartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class JogadorPartidaService {
	@Autowired
	private JogadorPartidaRepository jogadorPartidaRepository;

	public void incluir(JogadorPartida drible) {
		jogadorPartidaRepository.save(drible);
	}

	public void excluir(Integer id) {
		jogadorPartidaRepository.deleteById(id);
	}

	public Collection<JogadorPartida> obterLista(Usuario usuario){
		return (Collection<JogadorPartida>) jogadorPartidaRepository.obterLista(usuario.getId());
	}
}