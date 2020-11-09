/** PROBLEMA #5
 * EN UN ALMACEN SE HACE UN 20% DE DESCUENTO A LOS
 * CLIENTES CUYA COMPRA SEA SUPERIOR A $100.000
 * ¿CUANTO DEBERIA PAGAR CADA CLIENTE?
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo05 {
    public static void Almacen() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Precio De La Compra: ");
            double precio = teclado.nextDouble();

            System.out.println("Ingrese La Cantidad De Los Articulos Comprados: ");
            int cantidad = teclado.nextInt();

            if(precio > 100_000) {
                double pago = precio * cantidad;

                System.out.println("\nPrecio Producto: " + precio + "$" +
                                   "\nCantidad Productos: " + cantidad +
                                   "\nPago Total: " + pago + "$");
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido." + e);
        }
    }
}
