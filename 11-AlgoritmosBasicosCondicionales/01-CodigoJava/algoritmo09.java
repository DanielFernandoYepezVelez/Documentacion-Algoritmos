/** PROBLEMA #9
 * LEER UN NÙMERO E IMPRIMIR UN MENSAJE EN CASO DE QUE SEA
 * MULTIPLO DE 5.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo09 {
    public static void Cinco() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresa Un Nùmero: ");
            double numero = teclado.nextDouble();

            if (numero % 5 == 0) {
                System.out.println("\nEl Nùmero Ingresado Es Mùltiplo De 5. => " + numero);
                return;
            }

            System.out.println("\nEl Nùmero Ingresado Es => " + numero);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
