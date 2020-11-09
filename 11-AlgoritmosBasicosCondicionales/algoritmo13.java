/** PROBLEMA #13
 * REALIZAR UN ALGORITMO QUE LEA UN NÙMERO Y SI ESTE
 * ES SUPERIOR A 10, PERMITA IMPRIMIR SU CUBO.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo13 {
    public static void NumeroCubo() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresa Un Nùmero: ");
            double numero = teclado.nextDouble();

            if (numero >= 10) {
                double result = Math.pow(numero, 3);

                System.out.println("\nNumero Ingresado: " + numero);
                System.out.println("Valor Cùbico: " + result);
                return;
            }

            System.out.println("\nNumero Ingresado: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
