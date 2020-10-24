/* PROBLEMA #3
* ELABORE UN ALGORITMO QUE LEA DOS DATOS ENTEROS CORRESPONDIENTES
* A LOS CATETOS DE UN TRIANGULO Y QUE CALCULE E IMPRIMA EL VALOR DE
* LA HIPOTENUSA DE DICHO TRIANGULO.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo3 {
    public static String triangulo() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese Un Valor Para El Cateto #1: ");
        double cateto1 = teclado.nextDouble();

        System.out.println("Ingrese Un Valor Para El Cateto #2: ");
        double cateto2 = teclado.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        return "La Hipotenusa Es: " + hipotenusa;
    }
}
