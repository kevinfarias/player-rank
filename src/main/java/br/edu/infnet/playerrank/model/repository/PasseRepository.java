package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Passe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasseRepository extends CrudRepository<Passe, Integer> {
}
