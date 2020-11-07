/** PROBLEMA #6
 * CALCULAR LA SUMA DE LOS N NÙMEROS (REPETIR HASTA QUE - DO WHILE).
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo06 {
    public static void NumerosN() {
        int i = 0;
        double acSuma = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Cantidad De Nùmeros Naturales Que Desea Sumar: ");
            int valorNumero = teclado.nextInt();

            do {
                i++;
                acSuma += i;
            } while (i < valorNumero);

            System.out.println("\nCantidad De Nùmeros Sumados: " + valorNumero +
                               "\nSuma Total: " + acSuma);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
