package com.github.thiago_v_a.poo_2023_01.t22;

import java.util.UUID;

public class Radio {
    private UUID identificadorRadio;

    public Radio() {
        identificadorRadio = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Id. radio: " + identificadorRadio;
    }
}

