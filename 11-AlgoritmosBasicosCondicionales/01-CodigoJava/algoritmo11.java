/** PROBLEMA #11
 * LEER 4 NOTAS, CALCULAR EL PROMEDIO E IMPRIMIR UN MENSAJE
 * INDICANDO QUE REPROBO EN CASO QUE LA NOTA SEA MENOR A 3.5
 */

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo11 {
    public static void Promedio() {
        double notas = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Ingrese La Nota #" +(i+1)+":");
                notas += teclado.nextDouble();
            }

            double promedio = notas / 4;

            if (promedio < 3.5) {
                System.out.println("\nPromedio: " + promedio);
                System.out.println("El Estudiante Reprobo");
                return;
            }

            System.out.println("\nPromedio: " + promedio);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
