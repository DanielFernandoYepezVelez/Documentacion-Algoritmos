/** PROBLEMA #2
 * CREAR UN ALGORITMO DONDE SE DECLARE/CREE DOS CONSTANTES
 * CON UN VALOR NÚMERICO, SUMAR LOS DOS NÚMEROS Y GUARDAR
 * EL RESULTADO DE LA SUMA EN UNA VARIABLE Y ESCRIBIR/IMPRIMIR
 * LA VARIABLE CON EL RESULTADO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;

public class algoritmo02 {
    public static void Suma() {
        double CONSTANTE_UNO = 555.67899;
        double CONSTANTE_DOS = 23.45;

        try {
            double suma = CONSTANTE_UNO + CONSTANTE_DOS;
            System.out.println("Suma: " + suma);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
