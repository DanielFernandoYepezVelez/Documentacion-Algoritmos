/** PROBLEMA #4
 * HACER UN ALGORITMO QUE LEA DOS NÙMEROS
 * Y LOS IMPRIMA EN ORDEN ASCENDENTE
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo04 {
    public static void Ascendente() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Primer Nùmero: ");
            double numeroUno = teclado.nextDouble();

            System.out.println("Ingrese Un Segundo Nùmero: ");
            double numeroDos = teclado.nextDouble();

            if (numeroUno > numeroDos) {
                System.out.println("\nNùmeros Ascendentes: " + numeroDos + " -- " + numeroUno);

            } else {
                System.out.println("\nNùmeros Ascendentes: " + numeroUno + " -- " + numeroDos);
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
