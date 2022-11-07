package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.JogadorPartida;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorPartidaRepository extends CrudRepository<JogadorPartida, Integer> {
}
