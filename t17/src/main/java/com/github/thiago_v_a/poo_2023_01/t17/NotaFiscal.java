package com.github.thiago_v_a.poo_2023_01.t17;

import java.util.Date;
import java.util.List;

public class NotaFiscal {
    List<ItemFiscal> itensFiscais;
}

class ItemFiscal{
    Integer quantidade;
    Float precoUnitario;
    Produto produto;
}

class Produto{
    String nome;
}
