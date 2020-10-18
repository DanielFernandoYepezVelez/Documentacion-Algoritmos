/** PROBLEMA #13
 * DADAS LAS HORAS TRABAJADAS DE UNA PERSONA Y EL VALOR POR HORA.
 * CALCULAR SU SALARIO E IMPRIMIRLO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo13 {
    public static void SalarioPersona() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Total De Horas Trabajadas: ");
            int horas = teclado.nextInt();

            System.out.println("Ingrese El Valor Por Hora: ");
            double valorHora = teclado.nextDouble();

            double sueldoBase = horas * valorHora;

            System.out.println("\nHoras Trabajadas: " + horas + " Horas" +
                                "\nValor Hora: " + valorHora + "$" +
                                "\nSueldo Base: " + sueldoBase + "$");

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
