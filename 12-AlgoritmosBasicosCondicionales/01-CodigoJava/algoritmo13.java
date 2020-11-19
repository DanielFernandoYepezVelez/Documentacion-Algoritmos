/** PROBLEMA #13
 * UNA CONSTRUCTURA OFRECE VIVIENDA DE INTERÈS SOCIAL,
 * BAJO LAS SIGUIENTES CONDICIONES:
 * SI LOS INGRESOS DEL COMPRADOR SON IGUALES O SUPERIORES
 * A $1_200_000, LA CUOTA INICIAL SERÀ DEL 15% DEL
 * VALOR DE LA VIVIENDA Y EL RESTO, SE DISTRIBUIRA EN 120
 * CUOTAS MENSUALES CON UN INTERÈS DEL 2% MENSUAL.
 * SI LOS INGRESOS DEL COMPRADOR SON INFERIORES A
 * $1_200_000, LA CUOTA INICIAL SERÀ DEL 30% DEL VALOR
 * DE LA VIVIENDA Y EL RESTO, LO DISTRIBUIRÀ EN 84 CUOTAS
 * MENSUALES CON UN INTERÈS DEL 1% MENSUAL. LA CONSTRUCTURA
 * DESEA SABER CUÀNTO DEBE PAGAR UN COMPRADOR POR CONCEPTO
 * DE CUOTA INICIAL Y CUÁNTO POR CADA CUOTA MENSUAL.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo13 {
    public static void Vivienda() {
        double inicial = 0, resto = 0, mensualidades = 0,
                interesMensual = 0, interesTotal = 0, pagoTotal = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor De La Vivienda: ");
            double vivienda = teclado.nextDouble();

            System.out.println("Ingrese El Salario Mensual Del Comprador: ");
            double salario = teclado.nextDouble();

            if (salario >= 1_200_000) {
                inicial = vivienda * 0.15;
                resto = vivienda - inicial;
                mensualidades = resto / 120;
                interesMensual = mensualidades * 0.02;
                interesTotal = interesMensual * 120;
                pagoTotal =  vivienda + interesTotal;

            } else {
                inicial = vivienda * 0.30;
                resto = vivienda - inicial;
                mensualidades = resto / 84;
                interesMensual = mensualidades * 0.01;
                interesTotal = interesMensual * 84;
                pagoTotal =  vivienda + interesTotal;
            }

            System.out.println("\nValor Vivienda: " + vivienda + "$" +
                               "\nSalario Empleado: " + salario + "$" +
                               "\nCuota Inicial: " + inicial + "$" +
                               "\nMensualidades: " + mensualidades + "$" +
                               "\nInteres Mensual: " + interesMensual + "$" +
                               "\nInteres Total: " + interesTotal + "$" +
                               "\nPago Total: " + pagoTotal + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}