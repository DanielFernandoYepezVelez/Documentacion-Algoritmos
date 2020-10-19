/** PROBLEMA #8
 * REALIZAR EL MISMO PROGRAMA DEL PUNTO(6), PERO
 * AHORA SE LE DEBE PEDIR EL DATO INICIAL AL USUARIO
 * (GRADOS CENTIGRADOS).
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo08 {
    public static void ConversionUsuario() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Valor(Grados Centigrados): ");
            double grados = teclado.nextDouble();

            double fahrenheit = (grados * 1.8) + 32;

            System.out.println("\nCentigrados: " + grados + " Grados" +
                    "\nFahrenheit: " + fahrenheit + " Grados");

        } catch (InputMismatchException e) {
            System.out.println("El Valor No Es Válido. " + e);
        }
    }
}
