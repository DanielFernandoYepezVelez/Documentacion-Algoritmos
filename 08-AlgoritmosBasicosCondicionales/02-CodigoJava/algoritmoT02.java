/** PROBLEMA #2
 * PASAR UN DIAGRAMA DE FLUJO A CODIGO JAVA.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoT02 {
    public static void Reescribir() {
        double promedio = 0;
        double[] notas = new double[3];
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Ingrese La Nota #"+(i+1)+": ");
                notas[i] = teclado.nextDouble();

                promedio += notas[i] / 3;
            }

            System.out.println(promedio);

            if(promedio >= 7) {
                System.out.println("Promocionado");

            } else if(promedio >= 4 && promedio < 7) {
                System.out.println("Regular");

            } else {
                System.out.println("Reprobado");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
