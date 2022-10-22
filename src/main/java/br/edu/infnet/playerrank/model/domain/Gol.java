package br.edu.infnet.playerrank.model.domain;

import br.edu.infnet.playerrank.model.domain.enums.TipoDeGol;

public class Gol extends Acao {
    public TipoDeGol tipo;
    public boolean decisivo;
    public float dificuldade;

    @Override
    public String toString() {
        return tipo + ";" + (decisivo ? "decisivo" : "") + ";" + dificuldade;
    }
}
