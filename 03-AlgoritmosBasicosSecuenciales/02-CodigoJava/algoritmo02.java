/** PROBLEMA #2
 * LEA DOS NUMEROS Y CALCULE EL RESULTADO DE LA SUMA, RESTA, MULTIPLICACIÓN Y SUMA.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo2 {
    public static void Operaciones() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresa Un Valor #1: ");
            double valorUno = teclado.nextDouble();

            System.out.println("Ingresa Un Valor #2: ");
            double valorDos = teclado.nextDouble();

            double suma = valorUno + valorDos;
            double resta = valorUno - valorDos;
            double producto = valorUno * valorDos;
            double division = valorUno / valorDos;

            System.out.println("\nSuma: " + suma +
                               "\nResta: " + resta +
                               "\nMultiplicación: " + producto +
                               "\nDivisión: " + division);

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
