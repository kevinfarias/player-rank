package br.edu.infnet.playerrank.model.service;

import br.edu.infnet.playerrank.model.domain.Drible;
import br.edu.infnet.playerrank.model.repository.DribleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DribleService {
	@Autowired
	private DribleRepository dribleRepository;

	public void incluir(Drible drible) {
		dribleRepository.save(drible);
	}

	public void excluir(Integer id) {
		dribleRepository.deleteById(id);
	}

	public Collection<Drible> obterLista(){
		return (Collection<Drible>) dribleRepository.findAll();
	}
}