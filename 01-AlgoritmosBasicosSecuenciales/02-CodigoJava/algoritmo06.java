/* PROBLEMA #6
* ELABORE UN ALGORITMO QUE LEA UNA TEMPERATURA EN GRADOS
* FAHRENHEIT Y LA CONVIERTA Y LA IMPRIMA EN GRADOS CElSIUS.
* LOS GRADOS FAHRENHEIT SE CONVIERTEN EN GRADOS CELSIUS
* RESTANDOLES 32 Y MULTIPLICANDO POR 5/9.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo6 {
    public static String temperatura() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese La Temperatura Con Un Formato De Grados Fahrenheit: ");
        double gradosF = teclado.nextDouble();

        double gradosC = (gradosF - 32) * 5 / 9;

        return "Grados Farenheit: " + gradosF + "\nGrados Centigrados: " + gradosC;
    }
}
