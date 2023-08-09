package com.github.thiago_v_a.poo_2023_01.t21;

public class Pedido {
    private Cliente cliente;
    private Garcom atendente;
    private Colaborador requisitadoPor;

    public Pedido(Cliente cliente, Garcom atendente) {
        this.cliente = cliente;
        this.atendente = atendente;
    }

}
