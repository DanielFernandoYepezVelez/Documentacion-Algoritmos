/** PROBLEMA #21
 * REALICE UN ALGORITMO QUE PERMITA REALIZAR EL
 * CALCULO DEL SIGUIENTE ENUNCIADO, SE SOLICITA
 * EL AÑO DE NACIMIENTO DEL APRENDIZ, EL NOMBRE
 * LA DIRECCIÓN, SE REQUIERE CONOCER LA EDAD DE
 * LA PERSONA Y LA INFORMACIÓN COMPLETA INGRESADA.
 */

package com.danielfernandoyepezvelez;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo21 {
    public static void Aprendiz() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Nombre Del Aprendiz: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese La Dirección Del Aprendiz: ");
            String direccion = teclado.nextLine();

            System.out.println("Ingrese El Año De Nacimiento: ");
            int year = teclado.nextInt();

            Calendar yearActual = Calendar.getInstance();
            int edad = yearActual.get(Calendar.YEAR) - year;

            System.out.println("\nNombre: " + nombre +
                               "\nDirección: " + direccion +
                               "\nAño Nacimiento: " + year +
                               "\nEdad: " + edad + " Años");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
