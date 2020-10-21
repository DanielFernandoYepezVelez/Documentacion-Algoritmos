/** PROBLEMA #17
 * EL HOTEL "CAMA ARENA" REQUIERE DETERMINAR
 * LO QUE LE DEBE COBRAR A UN HUESPED POR SU
 * ESTANCIA EN UNA DE SUS HABITACIONES. REALICE
 * EL ALGORITMO PARA DETERMINAR ESE COBRO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo17 {
    public static void Huesped() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Numero De Dias Reservados: ");
            int dias = teclado.nextInt();

            System.out.println("Ingrese El Precio Por Dia: ");
            double precio = teclado.nextDouble();

            double pago = dias * precio;

            System.out.println("\nDias Reservados: " + dias +
                               "\nPrecio Diario: " + precio + "$" +
                               "\nPago Total: " + pago + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido." + e);
        }
    }
}
