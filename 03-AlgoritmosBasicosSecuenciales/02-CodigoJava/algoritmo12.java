/** PROBLEMA #12
 * UN MAESTRO DESEA SABER QUE PORCENTAJE DE HOMBRES Y
 * QUÉ PORCENTAJE DE MUJERES HAY EN UN GRUPO DE ALUMNOS.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo12 {
    public static void PorcentajeAlumnos() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Numero De Hombres: ");
            int hombres = teclado.nextInt();

            System.out.println("Ingrese El Numero De Mujeres: ");
            int mujeres = teclado.nextInt();

            int totalAlumnos = hombres + mujeres;

            int porcentajeM = (hombres * 100) / totalAlumnos;
            int porcentajeF = (mujeres * 100) / totalAlumnos;

            System.out.println("\nTotal Alumnos: " + totalAlumnos + " Alumnos" +
                               "\nHombres: " + hombres +
                               "\nMujeres: " + mujeres +
                               "\nPorcentaje Hombres: " + porcentajeM + "%" +
                               "\nPorcentaje Mujeres: " + porcentajeF + "%");

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
