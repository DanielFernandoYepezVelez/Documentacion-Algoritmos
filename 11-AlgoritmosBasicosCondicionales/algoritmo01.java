/** PROBLEMA #1
 * LEER UN NÚMERO E IMPRIMIR UN MENSAJE EN CASO DE QUE SEA PAR.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo01 {
    public static void Par() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresar Un Nùmero: ");
            double numero = teclado.nextDouble();

            if(numero % 2 == 0) {
                System.out.println("El Nùmero Ingresado Es Par.");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
