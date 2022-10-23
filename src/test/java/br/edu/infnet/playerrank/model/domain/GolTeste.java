package br.edu.infnet.playerrank.model.domain;

import br.edu.infnet.playerrank.model.domain.Gol;
import br.edu.infnet.playerrank.model.domain.enums.TipoDeGol;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class GolTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Gol gol1 = new Gol();
        gol1.tipo = TipoDeGol.CABECA;
        gol1.decisivo = true;
        gol1.dificuldade = 7;

        System.out.println("Gol - " + gol1);

        Gol gol2 = new Gol();
        gol2.tipo = TipoDeGol.PENALTI;
        gol2.decisivo = false
        gol2.dificuldade = 1;

        System.out.println("Gol - " + gol2);

        Gol gol3 = new Gol();
        gol3.tipo = TipoDeGol.FALTA;
        gol3.decisivo = false
        gol3.dificuldade = 6;

        System.out.println("Gol - " + gol3);

        Gol gol4 = new Gol();
        gol4.tipo = TipoDeGol.CHUTE;
        gol4.decisivo = false
        gol4.dificuldade = 5;

        System.out.println("Gol - " + gol4);
    }
}
