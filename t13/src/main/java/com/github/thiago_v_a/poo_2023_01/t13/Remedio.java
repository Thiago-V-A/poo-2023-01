package com.github.thiago_v_a.poo_2023_01.t13;

public class Remedio {
    private String nome;
    private int dosagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDosagem() {
        return dosagem;
    }

    public void setDosagem(int dosagem) {
        this.dosagem = dosagem;
    }

    public void inserirRemedio(String nome, int dosagem) {
        this.nome = nome;
        this.dosagem = dosagem;
        System.out.println("Remédio inserido: Nome: " + nome + ", Dosagem: " + dosagem + "mg");
    }

    public static void main(String[] args) {
        // Criando uma nova instância do remédio
        Remedio remedio = new Remedio();

        // Inserindo um remédio com nome e dosagem
        remedio.inserirRemedio("Paracetamol", 500);

        // Obtendo e exibindo o nome e a dosagem do remédio
        String nome = remedio.getNome();
        int dosagem = remedio.getDosagem();
        System.out.println("Nome: " + nome);
        System.out.println("Dosagem: " + dosagem + "mg");
    }
}
