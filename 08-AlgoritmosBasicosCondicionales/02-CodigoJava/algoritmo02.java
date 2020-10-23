/** PROBLEMA #2
 * ESCRIBA UN ALGORITMO QUE ESCRIBA UNA LETRA Y DIGA SI ES LA "A".
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo02 {
    public static void Letra() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Letra: ");
            String letra = teclado.nextLine();

            if(letra.contains("A") || letra.contains("a")) {
                System.out.println("La Letra Ingresada Es La \"A\"");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
