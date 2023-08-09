package com.github.thiago_v_a.poo_2023_01.t21;

public class ItemPedido {
    private Bebida item;
    private int quantidade;
    private boolean devolvido;
    private String observacao;

    public ItemPedido(Bebida item, int quantidade, boolean devolvido, String observacao) {
        this.item = item;
        this.quantidade = quantidade;
        this.devolvido = devolvido;
        this.observacao = observacao;
    }
}
