package br.edu.infnet.playerrank.model.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JogadorPartidaTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        JogadorPartida jogadorPartida1 = new JogadorPartida();
        jogadorPartida1.setVencedor(true);
        jogadorPartida1.setPontosTotal(10);

        System.out.println(jogadorPartida1);

        JogadorPartida jogadorPartida2 = new JogadorPartida();
        jogadorPartida2.setVencedor(false);
        jogadorPartida2.setPontosTotal(20);

        System.out.println(jogadorPartida2);
    }
}
