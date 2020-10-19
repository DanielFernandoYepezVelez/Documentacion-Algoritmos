/** PROBLEMA #18
 * EN UNA UNIVERSIDAD LOS ESTUDIANTES PUEDEN PAGAR
 * EL VALOR DE SU MATRICULA EN CUATRO CUOTAS DE
 * LA SIGUIENTE FORMA:
 *
 * PRIMERA CUOTA: 40%
 * SEGUNDA CUOTA: 25%
 * TERCERA CUOTA: 20%
 * CUARTA CUOTA: 15%
 *
 * DIGA CUANTO TIENE QUE PAGAR POR CUOTA EL ESTUDIANTE.
 * */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo18 {
    public static void PagoMatricula() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor Total De La Matricula: ");
            double matricula = teclado.nextDouble();

            double primera = matricula * 0.40;
            double segunda = matricula * 0.25;
            double tercera = matricula * 0.20;
            double cuarta = matricula * 0.15;

            System.out.println("\nTotal Matricula: " + matricula + "$" +
                    "\nValor Primer Cuota (40%): " + primera + "$" +
                    "\nValor Segunda Cuota (25%): " + segunda + "$" +
                    "\nValor Tercera Cuota (20%): " + tercera + "$" +
                    "\nValor Cuarta Cuota (15%): " + cuarta + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
