/** PROBLEMA #23
 * UNA PERSONA TARDA 5 HORAS EN SUBIR UNA MONTAÑA DE 7 METROS,
 * SI UN ESCALADOR DESEA SUBIR MÁS O MENOS DE LA MONTAÑA,
 * CUANTO TIEMPO TARDA EN SUBIR. DEBE RESOLVER EL EJERCICIO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo23 {
    public static void Escalador() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Cuantos Metros Desea Subir: ");
            double subir = teclado.nextDouble();

            System.out.println("Cuantos Metros Desea Bajar: ");
            double bajar = teclado.nextDouble();

            double minutos = 5 * 60;
            double minutosMetro = minutos / 7;

            double tiempoSubiendo = minutosMetro * subir;
            double tiempoBajando = minutosMetro * bajar;
            double tiempoTotalEscalador = (tiempoSubiendo + tiempoBajando) / 60;

            System.out.println("\nMetros Para Subir: " + subir + " Metros" +
                               "\nMetros Para Bajar: " + bajar + " Metros" +
                               "\nTiempo Subiendo: " + Math.round(tiempoSubiendo) + " Minutos" +
                               "\nTiempo Bajando: " + Math.round(tiempoBajando) + " Minutos" +
                               "\nMetros totales: " + (subir + bajar) + " Metros" +
                               "\nTiempo Total Escalado: " + Math.round(tiempoTotalEscalador) + " Horas");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
