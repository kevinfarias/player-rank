package br.edu.infnet.playerrank.model.domain;

import java.util.Date;

public class Partida {
    private String local;

    private Date data;

    private String time1;

    private String time2;

    @Override
    public String toString() {
        return local + ";" + data + ";" + time1 + ";" + time2;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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
}
