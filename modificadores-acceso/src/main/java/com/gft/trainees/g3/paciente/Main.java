package com.gft.trainees.g3.paciente;

import com.gft.trainees.g3.hospital.Hospital;
//import com.gft.trainees.g3.hospital.Medico;

public class Main {
    public static void main(String[] args) {
        /**
         * Public-diferente paquete
         */
        Hospital hospital = new Hospital("1","Hospital 1","México");
        System.out.println("Hospital diferente paquete (publico): " + hospital.datosHospital());
        /**
         * Default-Diferente pquete
         */
        /*Medico medico = new Medico("1","Medico 1","MX2020");
        System.out.println("Medico mismo paquete (default): " + medico.datosMedico());*/
        /**
         * Protected-Mismo paquete
         */
        Paciente paciente = new Paciente("1","Paciente 1",23);
        System.out.println("Paciente mismo paquete (protected): " + paciente.datosPaciente());

        /**
         * Private-Mismo paquete
         */
        HuellaDigital huelladigital = new HuellaDigital("sdvsdcsdxs");
        //System.out.println(huelladigital.huellaDigital());
    }
}
