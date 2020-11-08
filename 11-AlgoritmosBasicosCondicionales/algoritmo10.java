/** PROBLEMA #10
 * LEER LA EDAD DE UNA PERSONA E IMPRIMIR UN MENSAJE
 * EN CASO QUE SEA MAYOR DE EDAD.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo10 {
    public static void Edad() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresa Tu Edad: ");
            int edad = teclado.nextInt();

            if(edad >= 18) {
                System.out.println("\nEres Mayor De Edad.");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
