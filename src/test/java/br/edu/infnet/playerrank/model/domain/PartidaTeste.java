package br.edu.infnet.playerrank.model.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PartidaTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Partida partida1 = new Partida();
        partida1.local = "Salao comunitario tapejara";
        partida1.data = new Date();
        partida1.time1 = "Casados";
        partida1.time2 = "Solteiros";

        System.out.println(partida1);
    }
}
