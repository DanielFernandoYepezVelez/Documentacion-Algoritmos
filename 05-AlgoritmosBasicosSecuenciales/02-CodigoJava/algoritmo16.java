/** PROBLEMA #16
 * REALICE EL ALGORITMO PARA DETERMINAR APROXIMADAMENTE
 * CUANTOS MESES, SEMANAS, DIAS Y HORAS HA VIVIDO UNA
 * PERSONA.
 */

package com.danielfernandoyepezvelez;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo16 {
    public static void Vida() {
        Calendar year = Calendar.getInstance();
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Año De Nacimiento: ");
            int nacimiento = teclado.nextInt();

            int edad = year.get(Calendar.YEAR) - nacimiento;
            int meses = edad * 12;
            int semanas = meses * 4;
            int dias = semanas * 7;
            int horas = dias * 24;
            int minutos = horas * 60;
            int segundos = minutos * 60;

            System.out.println("\nEdad: " + edad + " Años" +
                               "\nMeses De Vida: " + meses + " Meses" +
                               "\nSemanas De Vida: " + semanas +  " Semanas" +
                               "\nDias De Vida: " + dias + " Dias" +
                               "\nHoras De Vida: " + horas + " Horas" +
                               "\nMinutos De Vida: " + minutos + " Minutos" +
                               "\nSegundos De Vida: " + segundos + " Segundos");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
