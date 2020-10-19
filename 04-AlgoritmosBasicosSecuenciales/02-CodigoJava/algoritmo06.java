/** PROBLEMA #6
 * HACER UN PROGRAMA QUE CONVIERTA LOS GRADOS CENTIGRADOS
 * (30 GRADOS) A GRADOS FAHRENHEIT. LA FORMULA ES LA
 * SIGUIENTE: (C * 1.8) + 32.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;

public class algoritmo06 {
    public static void Conversion() {
        int GRADOS = 30;

        try {
            double fahrenheit = (GRADOS * 1.8) + 32;
            System.out.println("\nCentigrados: " + GRADOS + " Grados" +
                               "\nFahrenheit: " + fahrenheit + " Grados");

        } catch (InputMismatchException e) {
            System.out.println("El Valor No Es Válido. " + e);
        }
    }
}
