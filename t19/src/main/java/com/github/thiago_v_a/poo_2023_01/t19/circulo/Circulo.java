package com.github.thiago_v_a.poo_2023_01.t19.circulo;

public class Circulo {
    public double raio;
    public Ponto centro;

    public Circulo(double raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public void move(double novoX, double novoY) {
        centro.setX(novoX);
        centro.setY(novoY);
    }

}

/*
    *QUESTÃO CIRCULO E PONTO*
    Esse implementação com os elementos independentes faz
    mais senitod  pois assim temos facilidade em manipular
    e até entender a propriedade de centro.
 */