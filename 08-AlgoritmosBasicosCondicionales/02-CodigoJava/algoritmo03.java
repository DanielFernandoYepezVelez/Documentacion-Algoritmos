/** PROBLEMA #3
 * ESCRIBA UN ALGORITMO QUE VERIFIQUE SI LA SUMA
 * DE DOS NÙMEROS ENTEROS ES MAYOR A 1000.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo03 {
    public static void Numero(){
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Nùmero Entero: ");
            int numeroUno = teclado.nextInt();

            System.out.println("Ingrese Otro Nùmero Entero: ");
            int numeroDos = teclado.nextInt();

            int suma = numeroUno + numeroDos;

            if(suma > 1000) {
                System.out.println("La Suma De Los Nùmero Ingresados Es Mayor A \"1000\". => " + suma);
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
