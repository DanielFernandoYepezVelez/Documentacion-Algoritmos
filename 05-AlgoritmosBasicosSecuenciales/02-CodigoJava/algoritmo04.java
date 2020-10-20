/** PROBLEMA #4
 * UNA MODISTA, PARA REALIZAR SUS PRENDAS DE VESTIR,
 * ENCARGA LAS TELAS AL EXTRANJERO. POR CADA PEDIDO,
 * TIENE QUE PROPORCIONAR LAS MEDIDAS DE LA TELA EN
 * PULGADAS, PERO ELLA GENERALMENTE LAS TIENE EN METROS.
 * REALICE UN ALGORITMO PARA AYUDAR A RESOLVER EL
 * PROBLEMA, DETERMINANDO CUANTAS PULGADAS DEBE PEDIR
 * CON BASE EN LOS METROS QUE REQUIRE.
 * (1 PULGADA = 0.0254M).
 * */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo04 {
    public static void ConversionTela() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Los Metros De Tela Requeridos: ");
            double metros = teclado.nextDouble();

            double pulgadas = metros / 0.0254;

            System.out.println("\nMetros: " + metros +
                               "\nPulgadas: " + pulgadas);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
