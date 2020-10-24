/* PROBLEMA #6
* ESCRIBA UN PSEUDOCODIGO, QUE LUEGO DE LEER LOS SIGUIENTES DATOS
* DE UN EMPLEADO(NOMBRE Y SUELDO MENSUAL). GENERE UN COMPROBANTE
* DE PAGO CON LOS SIGUIENTES DATOS.
*
* ********** COMPROBANTE DE PAGO **********
* NOMBRE: XXXXXXXX
* SUELDO: $XXXXXXXX
*
* DETALLES DEL PAGO
* APORTES A SALUD 4%: $XXXXXX
* APORTES A PENSIÓN 4%: $XXXXX
* SALARIO NETO: $XXXXXXX
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS6 {
    public static String Comprobante() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar Nombre Completo: ");
        String nombre = teclado.nextLine();

        System.out.println("Ingresar Salario Mensual: ");
        double salario = teclado.nextDouble();

        double salud = salario * 0.04;
        double pension = salario * 0.04;
        double salarioNeto = salario - (salud + pension);

        return  "\n********** COMPROBANTE DE PAGO **********" +
                "\nNombre Completo: " + nombre +
                "\nSalario Mensual: " + salario + "$" +
                "\nDETALLES DEL PAGO" +
                "\nAPORTES A SALUD 4%: " + salud + "$" +
                "\nAPORTES A PENSION 4%: " + pension + "$" +
                "\nSALARIO NETO: " + salarioNeto + "$";
    }
}
