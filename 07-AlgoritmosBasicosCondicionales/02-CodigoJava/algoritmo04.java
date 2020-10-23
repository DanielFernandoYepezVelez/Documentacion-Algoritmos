/** PROBLEMA #4
 * ESCRIBA UN ALGORITMO QUE LEA EL NOMBRE DE UN TRABAJADOR,
 * LAS VENTAS Y EL CODIGO DE LA ZONA DE TRABAJO Y QUE MUESTRE:
 * EL VALOR A PAGAR POR COMISIÒN Y EL TOTAL A PAGAR. Para ello,
 * TENGA EN CUENTA LA SIGUIENTE TABLA.
 *
 * TABLA PARA EL CALCULO DE LA COMISIÒN
 * ZONA     %COMISIÒN
 *  1           7
 *  2           9
 *  3          12
 *  4          14
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo04 {
    public static void InformacionTrabajador() {
        double comision = 0, pagoTotal = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Nombre Del Trabajador: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese El Código De La Zona De Trabajo: ");
            String codigo = teclado.nextLine();

            System.out.println("Ingrese El Valor De Las Ventas: ");
            double ventas = teclado.nextDouble();

            if (codigo.equals("1")) {
                comision = ventas * 7;
                pagoTotal = ventas + comision;

            } else if(codigo.equals("2")) {
                comision = ventas * 9;
                pagoTotal = ventas + comision;

            } else if(codigo.equals("3")) {
                comision = ventas * 12;
                pagoTotal = ventas + comision;

            } else if(codigo.equals("4")) {
                comision = ventas * 14;
                pagoTotal = ventas + comision;

            } else {
                ventas = 0;
                codigo = "No Esta Definido";
            }

            System.out.println("\nNombre: " + nombre +
                               "\nVentas Realizadas: " + ventas +
                               "\nCòdigo Zona: " + codigo +
                               "\nComisiòn: " + comision + "$" +
                               "\nPago Total: " + pagoTotal + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
