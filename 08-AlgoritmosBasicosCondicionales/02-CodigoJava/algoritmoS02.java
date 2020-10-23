/** PROBLEMA #2
 * ESCRIBA UN ALGORITMO QUE LEA UN NÙMERO Y DIGA SI FUE 0 O 1.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS02 {
    public static void Numero() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Nùmero: ");
            double numero = teclado.nextDouble();

            if (numero == 1) {
                System.out.println("El Nùmero Ingresado Es El \"1\"");

            } else if (numero == 0) {
                System.out.println("El Nùmero Ingresado Es El \"0\"");

            } else {
                System.out.println("El Nùmero Ingresado Es Distinto Del 1 Y El 0.");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
