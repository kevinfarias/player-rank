package br.edu.infnet.playerrank.seeds;

import br.edu.infnet.playerrank.model.domain.*;
import br.edu.infnet.playerrank.model.service.JogadorPartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@Order(9)
public class JogadorPartidaTeste implements ApplicationRunner {
    @Autowired
    private JogadorPartidaService jogadorPartidaService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Jogador jogador = new Jogador();
        jogador.setCPF("111.111.111-11");
        jogador.setNome("Kevin Farias");
        jogador.setId(1);

        JogadorPartida jogadorPartida1 = new JogadorPartida();
        jogadorPartida1.setJogador(jogador);
        jogadorPartida1.setVencedor(true);
        jogadorPartida1.setId(1);

        Drible drible = new Drible();
        drible.setId(1);
        drible.setGerouFalta(true);
        drible.setNome("drible");

        Passe passe = new Passe();
        passe.setId(1);
        passe.setNome("lançamento");
        passe.setCorreto(true);

        Gol gol = new Gol();
        gol.setId(1);
        gol.setDificuldade(10);
        gol.setNome("Gol de placa");

        List<Acao> acoes = new ArrayList<Acao>();
        acoes.add(drible);
        acoes.add(passe);
        acoes.add(gol);

        jogadorPartida1.setAcoes(acoes);

        Partida partida1 = new Partida();
        partida1.setId(1);

        jogadorPartida1.setPartida(partida1);

        jogadorPartida1.setPontosTotal(10);

        jogadorPartidaService.incluir(jogadorPartida1);

        System.out.println(jogadorPartida1);
    }
}
