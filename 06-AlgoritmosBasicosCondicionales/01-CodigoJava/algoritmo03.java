/** PROBLEMA #3
 * LEER UN NUMERO ENTERO. SI ES POSITIVO
 * MOSTRAR UN MENSAJE QUE INDIQUE QUE LO
 * ES.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo03 {
    public static void NumeroEntero() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresa Un Numero Entero: ");
            double numero = teclado.nextDouble();

            if(numero > 0) {
                System.out.println("El Número Ingresado Es POSITIVO.");

            } else if(numero == 0) {
                System.out.println("El Número Ingresado Es CERO.");

            } else {
                System.out.println("El Número Ingresado Es NEGATIVO.");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
