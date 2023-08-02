package com.github.thiago_v_a.poo_2023_01.t19.expressoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class Expressao {
    private SortedSet<Elemento> elementos;

    public Expressao() {
        elementos = new TreeSet<>();
    }

    public SortedSet<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(SortedSet<Elemento> elementos) {
        this.elementos = elementos;
    }
}
