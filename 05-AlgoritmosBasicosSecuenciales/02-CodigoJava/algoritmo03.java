/** PROBLEMA #3
 * DE UN TRIANGULO SE TIENE LA LONGITUD DE LA BASE
 * Y LA LONGITUD DE LA ALTURA. DETERMINE EL VALOR DE
 * SU AREA. EL AREA DEL TRIANGULO SE HALLA ASI:
 * (BASE * ALTURA) / 2
 * */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo03 {
    public static void AreaTriangulo() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Longitud De La Base: ");
            double base = teclado.nextDouble();

            System.out.println("Ingrese La Longitud De La Altura: ");
            double altura = teclado.nextDouble();

            double area = (base * altura) / 2;

            System.out.println("\nLongitud Base: " + base + " Metros" +
                               "\nLongitud Altura: " + altura + " Metros" +
                               "\nArea Triangulo: " + area + " Metros Cuadrados");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
