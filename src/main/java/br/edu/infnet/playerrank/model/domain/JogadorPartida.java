package br.edu.infnet.playerrank.model.domain;


public class JogadorPartida {
    private int codigo;

    private Partida partida;

    private boolean vencedor;

    private Jogador jogador;

    private float pontos_total;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public boolean isVencedor() {
        return vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public float getPontos_total() {
        return pontos_total;
    }

    public void setPontos_total(float pontos_total) {
        this.pontos_total = pontos_total;
    }

    @Override
    public String toString() {
        return partida + ";" + vencedor + ";" + jogador + ";" + pontos_total;
    }
}
