package br.edu.infnet.playerrank.model.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JogadorTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Jogador jogador1 = new Jogador();
        jogador1.setCodigo(1);
        jogador1.setCidade("Tapejara");
        jogador1.setNome("Kevin Farias");
        jogador1.setCpf("111.111.111-11");
        jogador1.setEmail("kevin.farias.dev@gmail.com");

        System.out.println(jogador1);

        Jogador jogador2 = new Jogador();
        jogador2.setCodigo(2);
        jogador2.setCidade("Charrua");
        jogador2.setNome("Joao da Silva");
        jogador2.setCpf("111.112.112-11");
        jogador2.setEmail("abcd@gmail.com");

        System.out.println(jogador2);
    }
}
