package com.github.thiago_v_a.poo_2023_01.t22;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class Funcionario extends Trabalhador {
    private Cargos cargo;
    private double remuneracao;
    private UUID identificador;
    private double escala;
    private Radio radio;

    private List<Venda> listaVendas;

    public Funcionario(String nome, int idade, Cargos cargo) {
        super(nome, idade);
        identificador = UUID.randomUUID();
        this.cargo = cargo;

        if (cargo == Cargos.Vendedor || cargo == Cargos.OperadorCaixa || cargo == Cargos.Assistente || cargo == Cargos.Ajudante) {
            listaVendas = new ArrayList<>();
        }
        radio = new Radio();
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public void setEscala(double escala) {
        this.escala = escala;
    }

    public List<Venda> getListaVendas() {
        return this.listaVendas;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public double getEscala() {
        return escala;
    }

    public Radio getRadio() {
        return radio;
    }

    public void registrarVenda(Bilhete bilhete, Pessoa pessoa, Date horario) {
        Venda venda = new Venda(bilhete, pessoa, horario);
        listaVendas.add(venda);
    }

}

