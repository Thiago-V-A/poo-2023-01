package com.github.thiago_v_a.poo_2023_01.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private String nome;
    private List<Lance> lances;

    public Partida(String nome) {
        this.nome = nome;
        this.lances = new ArrayList<>();
    }

    public void adicionarLance(Lance lance) {
        lances.add(lance);
    }

    public void imprimirLances() {
        for (int i = 0; i < lances.size(); i++) {
            Lance lance = lances.get(i);
            System.out.println("Lance " + (i + 1) + ":");
            System.out.println("Jogador: " + lance.getJogador().getNome());
            System.out.println("Peca: " + lance.getPeca().getNome());
            System.out.println("Posicao de origem: " + lance.getPosicao().getOrigem());
            System.out.println("Posicao de destino: " + lance.getPosicao().getDestino());
            System.out.println("--------------------");
        }
    }
}