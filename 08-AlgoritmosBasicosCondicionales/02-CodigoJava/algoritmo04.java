/** PROBLEMA #4
 * ESCRIBA UN ALGORITMO QUE VERIFIQUE SI LA FORMA DE PAGO
 * DE UN ARTICULO FUE DE CONTADO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo04 {
    public static void Pago() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("CODIGO - - FORMA DE PAGO");
            System.out.println("  1    - -    Efectivo");
            System.out.println("  2    - -    Credito");

            System.out.println("Ingrese El Còdigo De La Forma De Pago: ");
            int codigo = teclado.nextInt();

            if(codigo == 1){
                System.out.println("El Pago Fue De \"CONTADO\"");

            } else if(codigo != 2){
                System.out.println("El Còdigo Ingresado No Hace Parte Del Menù De Opciones.");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
