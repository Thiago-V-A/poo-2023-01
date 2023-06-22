package com.github.thiago_v_a.poo_2023_01.t07;

import java.util.TreeSet;
public class Festa {
    private TreeSet<Convidado> convidados = new TreeSet<>();

    public void novoConvidado(Convidado convidado) {
        convidados.add(convidado);
    }

    public Festa(Convidado c) {
        convidados.add(c);
    }
}
