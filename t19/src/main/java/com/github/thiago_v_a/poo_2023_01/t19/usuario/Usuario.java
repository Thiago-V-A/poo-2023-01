package com.github.thiago_v_a.poo_2023_01.t19.usuario;

public class Usuario {
    private boolean permissao;

    public boolean isPermissao() {
        return permissao;
    }

    public void setPermissao(boolean permissao) {
        this.permissao = permissao;
    }

    private boolean leitura() {
        return true;
    }

    private boolean escrita() {
        return true;
    }

    private boolean execucao() {
        return true;
    }
}

