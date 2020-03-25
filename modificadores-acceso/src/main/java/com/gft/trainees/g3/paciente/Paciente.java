package com.gft.trainees.g3.paciente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Paciente {
    /**
     * Idetificador del paciente
     */
    protected String idPaciente;
    /**
     * Nombre del paciente
     */
    protected String nombrePaciente;
    /**
     * Edad del paciente
     */
    protected int edadPaciente;

    /**
     * Datos del paciente
     * @return String
     */
    protected String datosPaciente(){
        return idPaciente + " | " + nombrePaciente + " | " + edadPaciente;
    }

    public static void main(String[] args) {
        System.out.println("Paciente misma clase (protected): " + new Paciente("1","Paciente 1",23).datosPaciente());
    }
}
