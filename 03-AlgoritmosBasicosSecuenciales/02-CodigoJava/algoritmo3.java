/** PROBLEMA #3
 * DADAS LAS 3 NOTAS DE UN APRENDIZ, CALCULE LA DEFINITIVA DE LA ASIGNATURA.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo3 {
    private static double valores = 0;

    public static void Promedio() {
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresar La Nota #"+(i+1)+": ");
                valores += (teclado.nextDouble()) / 3;
            }

            System.out.println("\nDefinitiva Asignatura: " + valores);

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
