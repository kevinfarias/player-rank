package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Gol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GolRepository extends CrudRepository<Gol, Integer> {
}
