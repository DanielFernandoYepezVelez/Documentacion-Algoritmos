/** PROBLEMA #24
 * UN ESTUDIANTE REALIZA UN PRESTAMO A UN PLAZO DE 5 AÑOS,
 * DONDE LA TASA FIJA DE INTERÉS ES DEL 5% ANUAL, SE DEBE
 * SOLICITAR EL MONTO DEL PRESTAMO Y SE DEBE CALCULAR LA
 * SIGUIENTE INFORMACIÓN.
 *
 * CUANTO DINERO SE HA PAGADO DE INTERESES EN UN AÑO.
 * CUANTO DINERO SE HA PAGADO DE INTERESES EN EL TERCER TRIMESTRE DEL AÑO.
 * CUANTO DINERO SE HA PAGADO DE INTERESES EN EL PRIMER MES.
 * CUANTO DINERO SE HA PAGADO EN TOTAL DEL PRÉSTAMO SOLICITADO INCLUYENDO INTERESES.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo24 {
    public static void PrestamoEstudiantil() {
        double INTERES_ANUAL = 0.05;
        double INTERES_MENSUAL = 0.004166667;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese EL Monto Solicitado En El Prestamo: ");
            double prestamo = teclado.nextDouble();

            double interesAnual = (prestamo * INTERES_ANUAL) * 1;
            double interesTrimestre = (prestamo * INTERES_MENSUAL) * 3;
            double interesPrimerMes = (prestamo * INTERES_MENSUAL) * 1;
            double pagoTotal = prestamo + (interesAnual * 5);

            System.out.println("\nPrestamo Inicial: " + prestamo + "$" +
                               "\nIntereses Primer Mes: " + interesPrimerMes + "$" +
                               "\nIntereses Trimestrales: " + interesTrimestre + "$" +
                               "\nPago Total: " + pagoTotal + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
