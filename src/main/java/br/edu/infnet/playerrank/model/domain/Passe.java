package br.edu.infnet.playerrank.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tpasse")
public class Passe extends Acao {
    private boolean correto;

    private boolean assistencia;


    @Override
    public String toString() {
        return super.toString() + ";" + (correto ? "correto" : "incorreto") + ";" + (assistencia ? "assistencia" : "");
    }

    public boolean isCorreto() {
        return correto;
    }

    public void setCorreto(boolean correto) {
        this.correto = correto;
    }

    public boolean gerouAssistencia() {
        return assistencia;
    }

    public void setAssistencia(boolean assistencia) {
        this.assistencia = assistencia;
    }
}
