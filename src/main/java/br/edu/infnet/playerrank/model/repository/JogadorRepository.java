package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Jogador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Integer> {
}
