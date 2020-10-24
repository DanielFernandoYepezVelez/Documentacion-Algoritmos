/* PROBLEMA #1
* ELABORE UN ALGORITMO QUE LEA EL SALARIO ACTUAL DE UN EMPLEADO
* Y EL PORCENTAJE DE AUMENTO Y QUE CALCULE E IMPRIMA EL SALARIO
* ACTUAL, EL AUMENTO Y EL NUEVO SALARIO.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo1 {
    public static String salarioEmpleado() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar Salario Actual: ");
        double salario = teclado.nextDouble();

        System.out.println("Ingresar Nùmero De % Del Aumento Salarial: ");
        double aumento = (teclado.nextDouble() * salario) / 100;

        double nuevoSalario = salario + aumento;

        return "\nSalario Actual: " + salario + "$" + "\n" + "Aumento Salarial: " + aumento + "$" + "\n" + "Nuevo Salario: " + nuevoSalario + "$";
    }
}
