package com.github.thiago_v_a.poo_2023_01.t19.mesas;

import java.util.List;

/*
    *Em restaurantes, mesas são ocupadas por pessoas ao longo
    do tempo. O modelo abaixo adequadamente reflete este fato?
    Justifique."*

    RESPOSTA: Sim, pois ele conta com relações com cardinalidade n,
    logo as mesas podem ou não estar ocupadas, assim como tem uma
    data atribuida.
 */

public class Pessoa {
    private List<Mesa> mesas;

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }
}

