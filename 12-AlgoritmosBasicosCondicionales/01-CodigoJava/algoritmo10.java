/** PROBLEMA #10
 * UNA PERSONA ENFERMA Y CUYO PESO ES DE 70KG, SE ENCUENTRA
 * EN REPOSO Y DESEA SABER CUANTAS CALORIAS CONSUME SU CUERPO
 * DURANTE EL TIEMPO QUE REALICE LA MISMA ACTIVIDAD. LAS
 * ACTIVIDADES QUE PUEDE REALIZAR SON ÚNICAMENTE DORMIR
 * O ESTAR SENTADO. LOS DATOS QUE TIENE ES QUE ESTANDO
 * DORMIDO CONSUME 1.08 CALORIAS POR MINUTO Y ESTANDO SENTANDO
 * EN REPOSO CONSUME 1.66 CALORIAS POR MINUTO.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo10 {
    public static void Calorias() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Cantidad De Horas Que Duerme: ");
            int dormir = teclado.nextInt();

            System.out.println("Ingrese La Cantidad De Horas Que Permanece Sentado: ");
            int sentado = teclado.nextInt();

            double caloriasDurmiendo = (dormir * 60) * 1.08;
            double caloriasSentado = (sentado  * 60) * 1.66;

            System.out.println("\nHoras Dormidas: " + dormir +
                               "\nHoras Sentado: " + sentado +
                               "\nCalorias Consumidas Durmiendo: " + caloriasDurmiendo +
                               "\nCalorias Consumidas Sentado: " + caloriasSentado);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
