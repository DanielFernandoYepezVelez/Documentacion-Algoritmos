/** PROBLEMA #6
 * CALCULAR EL SALARIO DE UN EMPLEADO, TENIENDO
 * EN CUENTA QUE SI EL SALARIO BRUTO ES SUPERIOR
 * A $2.000.000, DEBE HACERSE UNA RETENCIÒN DEL 10%
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo06 {
    public static void Salario() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Salario De Un Empleado: ");
            double salario = teclado.nextDouble();

            if(salario > 2_000_000) {
                double retencion = salario * 0.10;
                double salarioFinal = salario - retencion;

                System.out.println("\nSalario Empleado: " + salario + "$" +
                                   "\nRetenciòn: " + retencion + "$" +
                                   "\nSalario Final: " + salarioFinal + "$");
                return;
            }

            System.out.println("\nSalario Empleado: " + salario + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
