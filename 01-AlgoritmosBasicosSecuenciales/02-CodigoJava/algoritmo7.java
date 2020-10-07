/* PROBLEMA #7
* ELABORE UN ALGORITMO QUE LEA UN DATO, EL CUAL ES EL VALOR DE
* UN ANGULO EN GRADOS Y LO CONVIERTA E IMPRIMA EN RADIANES.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo7 {
    public static String angulo() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese El Valor De Un Angulo: ");
        double angulo = teclado.nextDouble();

        double radianes = (angulo / 180) * Math.PI;

        return "Angulo Grados: " + angulo + "\nAngulo Radianes: " + radianes;
    }
}
