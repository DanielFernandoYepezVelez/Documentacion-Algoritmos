/* PROBLEMA #13
* ELABORE UN PROGRAMA QUE REALICE LA CONVERSION DE LIBRAS A
* KILOGRAMOS, DONDE 1KG = 2.205 LIBRAS.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS13 {
    public static String Conversion() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese Una Cantidad En Libras: ");
        double libras = teclado.nextDouble();

        double kilos = libras / 2.205;

        return "\nLibras: " + libras +
                "\nConversión Kilos: " + kilos;
    }
}
