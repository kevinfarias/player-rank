package br.edu.infnet.playerrank.model.service;

import br.edu.infnet.playerrank.clients.IPartidaClient;
import br.edu.infnet.playerrank.model.domain.Partida;
import br.edu.infnet.playerrank.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PartidaService {
	@Autowired
	IPartidaClient partidaClient;

	public void incluir(Partida partida) {
		partidaClient.incluir(partida);
	}

	public void excluir(Integer id) {
		partidaClient.excluir(id);
	}

	public Optional<Partida> buscar(Integer id) { return partidaClient.visualizar(id); }

	public Collection<Partida> obterLista(Usuario usuario){
		return (Collection<Partida>) partidaClient.obterLista(usuario.getId());
	}
}