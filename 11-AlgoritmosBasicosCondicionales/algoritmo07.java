/** PROBLEMA #7
 * LEER UN NÙMERO E IMPRIMIR UN MENSAJE EN
 * CASO QUE SEA NEGATIVO.
 */

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo07 {
    public static void Negativo() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Nùmero: ");
            double numero = teclado.nextDouble();

            if(numero < 0) {
                System.out.println("\nEl Numero Ingresado Es Negativo => " + numero);
                return;
            }

            System.out.println("\nNùmero Ingresado => " + numero);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
