/* PROBLEMA #1
* A UN EMPLEADO LE RETIENEN 12% DE SU SALARIO BÁSICO. CALCULAR
* EL SALARIO NETO, SABIENDO QUE LE ENTREGAN UN BONO DEL 2.3% DEL
* SALARIO BÁSICO. SE DEBE LEER EL SALARIO BÁSICO DEL EMPLEADO.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS1 {
    public static String salarioEmpleado() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar Salario Básico: ");
        double basicoS = teclado.nextDouble();

        double retencion = basicoS * 0.12;
        double bono = basicoS * 0.023;
        double netoS = basicoS + bono - retencion;

        return "Salario Bàsico: " + basicoS + "$" + "\nBono: " + bono + "$"  + "\nRetención: " + retencion + "$"  + "\nSalario Neto: " + netoS + "$";
    }
}
