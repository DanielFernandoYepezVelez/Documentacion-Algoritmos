/** PROBLEMA #22
 * SE TIENEN TRES BALDES DE AGUA, UNO DE CINCO LITROS,
 * OTRO DE TRES LITROS Y OTRO DE UN LITRO; SI EL DE
 * UN LITRO TARDA UNA HORA Y MEDIA EN LLENARSE, RESUELVA
 * CUANTO TIEMPO PUEDEN TARDARSE LOS OTROS BALDES.
 * SI TIENE TRES BALDES, PERO SI SE DESCONOCE SU TAMAÑO
 * DEBE RESOLVER IGUALMENTE EL EJERCICIO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo22 {
    public static void Litros() {
        Scanner teclado = new Scanner(System.in);

        try {
            double cinco = 5 * 90;
            double tres = 3 * 90;
            double uno = 90;

            double tiempoCinco = cinco / 60;
            double tiempoTres = tres / 60;
            double tiempoUno = uno / 60;

            System.out.println("\nTiempo Balde Cinco Litros: " + tiempoCinco + " Horas");
            System.out.println("Tiempo Balde Tres Litros: " + tiempoTres + " Horas");
            System.out.println("Tiempo Balde Uno Litro: " + tiempoUno + " Horas");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
