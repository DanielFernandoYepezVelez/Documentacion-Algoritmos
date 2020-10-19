/** PROBLEMA #4
 * CREAR UN ALGORITMO QUE CÁLCULE LOS AÑOS QUE
 * USTED TIENE EN BASE A SU AÑO DE NACIMIENTO,
 * DEBE CREAR UNA CONSTANTE CON UN VALOR NÚMERICO
 * (AÑO DE SU NACIMIENTO) Y HACER EL CÁLCULO.
 */

package com.danielfernandoyepezvelez;

import java.util.Calendar;

public class algoritmo04 {
    public static void Nacimiento() {
        int NACIMIENTO = 1993;
        Calendar year = Calendar.getInstance();

        try {
            int edad = year.get(Calendar.YEAR) - NACIMIENTO;
            System.out.println("Edad: " + edad + " Años");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El Valor No Es Válido. " + e);
        }
    }
}
