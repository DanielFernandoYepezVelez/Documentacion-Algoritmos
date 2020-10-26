/** PROBLEMA #1
 * LA AGENCIA DE VIAJES PAPELUCHO, OFRECE PLANES DE CREDITO
 * PARA LA ADQUISICIÒN DE LOS DIFERENTES PLANES DE VIAJES QUE
 * REALIZAN ALREDEDOR DEL MUNDO. SI EL VIAJE VALE MÀS DE
 * $35,000.000 LA AGENCIA SOLICITA UN 50% DE CUOTA INICIAL
 * Y EL RESTO DEBE CUBRIRSE EN 12 MENSUALIDADES SIN INTERESES.
 * SI EL PLAN DE VIAJE TIENE UN VALOR MAXIMO DE $35,000.000
 * SE REQUIRE UNA CUOTA INICIAL DEL 40% Y EL RESTO SE DEBE
 * PAGAR EN 10 MENSUALIDADES SIN INTERES.
 *
 * LA AGENCIA DESEA SABER, EN BASE AL PRECIO DE UN VIAJE QUE
 * UN DETERMINADO CLIENTE ELIJA, CUÀL ES EL MONTO DE LA
 * CUOTA INICIAL Y CUÀL ES EL NÙMERO Y EL MONTO DE LAS
 * MENSUALIDADES QUE ÈSTE DEBE CUBRIR.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo01 {
    public static void AgenciaViajes() {
        double cuotas = 0, cuotaInicialDesc = 0, restoMensual = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor Del Viaje: ");
            double precio = teclado.nextDouble();

            if(precio > 35_000_000) {
                cuotas = 12;
                cuotaInicialDesc = precio * 0.50;
                restoMensual = (precio - cuotaInicialDesc) / 12;


            } else if(precio <= 35_000_000) {
                cuotas = 10;
                cuotaInicialDesc = precio * 0.40;
                restoMensual = (precio - cuotaInicialDesc) / 10;
            }

            System.out.println("\nPrecio Inicial: " + precio + "$" +
                               "\nValor Descuento: " + cuotaInicialDesc + "$" +
                               "\nPago Mensual: " + restoMensual + "$" +
                               "\nNùmero De Cuotas: " + cuotas +
                               "\nPago Total: " + (restoMensual * cuotas) + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
