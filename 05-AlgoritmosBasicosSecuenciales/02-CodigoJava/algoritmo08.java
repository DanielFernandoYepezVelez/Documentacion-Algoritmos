/** PROBLEMA #8
 * LA COMPAÑIA DE AUTOBUSES "LA CURVA LOCA" REQUIRE DETERMINAR
 * EL COSTO QUE TENDRA EL BOLETO DE UN VIAJE SENCILLO, ESTO
 * BASADO EN LOS KILOMÉTROS POR RECORRER Y EL COSTO POR
 * KILOMETRO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo08 {
    public static void CurvaLoca() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Cantidad De Kilometros Del Recorrido: ");
            double km = teclado.nextDouble();

            System.out.println("Ingrese El Costo Por Kilometro: ");
            double costoKM = teclado.nextDouble();

            double boletoSencillo = km * costoKM;

            System.out.println("\nKilometros Totales: " + km + " Km" +
                               "\nCosto Kilometro: " + costoKM + "$" +
                               "\nValor Boleto: " + boletoSencillo + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
