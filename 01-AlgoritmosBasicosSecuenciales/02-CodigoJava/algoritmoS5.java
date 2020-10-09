/* PROBLEMA #5
* CALCULAR EL SALARIO NETO DE UN TRABAJADOR SABIENDO QUE SE LE DEBE
* HACER UNA RETENCIÓN DEL 3% PARA PENSION Y 5% PARA SALUD. EL SALARIO
* SE CALCULA APARTIR DEL VALOR DE CADA HORA TRABAJADA Y EL NÚMERO DE
* HORAS TRABAJADAS POR EL EMPLEADO.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS5 {
    public static String SalarioTrabajador() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese El Valor De Paga Por Cada Hora: ");
        double horaPagada = teclado.nextDouble();

        System.out.println("Ingrese El Numero Horas Totales Trabajadas: ");
        double horasTrabajadas = teclado.nextDouble();

        double salarioEmpleado = horaPagada * horasTrabajadas;
        double salud = salarioEmpleado * 0.05;
        double pension = salarioEmpleado *  0.03;
        double salarioNeto = salarioEmpleado - (pension + salud);

        return "\nSalario Empleado: " + salarioEmpleado + "\nPension: " + pension + "\nSalud: " + salud + "\nSalario Neto: " + salarioNeto;
    }

}
