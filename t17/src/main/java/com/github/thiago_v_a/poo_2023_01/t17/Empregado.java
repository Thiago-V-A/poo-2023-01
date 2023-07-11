package com.github.thiago_v_a.poo_2023_01.t17;
import java.util.ArrayList;
import java.util.List;

public class Empregado {
    private String nome;
    private Empregado gerente;
    private List<Empregado> subordinados;

    public Empregado(String nome) {
        this.nome = nome;
        this.subordinados = new ArrayList<>();
    }

    public void setGerente(Empregado gerente) {
        this.gerente = gerente;
    }

    public void adicionarSubordinado(Empregado subordinado) {
        subordinados.add(subordinado);
        subordinado.setGerente(this);
    }

    public String getNome() {
        return nome;
    }

    public Empregado getGerente() {
        return gerente;
    }

    public List<Empregado> getSubordinados() {
        return subordinados;
    }
}
