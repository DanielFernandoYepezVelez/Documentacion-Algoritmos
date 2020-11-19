/** PROBLEMA #15
 * EN UN ALMACEN SE HACE UN 17% DE DESCUENTO
 * A LOS CLIENTES CUYA COMPRA SEA SUPERIOR A
 * $200_000, PARA LAS COMPRAS INFERIORES, EL DESCUENTO
 * SERÀ DEL 5%. ¿CUÀNTO DEBERÀ PAGAR CADA CLIENTE?
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo15 {
    public static void Almacen() {
        double descuento = 0, total = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Precio De La Compra Realizada: ");
            double compra = teclado.nextDouble();

            if (compra > 200_000) {
                descuento = compra * 0.17;
                total = compra - descuento;

            } else if (compra <= 200_000) {
                descuento = compra * 0.05;
                total = compra - descuento;
            }

            System.out.println("\nValor De La Compra: " + compra + "$" +
                               "\nDescuento: " + descuento + "$" +
                               "\nPago Total: " + total + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
