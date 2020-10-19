/** PROBLEMA #3
 * CREAR UN ALGORITMO QUE PERMITA LEER LA EDAD
 * Y EL PESO DE UNA PERSONA Y POSTERIORMENTE
 * IMPRIMIRLA.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS3 {
    public static void PesoEdad() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Edad: ");
            int edad = teclado.nextInt();

            System.out.println("Ingrese El Peso: ");
            double peso = teclado.nextDouble();

            System.out.println("\nEdad: " + edad + " Años" +
                               "\nPeso: " + peso + " Kilogramos");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingreso No Es Válido. " + e);

        }
    }
}
