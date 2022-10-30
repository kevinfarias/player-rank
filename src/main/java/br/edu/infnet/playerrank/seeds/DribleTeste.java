package br.edu.infnet.playerrank.seeds;

import br.edu.infnet.playerrank.controller.DribleController;
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
        drible1.setId(1);
        drible1.setNome("Drible");
        drible1.setGerouFalta(true);

        DribleController.incluir(drible1);

        System.out.println(drible1);

        Drible drible2 = new Drible();
        drible2.setId(2);
        drible2.setGerouFalta(false);

        DribleController.incluir(drible2);

        System.out.println(drible2);
    }
}
