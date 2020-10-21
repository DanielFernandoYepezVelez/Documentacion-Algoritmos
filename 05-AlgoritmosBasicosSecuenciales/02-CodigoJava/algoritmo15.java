/** PROBLEMA #15
 * REALICE EL ALGORITMO PARA DETERMINAR
 * EL PROMEDIO QUE OBTENDRA UN ALUMNO
 * CONSIDERANDO QUE REALIZA TRES EXAMENES
 * DE LOS CUALES EL PRIMERO Y EL SEGUNDO
 * TIENEN UNA PONDERACIÓN DE 25%, MIENTRAS
 * QUE EL TERCERO EL 50%.
 * */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo15 {
    public static void PromedioAlumno() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Nota Del Primer Examen: ");
            double notaUno = teclado.nextDouble() * 0.25;

            System.out.println("Ingrese La Nota Del Segundo Examen: ");
            double notaDos = teclado.nextDouble() * 0.25;

            System.out.println("Ingrese La Nota Del Tercero Examen: ");
            double notaTres = teclado.nextDouble() * 0.50;

            double promedio = notaUno + notaDos + notaTres;

            System.out.println("\nPromedio Alumno: " + promedio);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
