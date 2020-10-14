/* PROBLEMA #1
* EL CÁLCULO DEL PAGO MENSUAL DE UN EMPLEADO DE UNA EMPRESA SE EFECTÚA
* DE LA SIGUIENTE MANERA: EL SUELDO BÁSICO SE CÁLCULA CON BASE AL NÚMERO
* TOTAL DE HORAS TRABAJADAS Y UNA TARIFA HORIARIA; AL SUELDO BÁSICO, SE
* LE APLICA UNA BONIFICACIÓN DEL 20% OBTENIENDO EL SUELDO BRUTO, AL SUELDO
* BRUTO, SE LE APLICA UN DESCUENTO DEL 10% OBTENIENDO EL SUELDO NETO.
* ESCRIBA UN ALGORITMO QUE CALCULE E IMPRIMA EL SUELDO BÁSICO, EL
* SUELDO BRUTO Y EL SUELDO NETO DE UN TRABAJADOR.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo1 {
    public static String PagoMensual() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese El Número De Horas Trabajadas: ");
        int horas = teclado.nextInt();

        System.out.println("Ingrese El Valor De La Tarifa Horaria: ");
        double tarifa = teclado.nextDouble();

        double sueldoBásico = horas * tarifa;
        double sueldoBruto = sueldoBásico + (sueldoBásico * 0.20);
        double sueldoNeto = sueldoBruto - (sueldoBruto * 0.10);

        return "\nSueldo Básico: " + sueldoBásico + "$" +
                "\nSueldo Bruto: " + sueldoBruto + "$" +
                "\nSueldo Neto: " + sueldoNeto + "$";
    }
}
