package br.edu.infnet.playerrank.model.domain;

import java.util.Date;

public class Partida {
    public String local;
    public Date data;
    public String time1;
    public String time2;

    @Override
    public String toString() {
        return local + ";" + data + ";" + time1 + ";" + time2;
    }
}
