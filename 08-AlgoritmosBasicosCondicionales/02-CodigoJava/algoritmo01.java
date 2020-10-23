/** PROBLEMA #1
 * ESCRIBA UN ALGORITMO QUE LEA UN NUMERO Y DIGA SI ES PAR.
 */

 package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo01 {
    public static void NumeroPar(){
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Nùmero: ");
            double numero = teclado.nextDouble();

            if((numero % 2) == 0) {
                System.out.println("Nùmero " + numero + " Es Par");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
