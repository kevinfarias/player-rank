package br.edu.infnet.playerrank.model.domain;

import java.time.LocalDateTime;

public class Partida {
    private String local;

    private LocalDateTime data;

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
}
