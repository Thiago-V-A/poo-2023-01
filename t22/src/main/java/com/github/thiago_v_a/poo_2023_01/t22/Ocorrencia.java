package com.github.thiago_v_a.poo_2023_01.t22;

import java.util.UUID;
import java.util.Date;

public class Ocorrencia {
    private UUID identificadorOcorrencia;
    private String localOcorrencia;
    private Date horaOcorrencia;
    private String descricaoOcorrencia;

    public Ocorrencia() {
        identificadorOcorrencia = UUID.randomUUID();
        horaOcorrencia = new Date();
    }

    public void setLocalOcorrencia(String localOcorrencia) {
        this.localOcorrencia = localOcorrencia;
    }

    public void setDescricaoOcorrencia(String descricaoOcorrencia) {
        this.descricaoOcorrencia = descricaoOcorrencia;
    }


    public UUID getIdentificadorOcorrencia() {
        return identificadorOcorrencia;
    }

    public String getLocalOcorrencia() {
        return localOcorrencia;
    }

    public Date getHoraOcorrencia() {
        return horaOcorrencia;
    }

    public String getDescricaoOcorrencia() {
        return descricaoOcorrencia;
    }
}
