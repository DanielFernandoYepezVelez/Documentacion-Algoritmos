/* PROBLEMA #5
* LEA LA DISTANCIA(EN KILOMETROS) RECORRIDA POR UN AUTO,
* EL TIEMPO(EN HORAS) EN LA QUE LA RECORRIÓ Y CALCULE
* LA VELOCIDAD A LA CUAL SE DESPLAZABA EL AUTO(V=D/T).
*/

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo5 {
    public static void Velocidad() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Distancia Recorrida Por Un Auto(Km): ");
            double distancia = teclado.nextDouble();

            System.out.println("Ingrese El Tiempo En Que Recorrió Dicha Distancia(Horas): ");
            double time = teclado.nextDouble();

            double velocidad = distancia / time;

            System.out.println("\nVelocidad Del Auto: " + velocidad + "Km/h");

        } catch (InputMismatchException e) {
            System.out.println("\nEl Valor Ingresado En El Campo No Es Válido. " + e);
        }
    }
}
