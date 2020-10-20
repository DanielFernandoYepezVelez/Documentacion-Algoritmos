/** PROBLEMA #11
 * LA COMPAÑIA DE LUZ Y SOMBRAS (CLS) REQUIERE DETERMINAR
 * EL PAGO QUE DEBE REALIZAR UNA PERSONA POR EL CONSUMO
 * DE ENERGIA ELECTRICA, LA CUAL SE MIDE EN KILOWATTS(KW)
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo11 {
    public static void Electricidad() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Consumo Total De Kilowatts: ");
            double kilowatts = teclado.nextDouble();

            System.out.println("Ingrese El Precio Por Kilowatt: ");
            double precio = teclado.nextDouble();

            double pagoFactura = kilowatts * precio;

            System.out.println("\nConsumo: " + kilowatts + " Kilowatts" +
                               "\nPrecio Por Kilowatt: " + precio + "$" +
                               "\nPago Factura: " + pagoFactura + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
