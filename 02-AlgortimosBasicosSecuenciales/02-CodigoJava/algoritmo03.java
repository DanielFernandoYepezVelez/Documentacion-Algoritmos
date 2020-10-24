/* PROBLEMA #3
* A LA MAMA DE JUAN LE PREGUNTAN SU EDAD Y CONTESTA: TENGO 3 HIJOS
* PREGUNTELE A JUAN SU EDAD. ALBERTO TIENE 2/3 DE LA EDAD DE JUAN,
* ANA TIENE 4/3 DE LA EDAD DE JUAN Y MI EDAD ES LA SUMA DE LAS
* TRES. HACER UN ALGORITMO QUE MUESTRE LA EDAD DE LOS CUATRO.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo3 {
    public static String EdadMadre() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar La Edad De Juan: ");
        int edadJuan = teclado.nextInt();

        int edadAlberto = (int)(edadJuan * 0.67);
        int edadAna = (int)(edadJuan * 1.33);
        int edadMadre = (edadJuan + edadAlberto + edadAna);

        return "\nEdad Juan: " + edadJuan + " Años" +
                "\nEdad Alberto: " + edadAlberto + " Años" +
                "\nEdad Ana: " + edadAna + " Años" +
                "\nEdad Madre: " + edadMadre + " Años";
    }
}
