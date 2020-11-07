/** PROBLEMA #3
 * DESARROLLE UN PROGRAMA QUE PERMITA DETERMINAR
 * EL VALOR DE LA FUNCIÓN (Y) PARA UN VALOR DE X
 * INGRESADO POR EL USUARIO.
 *
 *             6
 *            ---X + 12      Si X <= 10
 *             5
 *
 * Y = f(X) = X2 - 8         Si 10 < X <= 25
 *
 *           X + 3
 *              ---          Si 25 < X <= 72
 *               2
 *
 * PARA LOS DEMÁS VALORES DE X, f(x) DEBE SER IGUAL A 0.
 */

package com.danielfernandoyepezvelez;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo03 {
    public static void Ecuacion() {
        double funcionY = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Valor Para X: ");
            double equix = teclado.nextDouble();

            if(equix <= 10) {
                funcionY = ((6 / 5) * equix) + 12;
                System.out.println("entro uno");

            } else if (equix > 10 && equix <= 25) {
                funcionY = Math.pow(equix, 2) - 8;
                System.out.println("entro Dos");

            } else if (equix > 25 && equix <= 72) {
                funcionY = equix + (3 / 2);
                System.out.println("entro Tres");
            }

            System.out.println("\nValor X: " + equix +
                               "\nValor Funciòn (Y) = f(x): " + funcionY);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido." + e);
        }
    }
}
