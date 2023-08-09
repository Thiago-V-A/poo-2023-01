package com.github.thiago_v_a.poo_2023_01.t21;

public class Cheque implements Pagamento {
    private String numeroCheque;
    private String banco;
    private String dataEmissao;

    public Cheque(String numeroCheque, String banco, String dataEmissao) {
        this.numeroCheque = numeroCheque;
        this.banco = banco;
        this.dataEmissao = dataEmissao;
    }

    @Override
    public Preco valor() {
        Preco valorCalculado = null;
        return new Preco(valorCalculado.getValor(), Moeda.REAL); // Altere conforme a moeda
    }
}
