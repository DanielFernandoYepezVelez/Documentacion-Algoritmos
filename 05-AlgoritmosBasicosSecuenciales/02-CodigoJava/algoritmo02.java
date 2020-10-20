/** PROBLEMA #2
 * SE REQUIERE OBTENER EL AREA DE UNA CIRCUNFERENCIA. REALIZAR
 * EL ALGORITMO CORRESPONDIENTE. EL AREA DE LA CIRCUNFERENCIA
 * SE HALLA ASI: (PI * R2) TAMBIÉN (PI * R * R).
 * RECUERDE QUE PI = 3.1416.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo02 {
    public static void AreaCircunferencia() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresar El Radio De Una Circunferencia: ");
            double circunferencia = teclado.nextDouble();

            double area = Math.PI * Math.pow(circunferencia, 2);

            System.out.println("\nRadio: " + circunferencia + " Metros" +
                               "\nPI: " + Math.PI + " Metros" +
                               "\nArea: " + area + " Metros Cuadrados");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
