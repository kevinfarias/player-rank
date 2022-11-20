package br.edu.infnet.playerrank.seeds;

import br.edu.infnet.playerrank.model.domain.Drible;
import br.edu.infnet.playerrank.model.domain.JogadorPartida;
import br.edu.infnet.playerrank.model.repository.DribleRepository;
import br.edu.infnet.playerrank.model.service.DribleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(7)
public class DribleTeste implements ApplicationRunner {
    @Autowired
    private DribleService dribleService;

    @Autowired
    private DribleRepository dribleRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (dribleRepository.count() > 0) {
            return;
        }

        Drible drible1 = new Drible();
        drible1.setId(1);
        drible1.setNome("Drible");
        drible1.setGerouFalta(true);

//        JogadorPartida jogadorPartida = new JogadorPartida();
//        jogadorPartida.setId(1);
//        drible1.setJogadorPartida(jogadorPartida);
//
        dribleService.incluir(drible1);
//
//        System.out.println(drible1);
//
//        Drible drible2 = new Drible();
//        drible2.setId(2);
//        drible2.setGerouFalta(false);
//
//        drible2.setJogadorPartida(jogadorPartida);
//
//        dribleService.incluir(drible2);
//
//        System.out.println(drible2);
    }
}
