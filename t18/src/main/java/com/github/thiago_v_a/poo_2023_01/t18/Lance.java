package com.github.thiago_v_a.poo_2023_01.t18;

public class Lance {
    private Jogador jogador;
    private Peça peça;
    private Posição posição;

    public Lance(Jogador jogador, Peça peça, Posição posição) {
        this.jogador = jogador;
        this.peça = peça;
        this.posição = posição;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Peça getPeça() {
        return peça;
    }

    public Posição getPosição() {
        return posição;
    }
}
