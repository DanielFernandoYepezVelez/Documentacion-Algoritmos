/** PROBLEMA #3
 * UN PROVEEDOR DE COMPUTADORES OFRECE UN DESCUENTO DEL 10%,
 * SI CUESTA UN $1.000.000 O MÀS. DETERMINA CUANTO PAGARA, CON
 * IVA INCLUIDO (16%), UN CLIENTE SI LA COMPRA CUMPLE CON ESTA
 * CONDICIÒN.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo03 {
    public static void Computadores() {
        Scanner teclado = new Scanner(System.in);
        double IVA = 0.16, pago = 0, pagoTotal = 0;

        try {
            System.out.println("Ingrese Precio Del Computador Que Desea Comprar: ");
            double precio = teclado.nextDouble();

            System.out.println("Ingrese La Cantidad De Productos Que Va Comprar: ");
            int cantidad = teclado.nextInt();

            if(precio >= 1_000_000) {
                IVA = precio * 0.16;
                pago = precio * cantidad;
                pagoTotal = pago + IVA;

                System.out.println("\nPrecio Equipo: " + precio + "$" +
                        "\nCantidad: " + cantidad +
                        "\nPago Sin IVA: " + pago + "$" +
                        "\nValor IVA: " + IVA + "$" +
                        "\nPago Total: " + pagoTotal + "$");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
