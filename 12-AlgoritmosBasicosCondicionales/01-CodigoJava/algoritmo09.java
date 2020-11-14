/** PROBLEMA #9
 * UN OBRERO NECESITA CALCULAR SU SALARIO SEMANAL, EL CUAL
 * SE OBTIENE DE LA SIGUIENTE MANERA:
 * SI TRABAJA 40 HORAS O MENOS, SE LE PAGA $10_000 LA HORA.
 * SI TRABAJA MÀS DE 40 HORAS, SE LE PAGA $10_000 POR CADA
 * UNA DE LAS PRIMERAS 40 HORAS Y $15_000 POR CADA UNA DE
 * LAS HORAS EXTRAS.
 */

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo09 {
    public static void SalarioObrero() {
        int horasExtras = 0;
        double sueldo = 0, pagoUno = 0, pagoDos = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Nùmero De Horas Trabajadas Semanalmente: ");
            int horas = teclado.nextInt();

            if (horas <= 40) {
                sueldo = horas * 10_000;

            } else if (horas > 40) {
                pagoUno = 40 * 10_000;
                horasExtras = horas - 40;
                pagoDos = horasExtras * 15_000;
                sueldo = pagoUno + pagoDos;
            }

            System.out.println("\nHoras Trabajadas: " + horas +
                               "\nValor Hora: $" + 10_000 +
                               "\nValor Hora Extra: $" + 15_000 +
                               "\nHoras Extras: " + horasExtras +
                               "\nSueldo Semanal: " + sueldo + "$" +
                               "\nSueldo Mensual: " + (sueldo * 4) + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
