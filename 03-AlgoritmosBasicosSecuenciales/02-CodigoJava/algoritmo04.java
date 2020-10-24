/** PROBLEMA #4
 * DADAS LAS 3 NOTAS DE UN APRENDIZ, CALCULE LA DEFINITIVA
 * DE LA ASIGNATURA, SI LA PRIMERA NOTA TIENE UN VALOR DEL
 * 20%, LA SEGUNDA DEL 30% Y LA ÚLTIMA DEL 50%.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo4 {
    public static void PromedioNotas() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor #1: ");
            double valorUno = teclado.nextDouble() * 0.20;

            System.out.println("Ingrese El Valor #2: ");
            double valorDos = teclado.nextDouble() * 0.30;

            System.out.println("Ingrese El Valor #3: ");
            double valorTres = teclado.nextDouble() * 0.50;

            double promedio = valorDos + valorUno + valorTres;

            System.out.println("\nNota #1 (20%), Nota #2 (30%), Nota #3 (50%)" +
                    "\nPromedio Asignatura: " + promedio);

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
