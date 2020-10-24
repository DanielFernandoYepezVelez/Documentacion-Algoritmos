/* PROBLEMA #4
* UNA PERSONA RECIBE UNA CANTIDAD CUALQUIERA DE DOLARES.
* REALICE UN ALGORITMO QUE DETERMINE EL VALOR EQUIVALENTE
* EN PESOS, SABIENDO QUE EL DOLAR TIENE UN VALOR DE 3,886.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS4 {
    public static String ConversionPesos() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese La Cantidad Recibida En Dolares: ");
        double dolares = teclado.nextDouble();

        double pesosCO = dolares * 3.886;

        return "Dolares: " + dolares + "$" + "\nPesos Colombianos: " + pesosCO + "$";
    }
}
