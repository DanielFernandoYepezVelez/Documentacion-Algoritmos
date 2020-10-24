/** PROBLEMA #7
 * DADA UNA CANTIDAD DE TIEMPO MEDIDA EN HORAS,
 * MINUTOS Y SEGUNDOS, DIGA CUÁNTOS SEGUNDOS
 * EQUIVALE.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo7 {
    public static void ConversionSegundos() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Una Cantidad De Tiempo Aleatorio: ");
            System.out.println("Ingrese Un Valor Para Las Horas: ");
            int horas = teclado.nextInt();

            System.out.println("Ingrese Un Valor Para Los Minutos: ");
            int minutos = teclado.nextInt();

            System.out.println("Ingrese Un Valor Para Los Segundos: ");
            int segundos = teclado.nextInt();

            int conversionTime = (horas * 60 * 60) + (minutos * 60) + segundos;

            System.out.println("\nHoras: " + horas + " Horas" +
                                "\nMinutos: " + minutos + " Minutos" +
                                "\nSegundos: " + segundos + " Segundos" +
                                "\nConversión A Segundos: " + conversionTime + " Segundos");

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
