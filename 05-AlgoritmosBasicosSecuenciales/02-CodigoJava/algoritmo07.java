/** PROBLEMA #7
 * UN PRODUCTOR DE LECHE LLEVA EL REGISTRO DE LO QUE PRODUCE
 * EN LITROS, PERO CUANDO ENTREGA LE PAGAN EN GALONES. REALICE
 * UN ALGORITMO QUE AYUDE AL PRODUCTOR A SABER CUANTO RECIBIRA
 * POR LA ENTREGA DE SU PRODUCCIÓN DE UN DIA.
 * (1 GALON = 3.785 LITROS).
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo07 {
    public static void ConversionLitros() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese La Cantidad De Litros Producidos En Un Dia: ");
            double litros = teclado.nextDouble();

            System.out.println("Ingrese El Precio Por Galòn: ");
            double galonP = teclado.nextDouble();

            double galones = litros / 3.785;
            double pago = galones * galonP;

            System.out.println("\nLitros Producidos: " + litros +
                               "\nGalones Obtenidos: " + Math.round(galones) +
                               "\nPago Total: " + Math.round(pago) + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
