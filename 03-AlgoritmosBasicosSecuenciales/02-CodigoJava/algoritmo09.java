/** PROBLEMA #9
 * UN VENDEDOR RECIBE UN SUELDO BASE MAS UN 10% EXTRA
 * POR COMISIÓN DE SUS VENTAS, EL VENDEDOR DESEA SABER
 * CUÁNTO DINERO OBTENDRA POR CONCEPTO DE COMISIONES
 * POR LAS TRES VENTAS QUE REALIZA EN EL MES Y EL TOTAL
 * QUE RECIBIRA EN EL MES TOMANDO EN CUENTA SU SUELDO
 * BASE Y COMISIONES.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo9 {
    public static void Vendedor() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Sueldo Base: ");
            double sueldoBase = teclado.nextDouble();

            double comisiones = (sueldoBase * 0.10) * 3;
            double sueldoTotal = comisiones + sueldoBase;

            System.out.println("\nSueldo Base: " + sueldoBase + "$" +
                               "\nNumero De Ventas: " + 3 +
                               "\nValor Comisiones (10%): " + comisiones + "$" +
                               "\nSueldo Total: " + sueldoTotal + "$");

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
