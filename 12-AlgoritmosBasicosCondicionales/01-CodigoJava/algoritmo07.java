/** PROBLEMA #7
 * LEER UN NÙMERO E IMPRIMIR UN
 * MENSAJE SI ES PAR O IMPAR.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo07 {
    public static void Numero() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Nùmero: ");
            double numero = teclado.nextDouble();

            if (numero % 2 == 0 ) {
                System.out.println("El Nùmero Ingresado Es Par.");
            } else {
                System.out.println("El Nùmero Ingresado Es Impar.");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
