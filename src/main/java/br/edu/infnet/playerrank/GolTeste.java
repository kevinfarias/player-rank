package br.edu.infnet.playerrank;

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
    }
}
