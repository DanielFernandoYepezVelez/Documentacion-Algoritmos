/* PROBLEMA #2
* ELABORE UN ALGORITMO QUE LEA EL NOMBRE DE UNA PERSONA Y QUE IMPRIMA
* EL MENSAJE "HOLA" SEGUIDO DEL NOMBRE DE LA PERSONA LEIDA.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo2 {
    public static String saludo() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar Nombre Completo:");
        String nombre = teclado.nextLine();

        return "Hola " + nombre;
    }
}
