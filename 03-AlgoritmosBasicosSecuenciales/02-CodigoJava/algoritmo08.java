/** PROBLEMA #8
 * SUPONGA QUE UN INDIVIDUO DESEA INVERTIR SU CAPITAL
 * EN UN BANCO Y DESEA SABER CUANTO DINERO, GANARÁ
 * DESPUÉS DE UN MES SI EL BANCO PAGA A RAZÓN DE 2%
 * MENSUAL.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo8 {
    public static void Inversion() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Cantidad De Dinero Disponible Para La Inversión: ");
            double capital = teclado.nextDouble();

            double interes = capital * 0.02;
            double retorno = capital + interes;

            System.out.println("\n...Después De Un Mes Tenemos La Siguiente Información: " +
                    "\nCapital Invertido: " + capital + "$" +
                    "\nInteres Obtenido: " + interes + "$" +
                    "\nRetorno De La Inversión: " + retorno + "$");

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
