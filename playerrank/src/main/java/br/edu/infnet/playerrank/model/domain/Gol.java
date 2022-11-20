package br.edu.infnet.playerrank.model.domain;

import br.edu.infnet.playerrank.model.domain.enums.TipoDeGol;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tgol")
public class Gol extends Acao {
    private TipoDeGol tipo;

    private boolean decisivo;

    private float dificuldade;

    @Override
    public String toString() {
        return super.toString() + ";" + tipo + ";" + (decisivo ? "decisivo" : "") + ";" + dificuldade;
    }

    public TipoDeGol getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeGol tipo) {
        this.tipo = tipo;
    }

    public boolean isDecisivo() {
        return decisivo;
    }

    public void setDecisivo(boolean decisivo) {
        this.decisivo = decisivo;
    }

    public float getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(float dificuldade) {
        this.dificuldade = dificuldade;
    }

}
