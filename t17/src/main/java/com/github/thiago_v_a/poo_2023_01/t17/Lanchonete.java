package com.github.thiago_v_a.poo_2023_01.t17;
import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
    private List<Sanduiche> sanduiches;

    public Lanchonete() {
        sanduiches = new ArrayList<>();
    }

    public void adicionarSanduiche(Sanduiche sanduiche) {
        sanduiches.add(sanduiche);
    }
}

class Sanduiche {
    private String nome;

    public Sanduiche(String nome) {
        this.nome = nome;
    }

}

class Item{
    Sanduiche sanduiche;
    Bebida bebida;
    Pedido pedido;
    List<Detalhe> detalhes;


}

class Bebida{

}

class Pedido{
    Garconete garconete;
    List<Item> itens;
}

class Garconete{
    List<Pedido> pedidos;
}

class Detalhe{
    String descricao;
    String acompanhamento;
    Item item;
}
