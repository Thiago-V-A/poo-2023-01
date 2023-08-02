package com.github.thiago_v_a.poo_2023_01.t19.agencia;

import java.util.SortedSet;
import java.util.TreeSet;

public class Fila {
    private SortedSet<Cliente> clientes;

    public Fila() {
        clientes = new TreeSet<>();
    }

    public SortedSet<Cliente> getClientes() {
        return clientes;
    }

    public void addClientesFila(Cliente cliente) {
        clientes.add(cliente);
    }
}
