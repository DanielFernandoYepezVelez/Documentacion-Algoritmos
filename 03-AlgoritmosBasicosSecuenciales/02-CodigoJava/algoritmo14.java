/** PROBLEMA #14
 * SE TRATA DE ESCRIBIR EL ALGORITMO QUE PERMITA
 * EMITIR LA FACTURA CORRESPONDIENTE A UNA COMPRA
 * DE VARIOS ARTICULOS(4) DETERMINADOS, DEL QUE SE
 * ADQUIEREN UNA O VARIAS UNIDADES. EL IVA ES DEL
 * 12%.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo14 {
    public static void Factura() {
        String[] artId = new String[4];
        String[] artName = new String[4];
        String[] artPrice = new String[4];
        String[] artQuantity = new String[4];
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 0; i < 4; i++) {
                if (i >= 1) {
                    System.out.println(" ");
                }

                System.out.println("Ingrese El Codigo Del Articulo #" + (i+1) + ": ");
                artId[i] = teclado.nextLine();

                System.out.println("Ingrese El Nombre Del Articulo #" + (i+1) + ": ");
                artName[i] = teclado.nextLine();

                System.out.println("Ingrese El Valor Del Articulo #" + (i+1) + ": ");
                artPrice[i] = teclado.nextLine();

                System.out.println("Ingrese La Cantidad De Unidades Para El Articulo #" + (i+1) + ": ");
                artQuantity[i] = teclado.nextLine();
            }

            System.out.println("\n======== Facturación Articulos ========");
            for (int i = 0; i < 4; i++) {
                System.out.println("Codigo: " + artId[i] + " Nombre: " + artName[i] + " Precio: " + artPrice[i] +
                                   " Cantidad: " + artQuantity[i] +
                                   " Pago Total: " + Integer.parseInt(artPrice[i]) *  Integer.parseInt(artQuantity[i]) + "$");
            }

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
