package br.edu.infnet.playerrank.model.domain;

public class Drible extends Acao {
    private boolean completo;

    private boolean gerou_falta;

    public boolean isCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }

    public boolean gerouFalta() {
        return gerou_falta;
    }

    public void setGerouFalta(boolean gerou_falta) {
        this.gerou_falta = gerou_falta;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + (completo ? "completo" : "nao-completo") + ";" + (gerou_falta ? "gerou-falta" : "nao-gerou-falta");
    }

}
