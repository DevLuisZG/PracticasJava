package com.gft.trainees.g3.paciente;

import com.gft.trainees.g3.hospital.Hospital;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HuellaDigital {
    /**
     * Huella digital
     */
     private String huellaDigital;
    /**
     * Huella digital
     * @return String
     */
     private String huellaDigital(){
         return huellaDigital;
     }

    /**
     * Principal, para probar modificadores
     * @param args Parametros
     */
    public static void main(String[] args) {
        /**
         * private-Misma clase
         */
        System.out.println("Huella misma clase (private): " + new HuellaDigital("ss").huellaDigital);
    }
}
