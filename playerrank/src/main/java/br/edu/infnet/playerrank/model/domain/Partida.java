package br.edu.infnet.playerrank.model.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tpartida")
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String local;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDateTime data;

    private String time1;

    private String time2;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @Override
    public String toString() {
        return local + ";" + data + ";" + time1 + ";" + time2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public Partida() {
        data = LocalDateTime.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
