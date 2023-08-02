package com.github.thiago_v_a.poo_2023_01.t19.onibus;

import java.util.List;

public class Onibus extends Viagem {
    private List<Viagem> viagens;

    public List<Viagem> getViagens() {
        return viagens;
    }

    public void setViagens(List<Viagem> viagens) {
        this.viagens = viagens;
    }
}

