package com.gft.trainees.g3;

import com.gft.trainees.g3.controller.Procesos;
import com.gft.trainees.g3.model.Trader;
import com.gft.trainees.g3.model.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App implements Runnable {
    /**
     * Propiedades
     */
    private List<Transaction> transactions;
    private int id_proceso;
    private Procesos proceso;
    private String descripcion;
    private long tiempoInicial;

    /**
     * Constructor
     * @param transactions Lista de transacciones
     * @param id_proceso indice de proceso
     * @param proceso Instancia de procesos
     * @param descripcion descripcion del proceso
     * @param tiempoInicial tiempo de inicio (0)
     */
    public App(List<Transaction> transactions, int id_proceso, Procesos proceso, String descripcion, long tiempoInicial) {
        this.transactions = transactions;
        this.id_proceso = id_proceso;
        this.proceso = proceso;
        this.descripcion = descripcion;
        this.tiempoInicial = tiempoInicial;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        this.proceso.gestionProcesos(this.transactions, this.id_proceso, this.descripcion, this.tiempoInicial);
    }

    /**
     * Main
     * @param args Argumentos
     */
    public static void main( String[] args ) {
        /**
         * This is the trader objects
         */
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        /**
         * This is the transaction list objects
         */
        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
        long tiempoInicial = System.currentTimeMillis();
        /**
         *
         */
        List<String> descripcionProcesos = new ArrayList<>();
        descripcionProcesos.add("1. Encuentre todas las transacciones en el año 2011 y ordénelas por valor (pequeño a alto).");
        descripcionProcesos.add("2. ¿Cuáles son todas las ciudades únicas donde trabajan los comerciantes?");
        descripcionProcesos.add("3. Encuentre todos los comerciantes de Cambridge y ordénelos por nombre.");
        descripcionProcesos.add("4. Devuelva una cadena de todos los nombres de los comerciantes ordenados alfabéticamente.");
        descripcionProcesos.add("5. ¿Hay comerciantes en Milán?");
        descripcionProcesos.add("6. Imprima los valores de todas las transacciones de los comerciantes que viven en Cambridge.");
        descripcionProcesos.add("7. ¿Cuál es el valor más alto de todas las transacciones?");
        descripcionProcesos.add("8. Encuentre la transacción con el valor más pequeño.");
        /**
         * Procesos Runnable
         */
        Runnable proceso1 = new App(transactions, 1, new Procesos(), descripcionProcesos.get(0), tiempoInicial);
        Runnable proceso2 = new App(transactions, 2, new Procesos(), descripcionProcesos.get(1),tiempoInicial);
        Runnable proceso3 = new App(transactions, 3, new Procesos(), descripcionProcesos.get(2),tiempoInicial);
        Runnable proceso4 = new App(transactions, 4, new Procesos(), descripcionProcesos.get(3),tiempoInicial);
        Runnable proceso5 = new App(transactions, 5, new Procesos(), descripcionProcesos.get(4),tiempoInicial);
        Runnable proceso6 = new App(transactions, 6, new Procesos(), descripcionProcesos.get(5),tiempoInicial);
        Runnable proceso7 = new App(transactions, 7, new Procesos(), descripcionProcesos.get(6),tiempoInicial);
        Runnable proceso8 = new App(transactions, 8, new Procesos(), descripcionProcesos.get(7),tiempoInicial);
        /**
         * Hilos
         */
        new Thread(proceso1).start();
        new Thread(proceso2).start();
        new Thread(proceso3).start();
        new Thread(proceso4).start();
        new Thread(proceso5).start();
        new Thread(proceso6).start();
        new Thread(proceso7).start();
        new Thread(proceso8).start();
    }
}
