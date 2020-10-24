/* PROBLEMA #2
* ELABORE UN ALGORITMO QUE LUEGO DE LEER LA EDAD DE UNA PERSONA,
* MUESTRE LA CANTIDAD DE DIAS, SEMANAS, MESES, HORAS, MINUTOS, SEGUNDOS
* QUE HA VIVIDO.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS2 {
    public static String vida() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar La Edad: ");
        int edad = teclado.nextInt();

        int dias = edad * 365;
        int semanas = edad * 48;
        int meses = edad * 12;
        int horas = dias * 24;
        int minutos = horas * 60;
        int segundos = minutos * 60;

        return "\nDias Vividos: " + dias + "\nSemanas Vividas: " + semanas + "\nMeses Vividos: " + meses + "\nHoras Vividas: " + horas
                + "\nMinutos Vividos: " + minutos + "\nSegundos Vividos: " + segundos;
    }
}
