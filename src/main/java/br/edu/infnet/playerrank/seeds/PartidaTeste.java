package br.edu.infnet.playerrank.seeds;

import br.edu.infnet.playerrank.model.domain.Partida;
import br.edu.infnet.playerrank.model.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Order(2)
public class PartidaTeste implements ApplicationRunner {
    @Autowired
    private PartidaService partidaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Partida partida1 = new Partida();
        partida1.setId(1);
        partida1.setLocal("Salao comunitario tapejara");
        partida1.setData(LocalDateTime.now());
        partida1.setTime1("Casados");
        partida1.setTime2("Solteiros");

        partidaService.incluir(partida1);

        System.out.println(partida1);
    }
}
