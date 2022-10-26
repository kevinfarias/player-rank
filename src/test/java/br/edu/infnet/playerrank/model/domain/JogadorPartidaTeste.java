package br.edu.infnet.playerrank.model.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JogadorPartidaTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Jogador jogador = new Jogador();
        jogador.setCpf("111.111.111-11");
        jogador.setNome("Kevin Farias");
        jogador.setCodigo(123);

        JogadorPartida jogadorPartida1 = new JogadorPartida();
        jogadorPartida1.setJogador(jogador);
        jogadorPartida1.setVencedor(true);

        Drible drible = new Drible();
        drible.setGerouFalta(true);
        drible.setNome("drible");

        Passe passe = new Passe();
        passe.setNome("lançamento");
        passe.setCorreto(true);

        Gol gol = new Gol();
        gol.setDificuldade(10);
        gol.setNome("Gol de place");

        List<Acao> acoes = new ArrayList<Acao>();
        acoes.add(drible);
        acoes.add(passe);
        acoes.add(gol);

        jogadorPartida1.setAcoes(acoes);
        jogadorPartida1.setPontosTotal(10);

        System.out.println(jogadorPartida1);

        JogadorPartida jogadorPartida2 = new JogadorPartida();
        jogadorPartida2.setVencedor(false);
        jogadorPartida2.setPontosTotal(20);

        System.out.println(jogadorPartida2);
    }
}
