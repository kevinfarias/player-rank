package br.edu.infnet.playerrank.model.domain;

abstract class Acao {
    private int codigo;
    private String nome;

    private Float pontos;

    private JogadorPartida jogador_partida;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPontos() {
        return pontos;
    }

    public void setPontos(Float pontos) {
        this.pontos = pontos;
    }

    public JogadorPartida getJogadorPartida() {
        return jogador_partida;
    }

    public void setJogadorPartida(JogadorPartida jogador_partida) {
        this.jogador_partida = jogador_partida;
    }

    public String toString() {
        return nome + ";" + pontos;
    }
}
