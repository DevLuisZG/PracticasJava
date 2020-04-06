package com.gft.trainees.g3;

import com.gft.trainees.g3.models.Comando;
import com.gft.trainees.g3.models.GestorProceso;


/**
 * Hello world!
 *
 */
public class App implements Runnable
{
    /**
     * Variables
     */
    private Comando comando;
    private GestorProceso gestor;
    private long tiempoInicial;

    /**
     * Constructor App, inicializa las variables declaradas
     * @param comando Objecto comando
     * @param gestor Objecto gestor
     * @param tiempoInicial Tiempo inicial
     */
    public App(Comando comando, GestorProceso gestor, long tiempoInicial) {
        this.comando = comando;
        this.gestor = gestor;
        this.tiempoInicial = tiempoInicial;
    }

    /**
     * Sobre escitura del metodo,
     * ejecuta el metodo gestionaComando.
     */
    @Override
    public void run() {
        this.gestor.gestionaComando(this.comando, this.tiempoInicial);
    }

    /**
     * Main
     * @param args Parametros
     */
    public static void main(String[] args ) throws InterruptedException {
        /**
         * Comandos
         */
        Comando comando_1 = new Comando("1","ipconfig");
        Comando comando_2 = new Comando("2","ipconfig");
        Comando comando_3 = new Comando("3","ipconfig");
        /**
         * Gestores
         */
        GestorProceso gestor_1 = new GestorProceso("1",comando_1);
        GestorProceso gestor_2 = new GestorProceso("2",comando_2);
        GestorProceso gestor_3 = new GestorProceso("3",comando_3);
        /**
         * Tiempo inicial
         */
        long tiempoInicial = System.currentTimeMillis();
        /**
         * Procesos Runnable
         */
        Runnable proceso1 = new App(comando_1, gestor_1, tiempoInicial);
        Runnable proceso2 = new App(comando_2, gestor_2, tiempoInicial);
        Runnable proceso3 = new App(comando_3, gestor_3, tiempoInicial);
        /**
         * Hilos
         */
        new Thread(proceso1).start();
        new Thread(proceso2).start();
        new Thread(proceso3).start();
    }
}
