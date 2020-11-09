/** PROBLEMA #8
 * UN HOMBRE DESEA SABER CUANTO DINERO SE GENERA POR
 * CONCEPTO DE INTERESES SOBRE LA CANTIDAD QUE TIENE
 * DE INVERSIÓN EN EL BANCO. EL DECIDIRÁ REINVERTIR
 * LOS INTERESES SIEMPRE Y CUANDO NO EXCEDAN A
 * $7000 Y EN ESE CASO DESEA SABER CUANTO DINERO
 * TENDRÁ FINALMENTE EN SU CUENTA.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo08 {
    public static void InversionBancaria() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Cantidad De Dinero Invertido: ");
            double inversion = teclado.nextDouble();

            System.out.println("Tasa De Interès Proporcionada Por El Banco: ");
            double tasa = teclado.nextDouble() / 100;

            double interesInversion = inversion * tasa;

            System.out.println(interesInversion);

            if (interesInversion <= 7_000) {
                double dineroFinal = inversion + interesInversion;

                System.out.println("\nInversiòn: " + inversion + "$" +
                                   "\nTasa Interès Pagada: " + (tasa * 100) + "%" +
                                   "\nInterès Inversiòn: " + interesInversion + "$" +
                                   "\nDinero Obtenido: " + dineroFinal);
                return;
            }

            System.out.println("\nInversiòn: " + inversion + "$" +
                               "\nTasa Interès Pagada: " + (tasa * 100) + "%" +
                               "\nInterès Inversiòn: " + interesInversion + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
