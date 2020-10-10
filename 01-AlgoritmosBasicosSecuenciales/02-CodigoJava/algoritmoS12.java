/* PROBLEM #12
 * UN CONSTRUCTOR SABE QUE NECESITA 0.5 METROS CUBICOS DE ARENA
 * POR METRO CUADRADO DE REVOQUE A REALIZAR. HACER UN PROGRAMA
 * DONDE INGRESE LAS MEDIDAS DE UNA PARED (LARGO Y ANCHO)
 * EXPRESADA EN METROS Y OBTENGA LA CANTIDAD DE ARENA NECESARIA
 * PARA REVOCARLA.
 */

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS12 {
    public static String Revoque() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese La Altura De La Pared: ");
        double altura = teclado.nextDouble();

        System.out.println("Ingrese El Ancho De La Pared: ");
        double ancho = teclado.nextDouble();

        double metrosPared = ancho + altura;
        double arena = metrosPared * 0.5;

        return "\nMetros Cuadrados Revoque: " + metrosPared +
                "\nMetros Cubicos Arena: " + arena;
    }
}