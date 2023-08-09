package com.github.thiago_v_a.poo_2023_01.t22;

import java.util.Date;
import java.util.UUID;

public class Bilhete {
    public String Nome = "";
    public double Valor;
    public UUID NumSerie;
    public Date DiaHoraEvento;
    private TipoBilhete TipoBilhete;

    public Bilhete(String nome, double valor, UUID numSerie, Date diaHoraEvento, TipoBilhete tipoBilhete) {
        if (nome == null) {
            this.Nome = "Parque de diversões Beto Carreiro";
        }

        this.Nome = nome;
        this.Valor = valor;
        this.NumSerie = numSerie;
        this.DiaHoraEvento = diaHoraEvento;
        this.TipoBilhete = tipoBilhete;
    }

    public Bilhete(com.github.thiago_v_a.poo_2023_01.t22.TipoBilhete tipoBilhete, double valor) {
    }

    @Override
    public String toString() {
        return "Nome: " + Nome +
                "\nValor: " + Valor +
                "\nData e hora: " + DiaHoraEvento +
                "\nNº bilhete: " + NumSerie;
    }


    public void setVendido(boolean b) {
    }
}
