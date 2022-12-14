package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Passe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PasseRepository extends CrudRepository<Passe, Integer> {
    @Query("from Passe passe where passe.usuario.id = :userId")
    List<Passe> obterLista(Integer userId);
}
