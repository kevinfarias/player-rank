package br.edu.infnet.playerrank.model.domain;

import br.edu.infnet.playerrank.model.domain.Drible;
import br.edu.infnet.playerrank.model.domain.JogadorPartida;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DribleTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Drible drible1 = new Drible();
        drible1.gerou_falta = true;

        System.out.println(drible1);

        Drible drible2 = new Drible();
        drible2.gerou_falta = false;

        System.out.println(drible2);
    }
}
