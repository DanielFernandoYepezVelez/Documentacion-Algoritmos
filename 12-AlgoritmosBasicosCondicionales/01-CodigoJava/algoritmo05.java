/** PROBLEMA #5
 * DETERMINAR EL PRECIO DE UN PASAJE DE IDA Y VUELTA POR AVIÒN,
 * CONOCIENDO LA DISTANCIA A RECORRER Y SABIENDO QUE SI ÈSTA ES
 * SUPERIOR A 1.000KM, LA LINEA ÀEREA LE HACE UN DESCUENTO DEL
 * 30%. EL PRECIO POR KILÒMETRO ES DE $150.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo05 {
    public static void Pasaje() {
        double descuento = 0, total = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Distancia Del Viaje Completo: ");
            double viaje = teclado.nextDouble();

            double ticket = viaje * 150;

            if (viaje > 1_000) {
                descuento = ticket * 0.30;
                total = ticket - descuento;

            } else if (viaje <= 1000) {
                total = ticket;

            } else {
                System.out.println("La Distancia Ingresada No Es Vàlida.");
                return;
            }

            System.out.println("\nDistancia: " + viaje + "Km" +
                               "\nValor Ticket: " + ticket + "$" +
                               "\nDescuento: " + descuento + "$" +
                               "\nPago Total: " + total + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
