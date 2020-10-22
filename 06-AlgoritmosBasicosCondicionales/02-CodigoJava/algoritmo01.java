/** PROBLEMA #1
 * ESCRIBIR EL ALGORITMO QUE CALCULE Y MUESTRE EL VALOR
 * DE X, DE ACUERDO CON LO SIGUIENTE:
 *
 * X = 0 SI Y < A y (A < B < C)
 * X = 1 SI A <= Y < B
 * X = 2 SI B <= Y < C
 * X = 3 SI C <= Y
 * X = 4 SI NO SE CUMPLE NINGUNA DE LAS ANTERIORES.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo01 {
    public static void Valor() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Valor Numerico Para Y: ");
            double Y = teclado.nextDouble();

            System.out.println("Ingrese Un Valor Numerico Para A: ");
            double A = teclado.nextDouble();

            System.out.println("Ingrese Un Valor Numerico Para B: ");
            double B = teclado.nextDouble();

            System.out.println("Ingrese Un Valor Numerico Para C: ");
            double C = teclado.nextDouble();

            if((Y < A) && (A < B) && (B < C)) {
                System.out.println("\n***** X = 0 *****");

            } else if ((A <= Y) && (Y < B)) {
                System.out.println("\n***** X = 1 *****");

            } else if ((B <= Y) && (Y < C)) {
                System.out.println("\n***** X = 2 *****");

            } else if (C <= Y) {
                System.out.println("\n***** X = 3 *****");

            } else {
                System.out.println("\n***** X = 4 *****");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
