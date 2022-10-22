package br.edu.infnet.playerrank.model.domain;

public class Drible extends Acao {
    public boolean completo;
    public boolean gerou_falta;

    @Override
    public String toString() {
        return (completo ? "completo" : "nao-completo") + ";" + (gerou_falta ? "gerou-falta" : "nao-gerou-falta");
    }
}
