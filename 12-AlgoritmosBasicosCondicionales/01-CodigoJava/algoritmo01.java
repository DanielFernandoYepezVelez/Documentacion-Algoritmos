/** PROBLEMA #1
 * HACER UN ALGORITMO QUE IMPRIMA EL NOMBRE DE UN
 * ARTICULO, CLAVE, PRECIO ORIGINAL Y SU PRECIO CON
 * DESCUENTO. EL DESCUENTO LO HACE EN BASE A LA
 * CLAVE, SI LA CLAVE ES 01 EL DESCUENTO ES DEL
 * 10% Y SI LA CLAVE ES 02 EL DESCUENTO ES DEL 20%
 * (SOLO EXISTEN DOS CLAVES).
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo01 {
    public static void Articulo() {
        double descuento = 0, total = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Nombre Del Producto: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese El Precio Del Producto: ");
            double precio = teclado.nextDouble();

            System.out.println("Solo Existen Dos Tipos De Claves (01 ò 02)");
            System.out.println("Ingrese La Clave Del Producto: ");
            String clave = teclado.next();

            if (clave.contains("01")) {
                descuento = precio * 0.10;
                total = precio - descuento;

            } else if (clave.contains("02")) {
                descuento = precio * 0.20;
                total = precio - descuento;

            } else {
                System.out.println("La Clave Ingresada No Es Vàlida.");
                return;
            }

            System.out.println("\nArticulo: " + nombre +
                               "\nClave: " + clave +
                               "\nPrecio Original: " + precio + "$" +
                               "\nDescuento: " + descuento + "$" +
                               "\nPago Total: " + total + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
