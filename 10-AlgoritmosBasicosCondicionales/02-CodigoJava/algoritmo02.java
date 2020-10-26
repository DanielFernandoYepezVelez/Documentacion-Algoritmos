/** PROBLEMA #2
 * ELABORE UN PROGRAMA QUE LE PERMITA A UN
 * USUARIO CALCULAR LAS RAICES REALES DE UN
 * POLINOMIO DE SEGUNDO GRADO DE LA FORMA
 * AX2 + BX + C = 0.
 *
 * SE DEBE TENER EN CUENTA QUE DEPENDIENDO DEL
 * VALOR DEL DETERMINANTE (D = B2 - 4AC) EL
 * SISTEMA PUEDE DAR RAICES REALES (D >= 0) O
 * RAICES COMPLEJAS (D < 0).
 *
 * EL PROGRAMA DEBE INFORMAR AL USUARIO SI EL
 * SISTEMA NO TIENE RAICES REALES. ADEMÀS,
 * SE DEBE INDICAR SI LAS RAICES REALES SON
 * IGUALES (D = 0) O DIFERENTES (D > 0).
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo02 {
    public static void Polinomio() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Se Va A Calcular Un Polinomio De Segundo Grado: AX2 + BX + C = 0");
            System.out.println("Ingrese Un Valor Para A: ");
            double a = teclado.nextDouble();

            System.out.println("Ingrese Un Valor Para B: ");
            double b = teclado.nextDouble();

            System.out.println("Ingrese Un Valor Para C: ");
            double c = teclado.nextDouble();

            double valorRaizInterna = Math.pow(b, 2) - (4 * a * c);
            double positivoX = ((-b) + Math.sqrt(valorRaizInterna)) / (2*a);
            double negativoX = ((-b) - Math.sqrt(valorRaizInterna)) / (2*a);

            if(positivoX == 0 || negativoX == 0) {
                System.out.println("\nLa Soluciòn Tiene Raices Reales Equivalentes A 0");
            }

            if(positivoX > 0 || negativoX > 0) {
                System.out.println("La Soluciòn Tiene Raices Reales Mayores A 0");
            }

            if(positivoX >= 0 || negativoX >= 0) {
                System.out.println("Soluciones Reales Para X1: " + positivoX +
                                   "\nSoluciones Reales Para X2: " + negativoX);
                return;
            }

            System.out.println("El Polinomio De Segundo Grado No Tiene Soluciòn O Raices Reales.");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
