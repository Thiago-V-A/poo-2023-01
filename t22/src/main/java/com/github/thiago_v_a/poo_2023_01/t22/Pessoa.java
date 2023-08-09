package com.github.thiago_v_a.poo_2023_01.t22;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Pessoa {
    private List<Ocorrencia> ocorrencias;
    private boolean isVisitante;
    private boolean isFuncionario;

    public Pessoa() {
        ocorrencias = new ArrayList<>();
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public boolean isVisitante() {
        return isVisitante;
    }

    public void setVisitante(boolean isVisitante) {
        this.isVisitante = isVisitante;
    }

    public boolean isFuncionario() {
        return isFuncionario;
    }

    public void setFuncionario(boolean isFuncionario) {
        this.isFuncionario = isFuncionario;
    }
}
