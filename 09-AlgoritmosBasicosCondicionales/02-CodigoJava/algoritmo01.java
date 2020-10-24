/** PROBLEMA #1
 * UN VENDEDOR DE TELEVISORES OFRECE UN DESCUENTO DEL 15% SOBRE
 * EL PRECIO SIN IVA, PARA CUALQUIER APARATO CUYO PRECIO SUPERE
 * $1.000.000; ADEMÀS, OFRECE UN 7% SOBRE EL PRECIO SIN IVA, SI
 * EL APARATO ES MARGA LG. DETERMINAR CUÀTO DEBE PAGAR CON IVA
 * INCLUIDO (19%) CUALQUIER COMPRADOR.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo01 {
    public static void Televisores() {
        double desc1 = 0, desc2 = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Marca Del Televisor (LG u Otro): ");
            String marca = teclado.nextLine();

            System.out.println("Ingrese El Precio Del Televisor: ");
            double precio = teclado.nextDouble();

            if(precio > 1_000_000){
                desc1 = precio * 0.15;
            }

            if(marca.contains("LG") || marca.contains("lg")) {
                desc2 = precio * 0.07;
            }

            double iva = precio * 0.19;
            double pagoTotal = (precio + iva) - (desc1 + desc2);

            System.out.println("\nPrecio Inicial: " + precio + "$" +
                               "\nMarca: " + marca +
                               "\nDescuento Precio: " + desc1 + "$" +
                               "\nDescuento Marca: " + desc2 + "$" +
                               "\nIva: " + iva + "$" +
                               "\nPago Total: " + pagoTotal + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
