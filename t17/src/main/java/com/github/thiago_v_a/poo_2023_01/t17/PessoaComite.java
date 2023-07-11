package com.github.thiago_v_a.poo_2023_01.t17;
import java.util.ArrayList;
import java.util.List;

public class PessoaComite {
    private String nome;
    private List<Comite> comites;

    public PessoaComite(String nome) {
        this.nome = nome;
        this.comites = new ArrayList<>();
    }

    public void adicionarComite(Comite comite) {
        comites.add(comite);
        comite.adicionarMembro(this);
    }

    public void removerComite(Comite comite) {
        comites.remove(comite);
        comite.removerMembro(this);
    }

    public String getNome() {
        return nome;
    }

    public List<Comite> getComites() {
        return comites;
    }
}

class Comite {
    private String nome;
    private List<PessoaComite> membros;
    private List<PessoaComite> presidentes;

    public Comite(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
        this.presidentes = new ArrayList<>();
    }

    public void adicionarMembro(PessoaComite pessoa) {
        membros.add(pessoa);
    }

    public void removerMembro(PessoaComite pessoa) {
        membros.remove(pessoa);
        if (presidentes.contains(pessoa)) {
            presidentes.remove(pessoa);
        }
    }

    public void adicionarPresidente(PessoaComite pessoa) {
        if (presidentes.size() < 3) {
            presidentes.add(pessoa);
            if (!membros.contains(pessoa)) {
                membros.add(pessoa);
            }
        }
    }

    public void removerPresidente(PessoaComite pessoa) {
        presidentes.remove(pessoa);
    }

    public String getNome() {
        return nome;
    }

    public List<PessoaComite> getMembros() {
        return membros;
    }

    public List<PessoaComite> getPresidentes() {
        return presidentes;
    }
}
