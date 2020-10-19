/** PROBLEMA #15
 *  SUPONGA QUE USTED TIENE UNA TIENDA Y DESEA REGISTRAR LAS VENTAS
 * EN UNA COMPUTADORA. DISEÑE UN ALGORITMO EN PSEUDOCÓDIGO QUE LEA
 * POR CADA CLIENTE:
 *
 * EL MONTO DE LA VENTA, CALCULE E IMPRIMA EL IVA.
 * CALCULE E IMPRIMA EL TOTAL A PAGAR.
 * LEA LA CANTIDAD CON LA QUE PAGA EL CLIENTE(SOLO EFECTIVO)
 * CALCULE E IMPRIMA EL CAMBIO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo15 {
    public static void Cliente() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor De La Compra: ");
            double compra = teclado.nextDouble();

            System.out.println("Ingrese El Pago(Solo Efectivo): ");
            double pago = teclado.nextDouble();

            double iva = compra * 0.19;
            double total = compra + iva;
            double cambio = pago - total;

            System.out.println("\nValor Compra: " + compra + "$" +
                    "\nIva: " + iva + "$" +
                    "\nPago Total: " + total + "$" +
                    "\nEfectivo: " + pago +  "$" +
                    "\nRetorno: " + cambio +  "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido " + e);
        }
    }
}
