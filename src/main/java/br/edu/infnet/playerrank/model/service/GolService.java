package br.edu.infnet.playerrank.model.service;

import br.edu.infnet.playerrank.model.domain.Gol;
import br.edu.infnet.playerrank.model.repository.GolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GolService {
	@Autowired
	private GolRepository golRepository;

	public void incluir(Gol gol) {
		golRepository.save(gol);
	}

	public void excluir(Integer id) {
		golRepository.deleteById(id);
	}

	public Collection<Gol> obterLista(){
		return (Collection<Gol>) golRepository.findAll();
	}
}