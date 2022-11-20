package br.edu.infnet.playerrank.seeds;

import br.edu.infnet.playerrank.model.domain.Jogador;
import br.edu.infnet.playerrank.model.repository.JogadorRepository;
import br.edu.infnet.playerrank.model.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class JogadorTeste implements ApplicationRunner {
    @Autowired
    private JogadorService jogadorService;

    @Autowired
    private JogadorRepository jogadorRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (jogadorRepository.count() > 0) {
            return;
        }

        Jogador jogador1 = new Jogador();
        jogador1.setId(1);
        jogador1.setCidade("Tapejara");
        jogador1.setNome("Kevin Farias");
        jogador1.setCPF("111.111.111-11");
        jogador1.setEmail("kevin.farias.dev@gmail.com");

        jogadorService.incluir(jogador1);

        System.out.println(jogador1);

        Jogador jogador2 = new Jogador();
        jogador2.setId(2);
        jogador2.setCidade("Charrua");
        jogador2.setNome("Joao da Silva");
        jogador2.setCPF("111.112.112-11");
        jogador2.setEmail("abcd@gmail.com");

        jogadorService.incluir(jogador2);

        System.out.println(jogador2);
    }
}
