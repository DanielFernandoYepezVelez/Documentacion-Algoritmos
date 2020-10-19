/** PROBLEMA #7
 * PEDIR UN NÚMERO AL USUARIO Y ESCRIBIRLO/IMPRIMIRLO SUMÁNDOLE 10.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo07 {
    public static void NumeroUsuario() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Numero: ");
            double numero = teclado.nextDouble();

            double suma = numero + 10;

            System.out.println("\nNumero Inicial: " + numero +
                               "\nSuma: " + suma);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
