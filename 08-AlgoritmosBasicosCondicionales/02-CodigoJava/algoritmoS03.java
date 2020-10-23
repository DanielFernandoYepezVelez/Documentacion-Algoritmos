/** PROBLEMA #3
 * ESCRIBA UN ALGORITMO QUE VERIFIQUE SI UNA PERSONA
 * PUEDE INGRESAR A UN EQUIPO DE BALONCESTO, SABIENDO
 * QUE LA CONDICIÒN ES QUE MIDA MÀS DE 1.75 METROS.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS03 {
    public static void Equipo() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Su Nombre: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese Su Edad: ");
            int edad = teclado.nextInt();

            System.out.println("Ingrese Su Estatura Promedio: ");
            double estatura = teclado.nextDouble();

            if(estatura > 1.75) {
                System.out.println("\nNombre: " + nombre +
                                   "\nEdad: " + edad + " Años" +
                                   "\nEstatura: " + estatura + " Metros" +
                                   "\n***** Bienvenid@ Al Equipo De Baloncesto *****");

            } else {
                System.out.println("\nNombre: " + nombre +
                                   "\nEdad: " + edad + " Años" +
                                   "\nEstatura: " + estatura + " Metros" +
                                   "\n***** No Eres Apt@ Para Ingresar Al Equipo De Baloncesto *****");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
