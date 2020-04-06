package com.gft.trainees.g3.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;

public class GestorProceso  {
    private String idProceso;
    private Comando comando;

    /**
     * Constructor
     * @param idProceso id proceso
     * @param comando Nombre del comando
     */
    public GestorProceso(String idProceso, Comando comando) {
        this.idProceso = idProceso;
        this.comando = comando;
    }

    /**
     * Gestiona los comandos a ejecutar
     * @param comando Objecto comando
     * @param tiempoInicial tiempo de inicio del proceso, 0.
     */
    public void gestionaComando(Comando comando, long tiempoInicial) {
        int retardo = (int) Math.floor(Math.random()*(5-0+1)+0);
        System.out.println(
            "Gestor:             " + this.idProceso + "\n" +
            "Comando:            " + this.comando.getComando() + "\n" +
            "Segundo de inicio:  " + ((System.currentTimeMillis()-tiempoInicial) / 1000 + " seg") + "\n" +
            "Tiempo retardo:     " + retardo + "\n"
        );
        this.tiempoEspera(retardo);
        try {
            Process proceso = Runtime.getRuntime().exec(this.comando.getComando());
            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea = "";
            System.out.println("::::::::::::::::::::::::::::::::::::::::: " + this.idProceso);
            while ((linea = reader.readLine())!= null) {
                System.out.println(linea);
            }
            reader.close();
            System.out.println("::::::::::::::::::::::::::::::::::::::::: ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=============================================================\n");
        System.out.println(
            "Gestor:             " + this.idProceso + "\n" +
            "Tiempo:             " + ((System.currentTimeMillis()-tiempoInicial) / 1000 + " seg")
        );
        System.out.println("=============================================================\n");
    }

    /**
     * Tiempo de espera en el proceso
     * @param segundos Tiempo en segundos
     */
    private void tiempoEspera(int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
