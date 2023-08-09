package com.github.thiago_v_a.poo_2023_01.t22;

import java.util.HashSet;
import java.util.Set;

public class Parque {
    private String nomeParque;
    private Set<Pessoa> pessoas;
    private Pessoa direcao;

    public Parque(String nomeParque, Pessoa direcao) {
        this.pessoas = new HashSet<>();
        this.nomeParque = nomeParque;
        this.direcao = direcao;
    }

    public void addPessoas(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public String getNomeParque() {
        return nomeParque;
    }

    public Pessoa getDirecao() {
        return direcao;
    }
}

