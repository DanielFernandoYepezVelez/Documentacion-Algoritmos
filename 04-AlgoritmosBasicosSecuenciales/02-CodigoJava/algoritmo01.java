/** PROBLEMA #1
 * CREAR UN ALGORITMO QUE ESCRIBA/IMPRIMA "HOLA MUNDO"
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;

public class algoritmo01 {
    public static void Saludo() {
        try {
            System.out.println("***** HOLA MUNDO *****");

        } catch (InputMismatchException e) {
            System.out.println("Valor Ingresado No Es Valido");
        }
    }
}
