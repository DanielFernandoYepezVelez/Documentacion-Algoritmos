/** PROBLEMA #3
 * CREAR UN ALGORITMO DONDE SE DECLARE/CREE DOS CONSTANTES
 * CON UN VALOR NÚMERICO, MULTIPLICAR LOS DOS NÚMEROS Y GUARDAR
 * EL RESULTADO DE LA MULTIPLICACIÓN EN UNA VARIABLE Y
 * ESCRIBIR/IMPRIMIR LA VARIABLE CON EL RESULTADO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;

public class algoritmo03 {
    public static void Producto() {
        double CONSTANTE_UNO = 5;
        double CONSTANTE_DOS = 23;

        try {
            double producto = CONSTANTE_UNO * CONSTANTE_DOS;
            System.out.println("Producto: " + producto);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
