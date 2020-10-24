/** PROBLEMA #2
 * PARA LAS VOTACIONES EN UN MUNICIPIO DE ANTIOQUIA,
 * SE TIENEN ASIGNADAS 5 MESAS ELECTORALES. LAS PERSONAS
 * QUE PODRÀN VOTAR DEBE SER MAYORES DE EDAD Y DE NACIONALIDAD
 * COLOMBIANA; DE ACUERDO AL ÙLTIMO DIGITO DE SU CÈDULA DE
 * CIUDADANIA, LES SERÀ ASIGNADA LA MESA ELECTORAL ASI:
 *
 * ULTIMOS DIGITOS         Nro. Mesa
 *  0 y 1                     1
 *  2 y 3                     2
 *  4 y 5                     3
 *  6 y 7                     4
 *  8 y 9                     5
 *
 *  REALIZAR UN ALGORITMO QUE LE INDIQUE A UNA PERSONA
 *  SI ES APTA O NO PARA VOTAR, DEBE INDICARLE EN QUE
 *  MESA PODRÀ HACERLO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo02 {
    public static void Votaciones() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Su Nacionalidad: ");
            String nacionalidad = teclado.nextLine();

            if(nacionalidad.contains("Colombiana") || nacionalidad.contains("COLOMBIANA") || nacionalidad.contains("colombiana")) {

                System.out.println("Ingrese Su Edad: ");
                int edad = teclado.nextInt();

                if(edad >= 18) {

                    System.out.println("Ingrese Su Documento De Identidad: ");
                    int cedula = teclado.nextInt();

                    int ultimoDigito = cedula % 10;

                    if(ultimoDigito == 0 || ultimoDigito == 1) {
                        System.out.println("\n**** Eres Apt@ Para Votar ****");
                        System.out.println("***** mesa 1 *****");

                    } else if(ultimoDigito == 2 || ultimoDigito == 3) {
                        System.out.println("\n**** Eres Apt@ Para Votar ****");
                        System.out.println("***** mesa 2 *****");

                    } else if(ultimoDigito == 4 || ultimoDigito == 5) {
                        System.out.println("\n**** Eres Apt@ Para Votar ****");
                        System.out.println("***** mesa 3 *****");

                    } else if(ultimoDigito == 6 || ultimoDigito == 7) {
                        System.out.println("\n**** Eres Apt@ Para Votar ****");
                        System.out.println("***** mesa 4 *****");

                    } else if (ultimoDigito == 8 || ultimoDigito == 9) {
                        System.out.println("\n**** Eres Apt@ Para Votar ****");
                        System.out.println("***** mesa 5 *****");
                    }

                } else {
                    System.out.println("El Derecho Al Voto Solo Puede Ser Ejercido Por Mayores De Edad.");
                }

            } else {
                System.out.println("La Nacionalidad Ingresada No Puede Votar.");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}