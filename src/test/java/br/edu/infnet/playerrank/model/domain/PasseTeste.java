package br.edu.infnet.playerrank.model.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PasseTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Passe passe1 = new Passe();
        passe1.setAssistencia(true);
        passe1.setCorreto(true);

        System.out.println(passe1);

        Passe passe2 = new Passe();
        passe2.setAssistencia(false);
        passe2.setCorreto(true);

        System.out.println(passe2);
    }
}
