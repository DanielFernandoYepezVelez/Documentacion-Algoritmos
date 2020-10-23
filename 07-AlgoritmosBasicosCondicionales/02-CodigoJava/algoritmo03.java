/** PROBLEMA #3
 * LEER CUATRO NUMEROS (N1, N2, N3, N4) CON 1 DIGITO DESPUÈS DEL PUNTO
 * DECIMAL, CORRESPONDIENTE A 4 RESULTADOS OBTENIDOS POR UN ESTUDIANTE.
 * CALCULAR EL PROMEDIO PARA ESTOS 4 RESULTADOS E IMPRIMIR EL MENSAJE
 * "PROMEDIO: ", SEGUIDO POR EL CÀLCULO OBTENIDO.
 *
 * SI EL PROMEDIO ES DE 7.0 O MÀS, IMPRIMIR EL MENSAJE "ESTUDIANTE
 * APROBADO." SI EL PROMEDIO ES MENOR QUE 5.0, IMPRIMIR EL MENSAJE
 * "ESTUDIANTE REPROBADO." SI EL PROMEDIO ES ENTRE 5.0 Y 6.9,
 * INCLUYENDO ESTE, EL PROGRAMA DEBERÀ IMPRIMIR EL MENSAJE
 * "ESTUDIANTE EN EXAMEN."
 *
 * EN CASO DE EXAMEN, LEA UNA PUNTUACIÒN MÀS. IMPRIMIR EL MENSAJE
 * "NOTA DE EXAMEN: ", SEGUIDO DE LA PUNTUACIÒN A LEER. VUELVA
 * A CALCULAR EL PROMEDIO (SUMA LA PUNTUACIÒN DEL EXAMEN CON EL
 * PROMEDIO CALCULADO ANTERIORMENTE Y DIVIDA POR 2) E IMPRIMA EL
 * SIGUIENTE MENSAJE "ESTUDIANTE APROBADO", EN CASO DE QUE EL PROMEDIO
 * SEA 5.0 O MÀS, O "ESTUDIANTE REPROBADO." EN CASO DE QUE EL
 * PROMEDIO SEA 4.9 O MENOR. PARA ESTOS 2 CASOS (APROBADO O REPROBADO
 * DESPUÈS DEL EXAMEN) IMPRIMIR EL MENSAJE "PROMEDIO FINAL: ", SEGUIDO
 * POR EL PROMEDIO FINAL PARA ESTE ESTUDIANTE EN LA ULTIMA LINEA.
 *
 *LA SALIDA DEBE SER UN MENSAJE COMO EL SIGUIENTE EJEMPLO.
 *
 * EJEMPLO DE ENTRADA   EJEMPLO DE SALIDA
 * 2.0-4.0-7.5-8.0-6.4  PROMEDIO: 5.4
 *                      ESTUDIANTE EN EXAMEN.
 *                      NOTA DEL EXAMEN: 6.4
 *                      ESTUDIANTE APROBADO.
 *                      PROMEDIO FINAL: 5.9
 *
 * 2.0-6.5-5.4-5.0      PROMEDIO: 4.8
 *                      ESTUDIANTE REPROBADO.
 *
 *9.0-4.0-8.5-9.0       PROMEDIO: 7.6
 *                      ESTUDIANTE APROBADO.
 *
 * REALICE LA PRUEBA DE ESCRITORIO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo03 {
    public static void PromedioEstudiante() {
        double[] notas = new double[4];
        double promedio = 0, promedioFinal = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Ingrese La Nota #"+(i+1)+" (1 - 10): ");
                // Para Obtener 1 Digito Despuès Del "." Decimal (Tirando Hacia Arriba)
                notas[i] = (double) Math.round(teclado.nextDouble() * 10d) / 10;
                promedio += notas[i] / notas.length;
            }

            if(promedio >= 7) {
                System.out.println("\nEstudiante Aprobado");

            } else if(promedio < 5) {
                System.out.println("\nEstudiante Reprobado");

            } else if(promedio >= 5 && promedio <= 6.9) {
                System.out.println("\nEstudiante En Examen");

                System.out.println("Ingrese La Nota Del Examen (1 - 10): ");
                double notaMas = teclado.nextDouble();

                System.out.println("\nNota Del Examen: " + notaMas);
                promedioFinal = (promedio + notaMas) / 2;

                if (promedioFinal >= 5) {
                    System.out.println("Estudiante Aprobado");

                } else if (promedioFinal <= 4.9) {
                    System.out.println("Estudiante Reprobado");
                }

                System.out.println("Promedio: " + promedio);
                System.out.println("Promedio Final: " + promedioFinal);
                return;
            }

            System.out.println("Promedio: " + promedio);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
