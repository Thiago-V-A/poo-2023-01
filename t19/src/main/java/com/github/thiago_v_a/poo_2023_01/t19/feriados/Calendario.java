package com.github.thiago_v_a.poo_2023_01.t19.feriados;

public class Calendario {
    private short ano;
    private Evento feriado;
    private Evento dataImportante;

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public Evento getFeriado() {
        return feriado;
    }

    public void setFeriado(Evento feriado) {
        this.feriado = feriado;
    }

    public Evento getDataImportante() {
        return dataImportante;
    }

    public void setDataImportante(Evento dataImportante) {
        this.dataImportante = dataImportante;
    }
}

