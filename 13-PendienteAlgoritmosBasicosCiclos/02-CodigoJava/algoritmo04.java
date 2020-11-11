/** PROBLEMA #4
 * INGRESAR NÙMEROS MIENTRAS EL USUARIO DIGA SI DESEA SEGUIR (MIENTRAS - WHILE).
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo04 {
    public static void Continuar() {
        String resp = "si";
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Respuestas Vàlidas => (SI | si | Si)");

            while(resp.contains("SI") || resp.contains("si") || resp.contains("Si")) {
                System.out.println("Ingresar Un Valor Nùmerico: ");
                double numero = teclado.nextDouble();

                System.out.println("Desea Seguir Ingresando Nùmeros: ");
                resp = teclado.next();
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
