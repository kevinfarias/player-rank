package br.edu.infnet.apipartida.model.service;

import br.edu.infnet.apipartida.model.domain.Partida;
import br.edu.infnet.apipartida.model.domain.Usuario;
import br.edu.infnet.apipartida.model.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PartidaService {
	@Autowired
	private PartidaRepository partidaRepository;

	public void incluir(Partida drible) {
		partidaRepository.save(drible);
	}

	public void excluir(Integer id) {
		partidaRepository.deleteById(id);
	}

	public Optional<Partida> buscar(Integer id) { return partidaRepository.findById(id); }

	public Collection<Partida> obterLista(int userId){
		return (Collection<Partida>) partidaRepository.obterLista(userId);
	}
}