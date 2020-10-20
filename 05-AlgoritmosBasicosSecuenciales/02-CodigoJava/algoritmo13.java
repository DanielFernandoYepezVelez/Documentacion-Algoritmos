/** PROBLEMA #13
 * DETERMINAR CUANTO DINERO AHORRA UNA PERSONA EN UN AÑO
 * SI CONSIDERA QUE AHORRA CADA SEMANA 15% DE SU SUELDO
 * (CONSIDERE CUATRO SEMANAS POR MES Y QUE NO CAMBIA
 * EL SUELDO).
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo13 {
    public static void AhorroPersona() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Salario Mensual: ");
            double salarioMensual = teclado.nextDouble();

            double ahorroSemanal = salarioMensual * 0.15;
            double ahorroMensual = ahorroSemanal * 4;
            double ahorroAnual = ahorroMensual * 12;

            System.out.println("\nSalario: " + salarioMensual + "$" +
                               "\nAhorro Semanal: " + ahorroSemanal + "$" +
                               "\nAhorro Mensual: " + ahorroMensual + "$" +
                               "\nAhorro Anual: " + ahorroAnual + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
