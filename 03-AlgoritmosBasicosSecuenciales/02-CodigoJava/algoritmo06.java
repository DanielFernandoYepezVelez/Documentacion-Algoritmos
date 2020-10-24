/** PROBLEMA #6
 * LEA LA CANTIDAD DE DINERO CORRESPONDIENTE A UNA
 * COMPRA Y CALCULE EL VALOR DEL IVA (16%) Y EL
 * VALOR TOTAL DE LA FACTURA, SI AL VALOR DE LA COMPRA
 * SE LE AUTORIZA UN DESCUENTO DEL 10% (ANTES DE APLICARLE
 * EL IVA).
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo6 {
    public static void Compra() {
        double compra = 0, iva = 0, descuento = 0, compraDescontada = 0, total = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor De La Compra: ");
            compra = teclado.nextDouble();

            if(compra > 30000) {
                descuento = compra * 0.10;
                compraDescontada = compra - descuento;
                iva = compraDescontada * 0.16;
                total = compraDescontada + iva;

            } else {
                iva = compra * 0.16;
                total = compra + iva;
            }

            System.out.println("\nValor Compra: " + compra + "$" +
                    "\nDescuento: " + descuento + "$" +
                    "\nCompra Con Descuento: " + compraDescontada + "$" +
                    "\nIva: " +  iva + "$" +
                    "\nTotal Compra: " + total + "$");

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}