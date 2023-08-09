package com.github.thiago_v_a.poo_2023_01.t21;

import java.util.Objects;

import java.util.Objects;

public class Preco extends Object {
    private double valor;
    private Moeda moeda;

    public Preco(double valor, Moeda moeda) {
        if (valor < 0) {
            throw new IllegalArgumentException("valor não pode ser negativo");
        }

        Objects.requireNonNull(moeda, "não pode ser nulo");

        this.valor = valor;
        this.moeda = moeda;
    }

    public double getValor() {
        return valor;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public static Preco reais(double valor) {
        return new Preco(valor, Moeda.REAL);
    }

    @Override
    public String toString() {
        return "Preco{" +
                "valor=" + valor +
                ", moeda=" + moeda +
                '}';
    }

    public Preco adiciona(Preco valor) {
        if (moeda != valor.getMoeda()) {
            throw new IllegalArgumentException("não se soma valores de moedas distintas");
        }

        return new Preco(valor.getValor() + getValor(), moeda);
    }

    public static void main(String[] args) {
        Preco preco1 = Preco.reais(10);
        Preco preco2 = Preco.reais(20);

        System.out.println(preco1);
        System.out.println(preco2);

        Preco soma = preco1.adiciona(preco2);
        System.out.println("Soma: " + soma);
    }
}
