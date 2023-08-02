package com.github.thiago_v_a.poo_2023_01.t19.usuario;

import java.util.ArrayList;
import java.util.List;

public class Disco {
    private List<Arquivo> arquivos;

    public Disco() {
        arquivos = new ArrayList<>();
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public void addArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }
}

