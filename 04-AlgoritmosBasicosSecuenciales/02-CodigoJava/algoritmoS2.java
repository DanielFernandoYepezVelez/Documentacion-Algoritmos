/** PROBLEMA #2
 * CREAR UN ALGORITMO QUE LE PIDA AL USUARIO 3 NUMEROS,
 * CALCULAR LA SUMA DE LOS 3 E IMPRIMIR EL RESULTADO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS2 {
    public static void SumaTres() {
        double numeros = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 1; i < 4; i++) {
                System.out.println("Ingrese El Número #"+i+": ");
                numeros += teclado.nextDouble();
            }

            System.out.println("\nSuma Total: " + numeros);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
