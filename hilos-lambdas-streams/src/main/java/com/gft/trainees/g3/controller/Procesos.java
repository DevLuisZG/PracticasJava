package com.gft.trainees.g3.controller;

import com.gft.trainees.g3.model.IPrint;
import com.gft.trainees.g3.model.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class Procesos
 */
public class Procesos {
    /**
     * gestion de procesos
     * @param transactions Lista de transacciones
     * @param id_proceso indice de proceso
     * @param descripcion descripcion del proceso
     * @param tiempoInicial tiempo de inicio (0)
     */
    public void gestionProcesos(List<Transaction> transactions, int id_proceso, String descripcion, long tiempoInicial){
        int retardo = (int) Math.floor(Math.random()*(5-0+1)+0);
        this.tiempoEspera(retardo);
        IPrint iPrint;
        switch (id_proceso) {
            case 1:
                iPrint = () -> {
                    transactions.stream()
                    .filter(objeto -> objeto.getYear() == 2011)
                    .sorted(Comparator.comparing(Transaction::getValue))
                    .forEach(element -> System.out.println(
                        element.getTrader() + " | " +
                        element.getYear() + " | " +
                        element.getValue())
                    );
                };
                iPrint.imprimeResultado();
            break;
            case 2:
                iPrint = () -> {
                    transactions.stream()
                    .map(city -> city.getTrader().getCity())
                    .distinct()
                    .forEach(System.out::println);
                };
                iPrint.imprimeResultado();
            break;
            case 3:
                iPrint = () -> {
                    transactions.stream()
                    .filter(trader -> trader.getTrader().getCity().equals("Cambridge"))
                    .sorted(Comparator.comparing(trader -> trader.getTrader().getName()))
                    .map(trader -> trader.getTrader().getName())
                    .distinct()
                    .forEach(System.out::println);
                };
                iPrint.imprimeResultado();
            break;
            case 4:
                iPrint = () -> {
                    System.out.println(
                        transactions.stream()
                        .map(nombre -> nombre.getTrader().getName())
                        .distinct()
                        .sorted(Comparator.comparing(nombre->nombre))
                        .collect(Collectors.joining(" | "))
                    );
                };
                iPrint.imprimeResultado();
            break;
            case 5:
                iPrint = () -> {
                    System.out.println(
                        transactions.stream()
                        .anyMatch(trader -> trader.getTrader().getCity().equals("Milan"))
                    );
                };
                iPrint.imprimeResultado();
            break;
            case 6:
                iPrint = () -> {
                    transactions.stream()
                    .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                    .forEach(element -> System.out.println(
                        element.getTrader().getCity() + " | " +
                        element.getTrader().getName() + " | " +
                        element.getValue())
                    );
                };
                iPrint.imprimeResultado();
            break;
            case 7:
                iPrint = () -> {
                    System.out.println(
                        transactions.stream()
                        .max(Comparator.comparing(Transaction::getValue))
                        .orElse(null)
                    );
                };
                iPrint.imprimeResultado();
            break;
            case 8:
                iPrint = () -> {
                    System.out.println(
                        transactions.stream()
                        .min(Comparator.comparing(Transaction::getValue))
                        .orElse(null)
                    );
                };
                iPrint.imprimeResultado();
            break;
        }
        System.out.println(
            "Proceso : " + (id_proceso) + "\n" +
            "Descripcion: " + descripcion + "\n" +
            "Tiempo: (" + ((System.currentTimeMillis()-tiempoInicial) / 1000 + " seg)\n")
        );
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
