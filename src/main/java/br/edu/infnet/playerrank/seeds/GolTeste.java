package br.edu.infnet.playerrank.seeds;

import br.edu.infnet.playerrank.controller.GolController;
import br.edu.infnet.playerrank.model.domain.Gol;
import br.edu.infnet.playerrank.model.domain.enums.TipoDeGol;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class GolTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Inserindo gols");

        Gol gol1 = new Gol();
        gol1.setId(1);
        gol1.setNome("Gol de cabeça");
        gol1.setTipo(TipoDeGol.CABECA);
        gol1.setDecisivo(true);
        gol1.setDificuldade(7);

        GolController.incluir(gol1);

        System.out.println("Gol - " + gol1);

        Gol gol2 = new Gol();
        gol2.setId(2);
        gol2.setNome("Gol de penalti");
        gol2.setTipo(TipoDeGol.PENALTI);
        gol2.setDecisivo(false);
        gol2.setDificuldade(1);

        GolController.incluir(gol2);

        System.out.println("Gol - " + gol2);

        Gol gol3 = new Gol();
        gol3.setId(3);
        gol3.setNome("Gol de falta");
        gol3.setTipo(TipoDeGol.FALTA);
        gol3.setDecisivo(false);
        gol3.setDificuldade(6);

        GolController.incluir(gol3);

        System.out.println("Gol - " + gol3);

        Gol gol4 = new Gol();
        gol4.setId(4);
        gol4.setNome("Gol comum");
        gol4.setTipo(TipoDeGol.CHUTE);
        gol4.setDecisivo(false);
        gol4.setDificuldade(5);

        GolController.incluir(gol4);

        System.out.println("Gol - " + gol4);
    }
}
