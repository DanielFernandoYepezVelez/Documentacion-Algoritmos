/** PROBLEMA #16
 * SUPONGA QUE UN CONDUCTOR DE SOBUSA LE PIDE A USTED QUE LE HAGA UN
 * ALGORITMO PARA CALCULAR CUÁNTO LE CORRESPONDE EN UN DIA DE TRABAJO
 * TENIENDO EN CUENTA QUE TIENE DERECHO AL 19% DEL TOTAL RECAUDADO.
 * */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo16 {
    public static void Sobusa() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor Total Del Dia De Trabajo: ");
            double diaTrabajo = teclado.nextDouble();

            double totalConductor = diaTrabajo * 0.19;

            System.out.println("\nTotal Dia De Trabajo: " + diaTrabajo + "$" +
                                "\nTotal Conductor: " + totalConductor + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido " + e);
        }
    }
}
