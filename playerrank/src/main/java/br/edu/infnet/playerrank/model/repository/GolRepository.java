package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Gol;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GolRepository extends CrudRepository<Gol, Integer> {
    @Query("from Gol gol where gol.usuario.id = :userId")
    List<Gol> obterLista(Integer userId);
}
