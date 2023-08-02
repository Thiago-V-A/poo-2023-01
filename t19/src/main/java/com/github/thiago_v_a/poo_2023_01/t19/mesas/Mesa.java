package com.github.thiago_v_a.poo_2023_01.t19.mesas;

import java.util.Date;
import java.util.List;

public class Mesa {
    private List<Pessoa> pessoas;
    private Date data;

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}

