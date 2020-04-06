package com.gft.trainees.g3.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Comando {
    /**
     * Identificador del comando
     */
    private String idComando;
    /**
     * Nombre de oa tarea
     */
    private String comando;

    public Comando(String idComando, String comando) {
        this.idComando = idComando;
        this.comando = comando;
    }

    public String getIdComando() {
        return idComando;
    }

    public void setIdComando(String idComando) {
        this.idComando = idComando;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
}
