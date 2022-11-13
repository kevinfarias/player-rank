package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.JogadorPartida;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorPartidaRepository extends CrudRepository<JogadorPartida, Integer> {
    @Query("from JogadorPartida jp where jp.usuario.id = :userId")
    List<JogadorPartida> obterLista(Integer userId);
}
