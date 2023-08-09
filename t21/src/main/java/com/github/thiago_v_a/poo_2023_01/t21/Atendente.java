package com.github.thiago_v_a.poo_2023_01.t21;

import java.util.ArrayList;
import java.util.List;

public class Atendente {
    private List<Pedido> pedidosAtendidos = new ArrayList<>();

    public void atenderPedido(Pedido pedido) {
        pedidosAtendidos.add(pedido);
    }
}
