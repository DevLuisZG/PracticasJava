package com.gft.trainees.g3.hospital;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class Medico {
    /**
     * Identificador unico del medico
     */
    String idMedico;
    /**
     * Nombre del medico
     */
    String nombreMedico;
    /**
     * Cedula profesional del medico
     */
    String cedulaProfesional;

    /**
     * Datos del medico
     * @return String
     */
    String datosMedico(){
        return idMedico + " | " + nombreMedico + " | " + cedulaProfesional;
    }
    /**
     * Principal, para probar modificadores
     * @param args Parametros
     */
    public static void main(String[] args) {
        /**
         * Default-Misma clase
         */
        Medico medico = new Medico("1","Medico 1","MX2020");
        System.out.println("Medico misma clase (default)" + medico.datosMedico());
    }
}
