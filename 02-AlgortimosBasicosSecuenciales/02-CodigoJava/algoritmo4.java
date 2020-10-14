/* PROBLEMA #4
* ELABORE UN ALGORITMO QUE LEA UN NÚMERO Y OBTENGA SU
* CUADRADO Y CUBO.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo4 {
    public static String Numero() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese Un Número: ");
        double numero = teclado.nextDouble();

        return "\nNumero Inicial: " + numero +
                "\nCuadrado: " + Math.pow(numero, 2) +
                "\nCubo: " + Math.pow(numero, 3);
    }
}
