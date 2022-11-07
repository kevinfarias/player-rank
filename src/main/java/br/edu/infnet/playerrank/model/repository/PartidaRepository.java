package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Partida;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends CrudRepository<Partida, Integer> {
}
