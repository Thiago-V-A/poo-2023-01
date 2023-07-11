package com.github.thiago_v_a.poo_2023_01.t17;

import java.util.Date;
import java.util.List;

public class Avaliacao {
    List<Questao> questoes;
    Date dataAplicacao;
    List<Prova> provas;
}

class Questao{

}

class Prova{
    Avaliacao avaliacao;
    Aluno aluno;
    List<Resposta> respostas;
}

class Aluno{
    String nome;
    String matricula;
    Prova prova;
}

class Resposta{
    Prova prova;
}