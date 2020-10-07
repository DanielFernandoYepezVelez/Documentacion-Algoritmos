/* PROBLEMA #3
* SE DICE QUE EN EL COMERCIO EL PRECIO DE UNA PELOTA DE BEISBOL
* ES EL 15% DEL PRECIO DE UN BALON DE FUTBOL. ESCRIBA UN ALGORITMO
* QUE LEA EL PRECIO DE UN BALON DE FUTBOL Y DETERMINE EL PRECIO DE
* LA PELOTA DE BEISBOL.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS3 {
    public static String precioPelota() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar El Precio De Un Balón De Futbol: ");
        double precioB = teclado.nextDouble();

        double precioPB = precioB * 0.15;

        return "Precio Balón Futbol: " + precioB + "$" + "\nPrecio Pelota Beisbol: " + precioPB + "$";
    }
}
