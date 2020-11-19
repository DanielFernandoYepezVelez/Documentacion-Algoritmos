/** PROBLEMA #14
 * ELABORE UN ALGORITMO QUE LEA UN NÙMERO,
 * SI ES PAR, QUE IMPRIMA EL CUBO Y SI ES
 * IMPAR, QUE IMPRIMA EL TRIPLE.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo14 {
    public static void Numero() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Valor Nùmerico: ");
            double numero = teclado.nextDouble();

            if (numero == 0) {
                System.out.println("\nEl Nùmero Ingresado Es Cero. " + numero);
                return;
            }

            if (numero % 2 == 0) {
                System.out.println("\nEl Nùmero Ingresado Es Par." +
                                   "\nValor Nùmerico: " + numero +
                                   "\nValor Cùbico: " + Math.pow(numero, 3));
            } else {
                System.out.println("\nEl Nùmero Ingresado Es Impar." +
                                   "\nValor Nùmerico: " + numero +
                                   "\nValor Triplicado X3: " + (numero * 3));
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
