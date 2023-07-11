package main.java.com.github.thiago_v_a.poo_2023_01.t13;

class Main {
    public static void main(String[] args) {
        // Criando uma nova instância da cadeira
        Cadeira cadeira = new Cadeira();

        // Inserindo uma cadeira com marca e tamanho
        cadeira.inserirCadeira("Flexform", 5);

        // Obtendo e exibindo a marca e o tamanho da cadeira
        String marca = cadeira.getMarca();
        int tamanho = cadeira.getTamanho();
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho: " + tamanho);
    }
}

public class Cadeira {
    private String marca;
    private int tamanho;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void inserirCadeira(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
        System.out.println("Cadeira inserida: Marca: " + marca + ", Tamanho: " + tamanho);
    }
}


