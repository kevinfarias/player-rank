package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Drible;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DribleRepository extends CrudRepository<Drible, Integer> {
}
