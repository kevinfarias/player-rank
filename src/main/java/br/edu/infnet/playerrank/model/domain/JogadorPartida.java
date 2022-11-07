package br.edu.infnet.playerrank.model.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tjogadorpartida")
public class JogadorPartida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idPartida")
    private Partida partida;

    private boolean vencedor;

    @Transient
    private Jogador jogador;

    private float pontos_total;

    @Transient
    private List<Acao> acoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
