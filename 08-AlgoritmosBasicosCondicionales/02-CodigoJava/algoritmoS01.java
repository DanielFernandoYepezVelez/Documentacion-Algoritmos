/** PROBLEMA #1
 * UNA TIENDA OFRECE UN DESCUENTO DEL 15% POR PAGO EN EFECTIVO
 * EN LA COMPRA DE SUS PRODUCTOS Y 5% SI LA COMPRA ES CON
 * TARJETA DEBITO O CREDITO. DETERMINE EL VALOR DEL DESCUENTO
 * Y EL PRECIO FINAL DEL ARTICULO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS01 {
    public static void TiendaDescuento() {
        Scanner teclado = new Scanner(System.in);
        double compra = 0, desc = 0, pagoTotal = 0;

        System.out.println("Ingrese La Forma De Pago (Efectivo O Tarjeta): ");
        String pago = teclado.nextLine();

        try {
            if(pago.contains("Efectivo") || pago.contains("EFECTIVO") || pago.contains("efectivo") ||
               pago.contains("Tarjeta") || pago.contains("TARJETA") || pago.contains("tarjeta")) {

                System.out.println("\nIngrese El Precio Del Producto: ");
                double precio = teclado.nextDouble();

                System.out.println("Ingrese La Cantidad Del Producto: ");
                int cantidad = teclado.nextInt();

                if(pago.contains("Efectivo") || pago.contains("EFECTIVO") || pago.contains("efectivo")) {
                    compra = precio * cantidad;
                    desc = compra * 0.15;
                    pagoTotal = compra - desc;

                } else if (pago.contains("Tarjeta") || pago.contains("TARJETA") || pago.contains("tarjeta")){
                    compra = precio * cantidad;
                    desc = compra * 0.05;
                    pagoTotal = compra - desc;
                }

                System.out.println("\nPrecio Inicial: " + precio + "$" +
                        "\nCantidad: " + cantidad +
                        "\nDescuento: " + desc + "$" +
                        "\nPago Total: " + pagoTotal + "$");

            } else {
                System.out.println("El Pago Ingresado No Hace Parte Del Menù De Opciones.");
                return;
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
