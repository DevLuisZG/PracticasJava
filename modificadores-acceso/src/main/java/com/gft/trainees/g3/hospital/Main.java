package com.gft.trainees.g3.hospital;


import com.gft.trainees.g3.paciente.Paciente;

public class Main {
    public static void main(String[] args) {
        /**
         * Public-Mismo paquete
         */
        Hospital hospital = new Hospital("1","Hospital 1","México");
        System.out.println("Hospital mismo paquete (publico): " + hospital.datosHospital());
        /**
         * Instancia a clase default-(métodos, propiedades default)
         */
        Medico medico = new Medico("1","Medico 1","MX2020");
        System.out.println("Medico mismo paquete (default)" + medico.datosMedico());

        /**
         * Protected-Diferente paquete
         */
        Paciente paciente = new Paciente("1","Paciente 1",23);
        //System.out.println("Paciente mismo paquete (protected): " + paciente.datosPaciente());

    }
}
