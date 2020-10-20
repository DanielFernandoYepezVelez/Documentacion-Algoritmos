/** PROBLEMA #9
 * SE REQUIERE DETERMINAR EL TIEMPO QUE TARDA UNA
 * PERSONA EN LLEGAR DE UNA CIUDAD A OTRA EN
 * BICICLETA, CONSIDERANDO QUE LLEVA UNA VELOCIDAD
 * CONSTANTE.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo09 {
    public static void Ciudad() {
        int VELOCIDAD = 45;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Distancia Entre Las Ciudades Que Va A Recorrer: ");
            double distancia = teclado.nextDouble();

            double tiempo = distancia / VELOCIDAD;

            System.out.println("\nDistancia Recorrida: " + distancia + " Km" +
                               "\nVelocidad: " + VELOCIDAD + " Km/h" +
                               "\nTiempo Del Recorrido: " + tiempo);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
