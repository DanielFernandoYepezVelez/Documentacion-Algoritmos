/** PROBLEMA #2
 * ELABORE UN ALGORITMO QUE LEA UN NÙMERO Y SI ESTE
 * ES MAYOR O IGUAL A 10 DEVUELVA EL TRIPLE DE ESTE.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo02 {
    public static void Triple(){
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Un Nùmero: ");
            double numero = teclado.nextDouble();

            if(numero >= 10) {
                System.out.println("Resultado Final (x3): " + (numero*3));
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
