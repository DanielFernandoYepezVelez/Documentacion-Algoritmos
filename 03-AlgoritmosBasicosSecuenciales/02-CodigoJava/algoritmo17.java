/** PROBLEMA #17
 * DESARROLLA UN ALGORITMO QUE PERMITA GENERAR LA COLILLA
 * DE PAGO DE LOS EMPLEADOS DE UNA EMPRESA. LA COLILLA
 * DEBE MOSTRAR LA SIGUIENTE INFORMACIÓN:
 *
 * EL SALARIO DEL EMPLEADO.
 * EL VALOR DE AHORRO MENSUAL PROGRAMADO.
 * LA SUMA A DEDUCIR POR APORTE A LA SALUD.(EPS) 12,5%.
 * LA SUMA A DEDUCIR POR APORTE AL FONDO DE PENSIONES 16%.
 * TOTAL A RECIBIR.
 *
 * TODA LA INFORMACIÓN QUE DEBE PROVEER EL USUARIO DEL PROGRAMA
 * ES EL SALARIO DEL EMPLEADO Y EL VALOR DE AHORRO MENSUAL
 * PROGRAMADO. EL PROGRAMA DEBE CALCULAR Y RETORNAR EL RESTO DE LOS
 * DATOS.
 * */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo17 {
    public static void InformacionEmpleado() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Salario Del Empleado: ");
            double salarioEmpleado = teclado.nextDouble();

            System.out.println("Ingrese El Valor Mensual De Ahorro Programado: ");
            double ahorro = teclado.nextDouble();

            double salud = salarioEmpleado * 0.125;
            double pension = salarioEmpleado * 0.16;
            double totalSalario = salarioEmpleado - (ahorro + salud + pension);

            System.out.println("\nSalario Empleado: " + salarioEmpleado + "$" +
                                "\nAhorro Mensual: " + ahorro + "$" +
                                "\nSalud: " + salud + "$" +
                                "\nPension: " + pension + "$" +
                                "\nTotal Salario: " + totalSalario + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " +  e);
        }
    }
}
