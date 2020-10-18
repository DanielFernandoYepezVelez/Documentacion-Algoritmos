/** PROBLEMA #10
 * UNA TIENDA OFRECE UN DESCUENTO DEL 15%
 * SOBRE EL TOTAL DE LA COMPRA Y UN CLIENTE
 * DESEA SABER CUÁNTO DEBERÁ PAGAR AL FINAL
 * POR SU COMPRA.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo10 {
    public static void PagoTienda() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor Total De La Compra: ");
            double compra = teclado.nextDouble();

            double descuento = compra * 0.15;
            double pagoTotal = compra - descuento;

            System.out.println("\nValor Compra: " + compra + "$" +
                    "\nDescuento (15%): " + descuento + "$" +
                    "\nPago Total: " + pagoTotal + "$");

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
