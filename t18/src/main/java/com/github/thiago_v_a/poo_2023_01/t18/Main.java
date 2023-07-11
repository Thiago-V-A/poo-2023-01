package com.github.thiago_v_a.poo_2023_01.t18;

public class Main {
    public static void main(String[] args) {
        Partida partida = new Partida("Partida Imortal de Anderssen");

        Jogador brancas = new Jogador("Anderssen");
        Jogador negras = new Jogador("Kieseritzky");

        Peça peao = new Peça("Peão");
        Peça bispo = new Peça("Bispo");
        Peça torre = new Peça("Torre");
        Peça cavalo = new Peça("Cavalo");
        Peça rainha = new Peça("Rainha");
        Peça rei = new Peça("Rei");

        Posição lance1Posicao = new Posição("e2", "e4");
        Posição lance2Posicao = new Posição("e7", "e5");
        Posição lance3Posicao = new Posição("f2", "f4");
        Posição lance4Posicao = new Posição("e5", "f4");
        Posição lance5Posicao = new Posição("f1", "c4");
        Posição lance6Posicao = new Posição("d8", "h4");
        Posição lance7Posicao = new Posição("e1", "f1");
        Posição lance8Posicao = new Posição("b7", "b5");
        Posição lance9Posicao = new Posição("c4", "b5");
        Posição lance10Posicao = new Posição("g8", "f6");
        Posição lance11Posicao = new Posição("g1", "f3");
        Posição lance12Posicao = new Posição("h4", "h6");
        Posição lance13Posicao = new Posição("d2", "d3");
        Posição lance14Posicao = new Posição("f6", "h5");
        Posição lance15Posicao = new Posição("f3", "h4");
        Posição lance16Posicao = new Posição("h6", "g5");
        Posição lance17Posicao = new Posição("h4", "f5");
        Posição lance18Posicao = new Posição("c7", "c6");
        Posição lance19Posicao = new Posição("g2", "g4");
        Posição lance20Posicao = new Posição("h5", "f6");
        Posição lance21Posicao = new Posição("h1", "g1");
        Posição lance22Posicao = new Posição("c6", "b5");
        Posição lance23Posicao = new Posição("h2", "h4");
        Posição lance24Posicao = new Posição("g5", "g6");
        Posição lance25Posicao = new Posição("h4", "h5");
        Posição lance26Posicao = new Posição("g6", "g5");
        Posição lance27Posicao = new Posição("d1", "f3");
        Posição lance28Posicao = new Posição("f6", "g8");
        Posição lance29Posicao = new Posição("c1", "f4");
        Posição lance30Posicao = new Posição("g5", "f6");
        Posição lance31Posicao = new Posição("b1", "c3");
        Posição lance32Posicao = new Posição("f8", "c5");
        Posição lance33Posicao = new Posição("c3", "d5");
        Posição lance34Posicao = new Posição("f6", "b2");
        Posição lance35Posicao = new Posição("f4", "d6");
        Posição lance36Posicao = new Posição("c5", "g1");
        Posição lance37Posicao = new Posição("e4", "e5");
        Posição lance38Posicao = new Posição("b2", "a1");
        Posição lance39Posicao = new Posição("f1", "e2");
        Posição lance40Posicao = new Posição("b8", "a6");
        Posição lance41Posicao = new Posição("f5", "g7");
        Posição lance42Posicao = new Posição("e8", "d8");
        Posição lance43Posicao = new Posição("f3", "f6");
        Posição lance44Posicao = new Posição("g8", "f6");
        Posição lance45Posicao = new Posição("d6", "e7");


        Lance lance1 = new Lance(brancas, peao, lance1Posicao);
        Lance lance2 = new Lance(negras, peao, lance2Posicao);
        Lance lance3 = new Lance(brancas, peao, lance3Posicao);
        Lance lance4 = new Lance(negras, peao, lance4Posicao);
        Lance lance5 = new Lance(brancas, bispo, lance5Posicao);
        Lance lance6 = new Lance(negras, rainha, lance6Posicao);
        Lance lance7 = new Lance(brancas, rei, lance7Posicao);
        Lance lance8 = new Lance(negras, peao, lance8Posicao);
        Lance lance9 = new Lance(brancas, bispo, lance9Posicao);
        Lance lance10 = new Lance(negras, cavalo, lance10Posicao);
        Lance lance11 = new Lance(brancas, cavalo, lance11Posicao);
        Lance lance12 = new Lance(negras, rainha, lance12Posicao);
        Lance lance13 = new Lance(brancas, peao, lance13Posicao);
        Lance lance14 = new Lance(negras, cavalo, lance14Posicao);
        Lance lance15 = new Lance(brancas, cavalo, lance15Posicao);
        Lance lance16 = new Lance(negras, rainha, lance16Posicao);
        Lance lance17 = new Lance(brancas, cavalo, lance17Posicao);
        Lance lance18 = new Lance(negras, peao, lance18Posicao);
        Lance lance19 = new Lance(brancas, peao, lance19Posicao);
        Lance lance20 = new Lance(negras, cavalo, lance20Posicao);
        Lance lance21 = new Lance(brancas, torre, lance21Posicao);
        Lance lance22 = new Lance(negras, peao, lance22Posicao);
        Lance lance23 = new Lance(brancas, peao, lance21Posicao);
        Lance lance24 = new Lance(negras, rainha, lance22Posicao);
        Lance lance25 = new Lance(brancas, peao, lance21Posicao);
        Lance lance26 = new Lance(negras, rainha, lance22Posicao);
        Lance lance27 = new Lance(brancas, rainha, lance21Posicao);
        Lance lance28 = new Lance(negras, cavalo, lance22Posicao);
        Lance lance29 = new Lance(brancas, bispo, lance21Posicao);
        Lance lance30 = new Lance(negras, rainha, lance22Posicao);
        Lance lance31 = new Lance(brancas, cavalo, lance21Posicao);
        Lance lance32 = new Lance(negras, bispo, lance22Posicao);
        Lance lance33 = new Lance(brancas, cavalo, lance21Posicao);
        Lance lance34 = new Lance(negras, rainha, lance22Posicao);
        Lance lance35 = new Lance(brancas, bispo, lance21Posicao);
        Lance lance36 = new Lance(negras, bispo, lance22Posicao);
        Lance lance37 = new Lance(brancas, peao, lance21Posicao);
        Lance lance38 = new Lance(negras, rainha, lance22Posicao);
        Lance lance39 = new Lance(brancas, rei, lance21Posicao);
        Lance lance40 = new Lance(negras, cavalo, lance22Posicao);
        Lance lance41 = new Lance(brancas, cavalo, lance21Posicao);
        Lance lance42 = new Lance(negras, rei, lance22Posicao);
        Lance lance43 = new Lance(brancas, rainha, lance21Posicao);
        Lance lance44 = new Lance(negras, cavalo, lance22Posicao);
        Lance lance45 = new Lance(brancas, bispo, lance21Posicao);

        partida.adicionarLance(lance1);
        partida.adicionarLance(lance2);
        partida.adicionarLance(lance3);
        partida.adicionarLance(lance4);
        partida.adicionarLance(lance5);
        partida.adicionarLance(lance6);
        partida.adicionarLance(lance7);
        partida.adicionarLance(lance8);
        partida.adicionarLance(lance9);
        partida.adicionarLance(lance10);
        partida.adicionarLance(lance11);
        partida.adicionarLance(lance12);
        partida.adicionarLance(lance13);
        partida.adicionarLance(lance14);
        partida.adicionarLance(lance15);
        partida.adicionarLance(lance16);
        partida.adicionarLance(lance17);
        partida.adicionarLance(lance18);
        partida.adicionarLance(lance19);
        partida.adicionarLance(lance20);
        partida.adicionarLance(lance21);
        partida.adicionarLance(lance22);
        partida.adicionarLance(lance23);
        partida.adicionarLance(lance24);
        partida.adicionarLance(lance25);
        partida.adicionarLance(lance26);
        partida.adicionarLance(lance27);
        partida.adicionarLance(lance28);
        partida.adicionarLance(lance29);
        partida.adicionarLance(lance30);
        partida.adicionarLance(lance31);
        partida.adicionarLance(lance32);
        partida.adicionarLance(lance33);
        partida.adicionarLance(lance34);
        partida.adicionarLance(lance35);
        partida.adicionarLance(lance36);
        partida.adicionarLance(lance37);
        partida.adicionarLance(lance38);
        partida.adicionarLance(lance39);
        partida.adicionarLance(lance40);
        partida.adicionarLance(lance41);
        partida.adicionarLance(lance42);
        partida.adicionarLance(lance43);
        partida.adicionarLance(lance44);
        partida.adicionarLance(lance45);



        partida.imprimirLances();
    }
}
