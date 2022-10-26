package br.edu.infnet.playerrank.model.domain;


import java.util.ArrayList;
import java.util.List;

public class JogadorPartida {
    private int codigo;

    private Partida partida;

    private boolean vencedor;

    private Jogador jogador;

    private float pontos_total;

    private List<Acao> acoes;

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

    public float getPontosTotal() {
        return pontos_total;
    }

    public void setPontosTotal(float pontos_total) {
        this.pontos_total = pontos_total;
    }

    @Override
    public String toString() {
        return partida + ";" + vencedor + ";" + jogador + ";" + pontos_total + ";Jogador: " + jogador + ";Acoes: " + acoes.size();
    }

    public List<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(List<Acao> acoes) {
        this.acoes = acoes;
    }

    public JogadorPartida() {
        this.acoes = new ArrayList<Acao>();
    }

}
