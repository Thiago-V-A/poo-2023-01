package com.github.thiago_v_a.poo_2023_01.t22;

import java.util.List;
import java.util.ArrayList;

public class Posto {
    private Policia representantePolicia;
    private Justica representanteJustica;
    private List<Pessoa> criancasPerdidas;

    public Posto() {
        criancasPerdidas = new ArrayList<>();
    }

    public void addCriancaLista(Pessoa crianca) {
        criancasPerdidas.add(crianca);
    }

    public void getCriancas() {
        if (criancasPerdidas.size() == 0) {
            System.out.println("Não há crianças perdidas!");
        } else {
            System.out.println("Lista de crianças perdidas:");
            for (Pessoa crianca : criancasPerdidas) {
                System.out.println(crianca);
            }
            System.out.println("Quantidade de crianças perdidas: " + criancasPerdidas.size());
        }
    }

    public void setRepresentantes(Policia representantePolicia, Justica representanteJustica) {
        this.representantePolicia = representantePolicia;
        this.representanteJustica = representanteJustica;
    }
}

