package com.github.thiago_v_a.poo_2023_01.t18;

public class Lance {
    private Jogador jogador;
    private Peca peca;
    private Posicao posicao;

    public Lance(Jogador jogador, Peca peca, Posicao posicao) {
        this.jogador = jogador;
        this.peca = peca;
        this.posicao = posicao;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Peca getPeca() {
        return peca;
    }

    public Posicao getPosicao() {
        return posicao;
    },
}
