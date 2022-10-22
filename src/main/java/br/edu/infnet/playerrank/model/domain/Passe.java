package br.edu.infnet.playerrank.model.domain;

public class Passe extends Acao {
    public boolean correto;
    public boolean assistencia;

    @Override
    public String toString() {
        return (correto ? "correto" : "incorreto") + ";" + (assistencia ? "assistencia" : "");
    }
}
