package com.github.thiago_v_a.poo_2023_01.t17;

public class Computador{
    public Dispositivo[] dispositivos;
}

class PlacaMae extends Dispositivo {
    private Memoria memoria;
    private CPU cpu;
}

class Memoria extends Dispositivo {
}

class CPU extends Dispositivo {
    public Memoria memoria;

    public CPU(Memoria memoria) {
        this.memoria = memoria;
    }
}

class Mouse extends Dispositivo {
}

class Teclado extends Dispositivo {
}

class Monitor extends Dispositivo {
}

class Dispositivo {
    // Classe base para os dispositivos
}
