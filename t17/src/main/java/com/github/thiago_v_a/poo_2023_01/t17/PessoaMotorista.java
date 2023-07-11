package com.github.thiago_v_a.poo_2023_01.t17;

public class PessoaMotorista {
    private String nome;
    private Automovel automovel;

    public PessoaMotorista(String nome) {
        this.nome = nome;
    }

    public void dirigir(Automovel automovel) {
        this.automovel = automovel;
        automovel.setMotorista(this);
    }

    public void pararDeDirigir() {
        automovel.setMotorista(null);
        automovel = null;
    }

    public String getNome() {
        return nome;
    }

    public Automovel getAutomovel() {
        return automovel;
    }
}

class Automovel {
    private String marca;
    private String modelo;
    private int ano;
    private PessoaMotorista motorista;

    public Automovel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public PessoaMotorista getMotorista() {
        return motorista;
    }

    public void setMotorista(PessoaMotorista motorista) {
        this.motorista = motorista;
    }
}
