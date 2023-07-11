package com.github.thiago_v_a.poo_2023_01.t17;
import java.util.Date;
import java.util.List;

public class Aeroporto {
    List<Operacao> operacoes;
}

class Operacao{
    String tipo;
    Date data;
    String hora;
    Aeroporto aeroporto;
    List<Voo> voos;
}

class Voo{
    Tripulacao tripulacao;
    Aviao aviao;
}

class Aviao{
    List<Voo> voos;
    Lugar[][] lugares;
}

class Lugar{
    Passageiro[] passageiros;
}

class Passageiro{
    String nome;
    String bilhete;

}

class Tripulacao{
    Voo voo;
    Piloto piloto;
    CoPiloto coPiloto;
    Aeromoca  aeromoca;

}

class Piloto{

}

class CoPiloto{

}

class Aeromoca{

}