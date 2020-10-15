/* PROBLEMA #1
* LEA TRES NÚMEROS Y CALCULE EL RESULTADO DE LA SUMA.
*/

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo1 {
    private static double valor = 0;

    public static void Suma() {
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresar Un Valor #"+(i+1)+": ");
                algoritmo1.valor += teclado.nextDouble();
            }

            System.out.println("\nSuma Total: " + valor);

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
