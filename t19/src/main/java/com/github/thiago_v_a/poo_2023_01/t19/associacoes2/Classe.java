package com.github.thiago_v_a.poo_2023_01.t19.associacoes2;

/*
    *"Uma classe Associação possui uma associação que parte dela para
    ela mesma. Em ambos os extremos a cardinalidade é 1. Em um
    deles o papel é para, enquanto no outro é de. O nome da
    associação é Relação. Outra classe, denominada de Classe,
    possui uma associação que também parte dela para ela mesma.
    Os papéis são, à semelhança do caso anterior, para e de.
    Neste última associação, contudo, o nome é Associação e
    nenhuma cardinalidade foi fornecida. Quais destas classes,
    com a respectiva associação representa um modelo mais
    consistente? Justifique."*

    RESPOSTA: A classe a direita representa um modelo mais
    consitente, pois está fazendo a representação sem a cardinalidade
    e utiliza a nomeclatura correta.

 */


public class Classe {
    private Classe classeDePara;

    public Classe getClasseDePara() {
        return classeDePara;
    }

    public void setClasseDePara(Classe classeDePara) {
        this.classeDePara = classeDePara;
    }
}
