/** PROBLEMA #12
 * HACER UN ALGORITMO QUE LEA LA ESTATURA DE UNA PERSONA Y SI
 * ES MAYOR DE 1.70, IMPRIMA QUE ES UNA PERSONA ALTA.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo12 {
    public static void Alta() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresar Estatura Promedio: ");
            double estatura = teclado.nextDouble();

            if(estatura > 1.70) {
                System.out.println("\nEres Una Persona ALTA.");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
