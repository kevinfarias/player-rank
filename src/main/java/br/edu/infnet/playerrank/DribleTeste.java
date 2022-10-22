package br.edu.infnet.playerrank;

import br.edu.infnet.playerrank.model.domain.Drible;
import br.edu.infnet.playerrank.model.domain.JogadorPartida;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DribleTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Drible drible = new Drible();
        drible.gerou_falta = true;

        System.out.println(drible);
    }
}
