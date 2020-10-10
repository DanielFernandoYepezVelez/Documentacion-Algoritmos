/* PROBLEMA #9
* UN VENDEDOR RECIBE UN SUELDO BASE, MÁS UN 10% EXTRA POR
* COMISION DE SUS VENTAS, EL VENDEDOR DESEA SABER CUANTO
* DINERO OBTENDRA POR CONCEPTO DE COMISIONES POR LAS TRES
* VENTAS QUE REALIZA EN EL MES Y EL TOTAL QUE RECIBIRA
* EN EL MES TOMANDO EN CUENTA SU SUELDO BASE Y COMISIONES.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS9 {
    public static String Comisiones() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar Salario Base: ");
        double salario = teclado.nextDouble();

        double comision = salario * 0.10;
        double comisiones = comision * 3;
        double pagoTotal = salario + comisiones;

        return "\nSalario Base: " + salario + "$" +
                "\nComisiones: " + comisiones + "$" +
                "\nPago Total: " + pagoTotal+ "$";
    }
}
