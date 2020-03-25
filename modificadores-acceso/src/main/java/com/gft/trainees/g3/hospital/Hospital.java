package com.gft.trainees.g3.hospital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase publica Hospital.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hospital {
    /**
     * Identificador unico del hospital
     */
    public String idHospital;
    /**
     * Nombre del hospital
     */
    public String nombreHospital;
    /**
     * Dirección o localizacion del hospital
     */
    public String direccionHospital;
    /**
     *  Datos del hospital
     * @return String
     */
    public String datosHospital(){
        return idHospital + " | " + nombreHospital + "| " + direccionHospital;
    }

    /**
     * Principal, para probar modificadores
     * @param args Parametros
     */
    public static void main(String[] args) {
        /**
         * Public-Misma clase
         */
        Hospital hospital = new Hospital("1","Hospital 1","México");
        System.out.println("Hospital misma clase (publico): " + hospital.datosHospital());
    }
}
