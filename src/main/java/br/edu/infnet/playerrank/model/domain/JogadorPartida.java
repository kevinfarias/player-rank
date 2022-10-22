package br.edu.infnet.playerrank.model.domain;


public class JogadorPartida {
    public int codigo;
    public Partida partida;
    public boolean vencedor;
    public Jogador jogador;
    public float pontos_total;

    @Override
    public String toString() {
        return partida + ";" + vencedor + ";" + jogador + ";" + pontos_total;
    }
}
