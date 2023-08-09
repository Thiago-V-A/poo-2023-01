package com.github.thiago_v_a.poo_2023_01.t22;

import java.util.List;

public class CentroVendas {
    private Funcionario funcionario;
    private List<Venda> listaVendas;
    private List<TrocaAPorB> trocaBilhetes;

    public CentroVendas() {
        if (funcionario.getCargo() == Cargos.OperadorCaixa ||
                funcionario.getCargo() == Cargos.Vendedor ||
                funcionario.getCargo() == Cargos.Ajudante ||
                funcionario.getCargo() == Cargos.Assistente) {
            listaVendas = funcionario.getListaVendas();
        }
    }
}

