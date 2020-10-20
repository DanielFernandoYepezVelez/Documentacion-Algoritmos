/** PROBLEMA #14
 * UNA EMPRESA DESEA DETERMINAR EL MONTO DE UN CHEQUE QUE
 * DEBE PROPORCIONAR A UNO DE SUS EMPLEADOS QUE TENDRA
 * QUE IR POR X DIAS A LA CIUDAD DE BOGOTA, LOS GASTOS
 * QUE CUBRE LA EMPRESA SON:
 *
 * HOTEL.
 * COMIDA.
 * 200.000 DIARIOS PARA OTROS GASTOS.
 *
 * EL MONTO DEBE ESTAR DESGLOSADO PARA CADA CONCEPTO,
 * ES DECIR, MOSTRAR DETALLE A DETALLE Y EL TOTAL.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo14 {
    public static void ViajeEmpresa() {
        int OTROS_GASTOS = 200000;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Los Dias Que Vas A Pasar En La Capital: ");
            int dias = teclado.nextInt();

            System.out.println("Ingrese El Precio Del Hotel Por Noche: ");
            double hotel = teclado.nextDouble();

            System.out.println("Ingrese El Gasto De Alimentacio Diario: ");
            double alimentacion = teclado.nextDouble();

            double cheque =  (hotel + alimentacion + OTROS_GASTOS) * dias;

            System.out.println("\nEstadia Bogota: " + dias + " Dias" +
                               "\nHotel Por Noche: " + hotel + "$" +
                               "\nAlimentación Diaria: " + alimentacion + "$" +
                               "\nOtros Gastos Diarios: " + (OTROS_GASTOS * dias) + "$" +
                               "\nValor Cheque: " + cheque + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
