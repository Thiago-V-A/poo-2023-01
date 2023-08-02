package com.github.thiago_v_a.poo_2023_01.t19.revisao;

public class Revisao extends Versao{
    private Versao anterior;
    private Versao proximo;

    public Revisao(Versao anterior, Versao proximo) {
        this.anterior = anterior;
        this.proximo = proximo;
    }


}
