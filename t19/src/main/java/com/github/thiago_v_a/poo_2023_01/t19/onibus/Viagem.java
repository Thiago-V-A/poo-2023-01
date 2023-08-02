package com.github.thiago_v_a.poo_2023_01.t19.onibus;

import java.util.SortedSet;
import java.util.TreeSet;

public class Viagem {
    private SortedSet<Passageiro> passageiros;
    private Motorista motorista;
    private Cidade origem;
    private Cidade destino;

    public Viagem() {
        passageiros = new TreeSet<>();
    }

    public SortedSet<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(SortedSet<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }
}

