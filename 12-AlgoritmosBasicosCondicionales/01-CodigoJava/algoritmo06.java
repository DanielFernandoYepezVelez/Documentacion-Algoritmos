/** PROBLEMA #6
 * CALCULAR E IMPRIMIR EL SALARIO DE UN EMPLEADO,
 * TENIENDO EN CUENTA QUE SI EL SALARIO BRUTO ES
 * IGUAL O SUPERIOR A $2_000_000, DEBE HACERSE
 * UNA RETENCIÓN DEL 10%, SI EL SALARIO ES INFERIOR,
 * LA RETENCIÓN SERÁ DEL 3%.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo06 {
    public static void Salario() {
        double retencion = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Salario Bruto Del Empleado: ");
            double salario = teclado.nextDouble();

            if (salario >= 2_000_000) {
                retencion = salario * 0.10;
            } else {
                retencion = salario * 0.03;
            }

            double pagoFinal = salario - retencion;

            System.out.println("\nSalario Bruto Empleado: " + salario +
                               "\nRetenciòn: " + retencion +
                               "\nPago Final: " + pagoFinal);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
