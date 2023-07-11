package main.java.com.github.thiago_v_a.poo_2023_01.t13;
import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Marca: ");
        marca = scanner.nextLine();
        System.out.print("Modelo: ");
        modelo = scanner.nextLine();
        System.out.print("Ano: ");
        ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor: ");
        cor = scanner.nextLine();
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.inserirDados();
        System.out.println("--------");
        carro.exibirInformacoes();
    }
}
