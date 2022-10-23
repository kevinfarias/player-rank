package br.edu.infnet.playerrank.model.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PartidaTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Partida partida1 = new Partida();
        partida1.setLocal("Salao comunitario tapejara");
        partida1.setData(LocalDateTime.now());
        partida1.setTime1("Casados");
        partida1.setTime2("Solteiros");

        System.out.println(partida1);
    }
}
