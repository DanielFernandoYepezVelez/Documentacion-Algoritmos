/** PROBLEMA #12
 * DETERMINAR CUANTO PAGARA FINALMENTE UNA PERSONA POR
 * UN ARTICULO X, CONSIDERANDO QUE TIENE UN DESCUENTO
 * DE 20% Y DEBE PAGAR 19% DE IVA.
 * (DEBE MOSTRAR EL PRECIO CON DESCUENTO Y EL PRECIO FINAL)
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo12 {
    public static void ArticuloX() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Precio Del Articulo X: ");
            double precio = teclado.nextDouble();

            System.out.println("Ingrese La Cantidad De Dicho Articulo X: ");
            int cantidad = teclado.nextInt();

            double compra = precio * cantidad;
            double descuento = compra * 0.20;
            double iva = compra * 0.19;
            double precioDescuento = compra - descuento;
            double pagoTotal = (compra + iva) - descuento;

            System.out.println("\nCompra: " + compra + "$" +
                               "\nIva: " + iva + "$" +
                               "\nDescuento: " + descuento + "$" +
                               "\nCompra Con Descuento (20%): " + precioDescuento + "$" +
                               "\nPago Total: " + pagoTotal + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
