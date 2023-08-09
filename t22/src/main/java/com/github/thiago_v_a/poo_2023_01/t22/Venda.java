package com.github.thiago_v_a.poo_2023_01.t22;

import java.util.Date;

public class Venda {
    private Date hora;
    private Date data;

    public Venda(Bilhete bilhete, Pessoa visitante, Date horario) {
    }

    public Date getHora() {

        return hora;
    }

    public void setHora(Date hora) {

        this.hora = hora;
    }

    public Date getData() {

        return data;
    }

    public void setData(Date data) {

        this.data = data;
    }
}


