package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Partida;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidaRepository extends CrudRepository<Partida, Integer> {
    @Query("from Partida partida where partida.usuario.id = :userId")
    List<Partida> obterLista(Integer userId);
}
