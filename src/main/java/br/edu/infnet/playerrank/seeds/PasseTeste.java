package br.edu.infnet.playerrank.seeds;

import br.edu.infnet.playerrank.model.domain.JogadorPartida;
import br.edu.infnet.playerrank.model.domain.Passe;
import br.edu.infnet.playerrank.model.service.PasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class PasseTeste implements ApplicationRunner {
    @Autowired
    private PasseService passeService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Passe passe1 = new Passe();
//        passe1.setId(1);
//
//        JogadorPartida jogadorPartida = new JogadorPartida();
//        jogadorPartida.setId(1);
//
//        passe1.setJogadorPartida(jogadorPartida);
//        passe1.setAssistencia(true);
//        passe1.setCorreto(true);
//
//        System.out.println(passe1);
//
//        passeService.incluir(passe1);
//
//        Passe passe2 = new Passe();
//
//        passe2.setJogadorPartida(jogadorPartida);
//        passe2.setId(2);
//        passe2.setAssistencia(false);
//        passe2.setCorreto(true);
//
//        System.out.println(passe2);
//
//        passeService.incluir(passe2);
    }
}
