/** PROBLEMA #2
 * A UN TRABAJADOR LE DESCUENTAN DE SU SUELDO EL 10%
 * SI SU SUELDO ES MENOR O IGUAL A 1.000.000 Y HASTA
 * 2.000.000 EL 5% DEL ADICIONAL, Y POR ENCIMA DE
 * 2.000.000 EL 3% DEL ADICIONAL. CALCULAR EL DESCUENTO
 * Y EL SUELDO NETO QUE RECIBE EL TRABAJADOR DADO SU
 * SUELDO INICIAL.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS02 {
    public static void SalarioTrabajador() {
        double descuento = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Salario Del Trabajador: ");
            double salario = teclado.nextDouble();

            System.out.println("Ingrese El Valor Del Adicional: ");
            double adicional = teclado.nextDouble();

            if(salario <= 1_000_000) {
                descuento = salario * 0.10;

            } else if(salario <= 2_000_000) {
                descuento = adicional * 0.05;

            } else if(salario > 2_000_000) {
                descuento =  adicional * 0.03;
            }

            double sueldoNeto = (salario + adicional) - descuento;

            System.out.println("\nSalario Inicial: " + salario + "$" +
                               "\nValor Adicional: " + adicional + "$" +
                               "\nValor Descuento: " + descuento + "$" +
                               "\nSueldo Neto: " + sueldoNeto + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
