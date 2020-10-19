/** PROBLEMA #9
 * HACER UN ALGORITMO QUE CALCULE EL SUELDO DE UN
 * UN EMPLEADO DADOS COMO DATOS DE ENTRADA: EL
 * NOMBRE, HORAS TRABAJADAS Y EL VALOR DE LA HORA.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo09 {
    public static void SalarioEmpleado() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Nombre Del Empleado: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese El Total De Horas Trabajadas: ");
            int horas = teclado.nextInt();

            System.out.println("Ingrese El Valor Por Hora Trabajada: ");
            double valorHora = teclado.nextDouble();

            double sueldo = horas * valorHora;

            System.out.println("\nNombre: " + nombre +
                               "\nHoras Trabajadas: " + horas + " Horas" +
                               "\nValor Hora: " + valorHora + "$" +
                               "\nSalario Mensual: " + sueldo + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
