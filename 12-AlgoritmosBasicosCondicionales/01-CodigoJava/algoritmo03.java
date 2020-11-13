/** PROBLEMA #3
 * ELABORE UN ALGORITMO QUE LEA UN NÙMERO Y SI ESTE ES
 * MAYOR O IGUAL A 10 DEVUELVA EL TRIPLE DE ESTE, DE LO
 * CONTRARIO LA CUARTA PARTE DE ESTE.
 * */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo03 {
    public static void Numero() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Valor Nùmero: ");
            double numero = teclado.nextDouble();

            if (numero >= 10) {
                System.out.println("\nNùmero Ingresado: " + numero +
                                   "\nNumero Triplicado (x3): " + (numero * 3));

            } else {
                System.out.println("\nNùmero Ingresado: " + numero +
                                   "\nCuarta Parte Del Nùmero (1/4): " + (numero / 4));
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
