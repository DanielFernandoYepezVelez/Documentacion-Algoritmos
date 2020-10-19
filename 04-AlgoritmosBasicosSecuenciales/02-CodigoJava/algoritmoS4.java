/** PROBLEMA #4
 * CREE UN ALGORITMO QUE CALCULE CUANTOS MESES DE EMBARAZO
 * TIENE UNA MUJER, PEDIR COMO DATO DE ENTRADA LAS SEMANAS.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS4 {
    public static void Embarazo() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Cuantas Semanas Tienes De Gestación: ");
            int gestacion = teclado.nextInt();

            int meses = gestacion / 4;

            System.out.println("\nSemanas: " + gestacion +
                               "\nMeses: " + meses);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
