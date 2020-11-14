/** PROBLEMA #8
 * ELABORAR UN ALGORITMO QUE PERMITA CALCULAR EL
 * NÙMERO DE PULSACIONES QUE DEBE TENER UNA PERSONA
 * POR CADA 10 SEGUNDOS DE EJERCICIO AEROBICO, LA
 * FORMULA QUE SE APLICA ESTA RELACIONADA BIOLOGICAMENTE
 * AL SEXO.
 *
 * FÒRMULA SEXO FEMENINO:
 * numPulsaciones = (220 - edad) / 10;
 *
 * FÒRMULA SEXO MASCULINO:
 * numPulsaciones = (210 - edad) / 10;
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo08 {
    public static void Pulsaciones() {
        double numPulsaciones = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Edad: ");
            int edad = teclado.nextInt();

            System.out.println("Ingrese El Sexo (M o F): ");
            String sexo = teclado.next();

            if (sexo.contains("M") || sexo.contains("m")) {
                numPulsaciones = (210 - edad) / 10;

            } else if (sexo.contains("f") || sexo.contains("F")) {
                numPulsaciones = (220 - edad) / 10;

            } else {
                System.out.println("El Sexo Ingresado No Es Vàlido.");
            }

            System.out.println("\nGenero: " + sexo +
                               "\nEdad: " + edad +
                               "\nPulsaciones: " + numPulsaciones + " Cada 10 Segundos.");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
