/** PROBLEMA #1
 * ESCRIBA UN ALGORITMO EN PSEUDOCÓDIGO QUE LEA UN NÚMERO
 * REAL E IMPRIMIR UN MENSAJE DICIENDO EN CUÁL DE LOS
 * SIGUIENTES INTERVALOS EL NÚMERO PERTENECE: [0,25],
 * (25,50], (50,75], (75,100]. CUANDO EL NÚMERO SEA
 * MENOR QUE CERO O MAYOR QUE 100, SE DEBE IMPRIMIR
 * EL MENSAJE: "FUERA DEL INTERVALO".
 *
 * EL SIMBOLO "(" REPRESENTA MAYOR QUE, POR EJEMPLO:
 * [0,25] INDICA NÚMEROS ENTRE 0 Y 25, INCLUYENDO AMBOS.
 * (25,50] INDICA NÚMEROS MAYORES A 25 HASTA EL 50.
 *
 * LA SALIDA DEBE SER UN MENSAJE COMO EL SIGUIENTE
 * EJEMPLO:
 *
 * EJEMPLO DE ENTRADA     EJEMPLO DE SALIDA
 *     25.01              Intervalo (25,50]
 *     25.00              Intervalo [0,25]
 *     100.00             Intervalo (75,100]
 *     -25.02             Fuera Del Intervalo
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo01 {
    public static void Intervalo() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresa Un Numero Real: ");
            double numero = teclado.nextDouble();

            if(numero < 0 || numero > 100) {
                System.out.println("Fuera Del Intervalo");

            } else if(numero >= 0 && numero <= 25) {
                System.out.println("Intervalo [0,25]");

            } else if(numero > 25 && numero <= 50) {
                System.out.println("Intervalo (25, 50]");

            } else if (numero > 50 && numero <= 75) {
                System.out.println("Intervalo (50,75]");

            } else if (numero > 75 && numero <= 100) {
                System.out.println("Intervalo (75,100]");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
