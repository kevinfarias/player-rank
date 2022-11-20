package br.edu.infnet.apipartida.model.repository;

import br.edu.infnet.apipartida.model.domain.Partida;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidaRepository extends CrudRepository<Partida, Integer> {
    @Query("from Partida partida where partida.usuario.id = :userId")
    List<Partida> obterLista(Integer userId);
}
