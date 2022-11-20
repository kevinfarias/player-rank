package br.edu.infnet.apijogador.model.repository;

import br.edu.infnet.apijogador.model.domain.Jogador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Integer> {
    @Query("from Jogador j where j.usuario.id = :userId")
    List<Jogador> obterLista(Integer userId);
}
