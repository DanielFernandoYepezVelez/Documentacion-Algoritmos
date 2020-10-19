/** PROBLEMA #5
 * CREAR UN ALGORITMO QUE CALCULE EL PRECIO TOTAL A PAGAR
 * PARA UN USUARIO DEL METRO QUE DESEA RECARGAR LA TARJETA
 * CIVICA, EL USUARIO SOLO INGRESA EL NÚMERO DE VIAJES
 * QUE QUIERE COMPRAR, SE LE DEBE DECIR CUÁNTO LE CUESTA.
 * SUPONGA QUE EL VIAJE VALE 2000$
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmoS5 {
    public static void RecargarCivica() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Número De Viajes Que Desea Recargar: ");
            int viajes = teclado.nextInt();

            double recarga = viajes * 2000;

            System.out.println("\nViajes Disponibles: " + viajes + " Viajes" +
                               "\nPago Total: " + recarga + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
