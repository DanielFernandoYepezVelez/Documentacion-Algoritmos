/** PROBLEMA #12
 * ELABORAR UN ALGORITMO QUE PERMITA CALCULAR EL VALOR
 * TOTAL A PAGAR EN UNA PAPELERIA TENIENDO EN CUENTA
 * QUE SI LLEVA 5 CUADERNOS O MÀS, SE LE COBRARÀN $2_000
 * POR CADA UNO, MIENTRAS QUE SI LLEVA MENOS, SE LE COBRARÀN
 * $2_500 POR CADA UNO.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo12 {
    public static void Papeleria() {
        double total = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Cantidad De Cuadernos Comprados: ");
            int cuadernos = teclado.nextInt();

            if (cuadernos >= 5) {
                total = cuadernos * 2_000;

            } else {
                total = cuadernos * 2_500;
            }

            System.out.println("\nCantidad De Cuadernos: " + cuadernos +
                               "\nValor Compra: "  + total + "$" +
                               "\nValor Cuaderno Individual: " + (total / cuadernos) + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
