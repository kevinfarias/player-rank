package br.edu.infnet.playerrank.model.repository;

import br.edu.infnet.playerrank.model.domain.Drible;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DribleRepository extends CrudRepository<Drible, Integer> {
    @Query("from Drible drible where drible.usuario.id = :userId")
    List<Drible> obterLista(Integer userId);
}
