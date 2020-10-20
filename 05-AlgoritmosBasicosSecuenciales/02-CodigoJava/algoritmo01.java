/** PROBLEMA #1
 * SE REQUIERE CONOCER EL AREA DE UN RECTANGULO. REALICE UN
 * ALGORITMO PARA TAL FIN. EL AREA DEL RECTANGULO SE HALLA
 * ASI: (BASE * ALTURA).
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo01 {
    public static void AreaRectangulo() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Base De Un Rectangulo: ");
            double base = teclado.nextDouble();

            System.out.println("Ingrese La Altura De Un Rectangulo: ");
            double altura = teclado.nextDouble();

            double area = base * altura;

            System.out.println("\nBase: " + base + " Metros" +
                               "\nAltura: " + altura + " Metros" +
                               "\nArea: " + area + " Metros Cuadrados");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
