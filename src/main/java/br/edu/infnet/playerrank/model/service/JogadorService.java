package br.edu.infnet.playerrank.model.service;

import br.edu.infnet.playerrank.model.domain.Jogador;
import br.edu.infnet.playerrank.model.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

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

	public Collection<Jogador> obterLista(){
		return (Collection<Jogador>) jogadorRepository.findAll();
	}
}