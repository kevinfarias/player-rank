package br.edu.infnet.playerrank.model.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tacao")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Acao {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    private Float pontos;

    @ManyToMany(mappedBy = "acoes")
	private List<JogadorPartida> jogador_partida;

	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<JogadorPartida> getJogadorPartida() {
        return jogador_partida;
    }

    public void setJogadorPartida(List<JogadorPartida> jogador_partida) {
        this.jogador_partida = jogador_partida;
    }

    public String toString() {
        return nome + ";" + pontos;
    }
}
