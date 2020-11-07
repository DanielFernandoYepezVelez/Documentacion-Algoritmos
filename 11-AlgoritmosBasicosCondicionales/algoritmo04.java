/** PROBLEMA #4
 * REALIZAR UN ALGORITMO QUE LEA DOS NÙMEROS
 * E IMPRIMA LA SUMA DE LOS 2, EN CASO QUE EL
 * PRIMERO SEA MAYOR QUE EL SEGUNDO.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo04 {
    public static void Suma() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Nùmero #1: ");
            double numeroUno = teclado.nextDouble();

            System.out.println("Ingrese Un Nùmero #2: ");
            double numeroDos = teclado.nextDouble();

            if(numeroUno > numeroDos) {
                System.out.println("\nNùmero #1: " + numeroUno);
                System.out.println("Nùmero #2: " + numeroDos);
                System.out.println("Suma Nùmerica: " + (numeroUno + numeroDos));
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
