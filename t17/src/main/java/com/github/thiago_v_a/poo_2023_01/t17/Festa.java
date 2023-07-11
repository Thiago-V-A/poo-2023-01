package com.github.thiago_v_a.poo_2023_01.t17;
import java.util.ArrayList;
import java.util.List;

public class Festa {
    private List<Convite> convites;

    public Festa() {
        convites = new ArrayList<>();
    }

    public List<Convite> getConvites() {
        return convites;
    }
}

class Convite {
    Festa festa;
    Pessoa convidado;
}

class Pessoa{
    String genero;
    Pessoa acompanhante;
}

class Danca{
    String inicio;
    String fim;
    Musica musica;
    List<Pessoa> pessoas;
}

class Musica{
    Danca danca;
}
