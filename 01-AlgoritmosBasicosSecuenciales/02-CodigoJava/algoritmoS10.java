/* PROBLEMA #10
* UN ALUMNO DESEA SABER CUAL SERA SU CALIFICACIÓN FINAL
* EN LA MATERIA DE ALGORITMOS. DICHA CALIFICACIÓN SE COMPONE
* DE LOS SIGUIENTES PORCENTAJES:
*
* 55% DEL PROMEDIO DE SUS TRES CALIFICACIONES PARCIALES.
* 15% DE LA CALIFICACIÓN DE UN TRABAJO FINAL.
* 30% DE LA CALIFICIACIÓN DEL EXAMEN FINAL.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS10 {
    public static String promedioFinal() {
        double nota[] = new double[3];
        double notas = 0, promedioNotas = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese La Nota #"+(i+1)+":" );
            nota[i] = teclado.nextDouble();

            notas += nota[i];
            promedioNotas = notas / 3;
        }

        System.out.println("Ingrese La Nota Del Trabajo Final: ");
        double trabajoFinal = teclado.nextDouble();

        System.out.println("Ingrese La Nota Del Examen Final: ");
        double examenFinal = teclado.nextDouble();

        double valorPorcentajeUno = promedioNotas * 0.55;
        double valorPorcentajeDos = examenFinal * 0.15;
        double valorPorcentajeTres = trabajoFinal * 0.30;

        double promedioFinal = valorPorcentajeUno + valorPorcentajeDos + valorPorcentajeTres;

        return "\nPromedio Tres Notas Iniciales (55%): " + promedioNotas +
                "\nNota Trabajo Final (15%): " + trabajoFinal +
                "\nNota Examen Final (30%): " + examenFinal +
                "\nNota Final Algoritmos: " + promedioFinal;
    }
}
