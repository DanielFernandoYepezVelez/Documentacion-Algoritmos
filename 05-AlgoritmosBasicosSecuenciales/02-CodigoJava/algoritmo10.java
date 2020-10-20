/** PROBLEMA #10
 * SE REQUIERE DETERMINAR EL COSTO QUE TENDRA REALIZAR
 * UNA LLAMADA TELEFONICA CON BASE EN EL TIEMPO QUE
 * DURA LA LLAMADA Y EN EL COSTO POR MINUTO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo10 {
    public static void LlamadaTelefonica() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Los Minutos Que Tardo La Llamada: ");
            int minutos = teclado.nextInt();

            System.out.println("Ingrese El Costo Por Minuto: ");
            double costoMinuto = teclado.nextDouble();

            double pagoLlamada = minutos * costoMinuto;

            System.out.println("\nMinutos: " + minutos +
                               "\nCosto Minuto: " + costoMinuto + "$" +
                               "\nPago Total: " + pagoLlamada + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
