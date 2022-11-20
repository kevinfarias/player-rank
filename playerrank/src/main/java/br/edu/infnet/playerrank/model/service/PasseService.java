package br.edu.infnet.playerrank.model.service;

import br.edu.infnet.playerrank.model.domain.Passe;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.repository.PasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PasseService {
	@Autowired
	private PasseRepository passeRepository;

	public void incluir(Passe drible) {
		passeRepository.save(drible);
	}

	public void excluir(Integer id) {
		passeRepository.deleteById(id);
	}

	public Collection<Passe> obterLista(Usuario usuario){
		return (Collection<Passe>) passeRepository.obterLista(usuario.getId());
	}
}