/** PROBLEMA #1
 * UN EQUIPO DE FUTBOL HA TENIDO UNA BUENA CAMPAÑA
 * Y DESEA PREMIAR A SUS JUGADORES CON UN AUMENTO
 * DEL SALARIO PARA LA SIGUIENTE CAMPAÑA. LOS SALARIOS
 * DEBEN AJUSTARSE DE LA SIGUIENTE FORMA:
 *
 * SUELDO ACTUAL               POSICIÒN                       AUMENTO
 * 0 - $2.000.000              DELANTERO                        20%
 * $2.000.001 - $5.000.000     VOLANTE DE MARCA O DELANTERO     10%
 * $5.000.001 - $10.000.000    VOLANTE DE MARCA O DEFENSA       5%
 * SUPERIOR A $10.000.000      DEFENSA O ARQUERO                0%
 *
 * ELABORE UN ALGORITMO QUE LEA EL SALARIO DE UN JUGADOR Y QUE
 * IMPRIMA EL PORCENTAJE DE AUMENTO, EL SALARIO ACTUAL Y EL SALARIO
 * AUMENTADO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS01 {
    public static void SalarioJugador() {
        double aumento = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Su Salario Actual: ");
            double salario = teclado.nextDouble();

            if(salario <= 2_000_000) {
                aumento = salario * 0.20;

            } else if(salario >= 2_000_001 && salario <= 5_000_000) {
                aumento = salario * 0.10;

            } else if(salario >= 5_000_001 && salario <= 10_000_000) {
                aumento = salario * 0.05;

            } else {
                aumento = salario * 0;
            }

            double salarioFinal = salario + aumento;

            System.out.println("\nSalario Actual: " + salario +
                               "\nAumento: " + aumento +
                               "\nSalario Aumentado: " + salarioFinal);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
