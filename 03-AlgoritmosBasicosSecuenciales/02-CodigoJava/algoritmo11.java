/** PROBLEMA #11
 * UN ALUMNO DESEA SABER CUÁL SERÁ SU CALIFICACIÓN FINAL EN
 * LA MATERIA DE ALGORITMOS. DICHA CALIFICACIÓN SE COMPONE
 * DE LOS SIGUIENTES PORCENTAJES:
 *
 * 55% DEL PROMEDIO DE SUS TRES CALIFICACIONES PARCIALES.
 * 30% DE LA CALIFICACIÓN DEL EXAMEN FINAL.
 * 15% DE LA CALIFICACIÓN DE UN TRABAJO FINAL.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo11 {
    public static void AlumnoCalificacion() {
        double notasParciales = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 1; i < 4 ; i++) {
                System.out.println("Ingrese La Nota #" + i + ": ");
                notasParciales += (teclado.nextDouble() / 3) * 0.55;
            }

            System.out.println("Ingrese La Nota Del Trabajo Final: ");
            double trabajoFinal = teclado.nextDouble() * 0.30;

            System.out.println("Ingrese La Nota Del Examen Final: ");
            double examenFinal = teclado.nextDouble() * 0.15;

            double promedioAlgoritmos = notasParciales + trabajoFinal + examenFinal;

            System.out.println("\nPromedio Algoritmos: " + promedioAlgoritmos);

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
