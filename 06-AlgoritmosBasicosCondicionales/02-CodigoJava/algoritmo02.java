/** PROBLEMA #2
 * CIERTA UNIVERSIDAD PARA LIQUIDAR EL PAGO DE MATRICULA DE
 * UN ESTUDIANTE LE EXIGE LOS SIGUIENTES DATOS:
 *
 * NUMERO DE INSCRIPCIÓN.
 * NOMBRES.
 * PATRIMONIO.
 * ESTRATO SOCIAL.
 *
 * LA UNIVERSIDAD COBRA UN VALOR CONSTANTE PARA CADA ESTUDIANTE DE $50.000
 * SI EL PATRIMONIO ES MAYOR QUE 2.000.000 Y EL ESTRATO SUPERIOR A 3,
 * SE LE INCREMENTA UN PORCENTAJE DEL 3% SOBRE EL PATRIMONIO.
 *
 * HACER UN ALGORITMO QUE MUESTRE:
 * NUMERO DE INSCRIPCIÓN.
 * NOMBRES.
 * PAGO DE MATRICULA.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo02 {
    public static void Patrimonio() {
        int PATRIMONIO = 2_000_000;
        int MATRICULA = 50_000;
        double incremento = 0;
        double matricula = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Número De Inscripción De Matricula: ");
            String inscripcion = teclado.nextLine();

            System.out.println("Ingrese El Nombre Completo: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese El Valor Del Patrimonio Familiar: ");
            double patrimonio = teclado.nextDouble();

            System.out.println("Ingrese El Estrato Social: ");
            int estrato = teclado.nextInt();

            if ((patrimonio > PATRIMONIO) && (estrato > 3)) {
                incremento = patrimonio * 0.03;
                matricula = MATRICULA + incremento;
            } else {
                matricula = MATRICULA;
            }

            System.out.println("\nInscripción Matricula: " + inscripcion +
                               "\nNombre Estudiante: " + nombre +
                               "\nPatrimonio Familiar: " + patrimonio + "$" +
                               "\nEstrato Social: " + estrato +
                               "\nIncremento: " + incremento + "$" +
                               "\nPago Matricula: " + matricula + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
