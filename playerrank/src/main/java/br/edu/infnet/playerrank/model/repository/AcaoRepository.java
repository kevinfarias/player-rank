package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Acao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcaoRepository extends CrudRepository<Acao, Integer> {
}
