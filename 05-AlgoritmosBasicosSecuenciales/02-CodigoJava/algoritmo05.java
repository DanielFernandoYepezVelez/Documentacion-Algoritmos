/** PROBLEMA #5
 * UN ESTACIONAMIENTO REQUIERE DETERMINAR EL COBRO
 * QUE DEBE APLICAR A LAS PERSONAS QUE LO UTILIZAN.
 * CONSIDERE QUE EL COBRO ES CON BASE EN LAS HORAS
 * QUE LO DISPONEN Y QUE LAS FRACCIONES DE HORA SE
 * TOMAN COMO COMPLETAS. REALIZAR EL ALGORITMO QUE
 * PERMITA DETERMINAR EL COBRO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo05 {
    public static void Estacionamiento() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Número De Horas De Estacionamiento: ");
            int horas = teclado.nextInt();

            double precio = horas * 2500;

            System.out.println("\nHoras Estacionadas: " + horas +
                               "\nValor Hora: " + 2500 + "$" +
                               "\nPago Total: " + precio + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
