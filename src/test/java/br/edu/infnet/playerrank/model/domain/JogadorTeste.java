package br.edu.infnet.playerrank.model.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JogadorTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Jogador jogador1 = new Jogador();
        jogador1.codigo = 1;
        jogador1.cidade = "Tapejara";
        jogador1.nome = "Kevin Farias";
        jogador1.cpf = "111.111.111-11";
        jogador1.email = "kevin.farias.dev@gmail.com";

        System.out.println(jogador1);

        Jogador jogador2 = new Jogador();
        jogador2.codigo = 2;
        jogador2.cidade = "Charrua";
        jogador2.nome = "Joao da Silva";
        jogador2.cpf = "111.112.112-11";
        jogador2.email = "abcd@gmail.com";

        System.out.println(jogador2);
    }
}
