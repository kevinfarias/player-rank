package br.edu.infnet.playerrank.model.domain.enums;

public enum TipoDeGol {
    FALTA("Falta"),
    PENALTI("Penalti"),
    CABECA("Cabeça"),
    CHUTE("Chute");

    public final String label;

    private TipoDeGol(String label) {
        this.label = label;
    }
}
