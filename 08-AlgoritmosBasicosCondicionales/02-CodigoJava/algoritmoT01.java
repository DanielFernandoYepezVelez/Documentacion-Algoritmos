/** PROBLEMA #1
 * UNA TIENDA OFRECE MEMORIAS USB CON DESCUENTO, SEGÙN LA CANTIDAD
 * QUE SE ADQUIERA, DE ACUERDO CON LA SIGUIENTE TABLA:
 *
 * CANTIDAD MEMORIAS   DESCUENTO
 *     1 - 3              5%
 *     4 - 10             10%
 *  11 EN ADELANTE        15%
 *
 *  CALCULAR CUÀNTO DEBE PAGAR POR LAS MEMORIAS Y CUÀNTO ES EL AHORRO
 *  O DESCUENTO TOTAL APLICADO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoT01 {
    public static void MemoriasUSB() {
        double compra = 0, desc = 0, pagoTotal = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Precio De La Memoria USB: ");
            double precio = teclado.nextDouble();

            System.out.println("Ingrese La Cantidad De Memorias USB Que Desea Comprar: ");
            int cantidad = teclado.nextInt();

            if (cantidad >= 1 && cantidad <= 3) {
                compra = precio * cantidad;
                desc = compra * 0.05;
                pagoTotal = compra - desc;

            } else if (cantidad >= 4 && cantidad <= 10) {
                compra = precio * cantidad;
                desc = compra * 0.10;
                pagoTotal = compra - desc;

            } else {
                compra = precio * cantidad;
                desc = compra * 0.15;
                pagoTotal = compra - desc;
            }

            System.out.println("\nPrecio Inicial: " + precio + "$" +
                               "\nCantidad Memorias: " + cantidad +
                               "\nValor Compra: " + compra + "$" +
                               "\nDescuento: " + desc + "$" +
                               "\nPago Total: " + pagoTotal + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
