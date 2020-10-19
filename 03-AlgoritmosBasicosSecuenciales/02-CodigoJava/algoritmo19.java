/** PROBLEMA #19
 * INGRESAR, PARA UN ESTUDIANTE, SUS 5 NOTAS DE UN CURSO, NOMBRE,
 * PROGRAMA, FICHA. HACER UN ALGORITMO QUE:
 *
 * MUESTRE EL NOMBRE.
 * MUESTRE EL PROGRAMA.
 * SE DEBE CALCULAR E IMPRIMIR EL PROMEDIO FINAL.
 * */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo19 {
    public static void NotasEstudinateSena() {
        double acNota = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Número De La Ficha: ");
            String ficha = teclado.nextLine();

            System.out.println("Ingrese El Nombre Del Programa: ");
            String programa = teclado.nextLine();

            System.out.println("Ingrese El Nombre Del Aprendiz: ");
            String nombre = teclado.nextLine();

            for (int i = 1; i < 6; i++) {
                System.out.println("Ingrese La Nota #"+i+" Del Curso: ");
                acNota += teclado.nextDouble() / 5;
            }

            System.out.println("\nFicha: " + ficha +
                               "\nPrograma: " + programa +
                               "\nAprendiz: " + nombre +
                               "\nPromedio: " + acNota);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
