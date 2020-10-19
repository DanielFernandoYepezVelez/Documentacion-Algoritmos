/** PROBLEMA #1
 * CREAR UN ALGORITMO QUE LEA EL NOMBRE DE UN USUARIO Y LO IMPRIMA.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS1 {
    public static void Nombre() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Su Nombre Completo: ");
            String nombre = teclado.nextLine();

            System.out.println("Nombre: " + nombre);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
