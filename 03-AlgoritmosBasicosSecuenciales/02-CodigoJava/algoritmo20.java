/** PROBLEMA #20
 * INGRESAR EL PRECIO DE COMPRA UNITARIA DE UN PRODUCTO
 * Y LA CANTIDAD DE COMPRA DE DICHO PRODUCTO Y UN
 * DESCUENTO. CALCULAR Y MOSTRAR EL SUBTOTAL, EL MONTO
 * DEL IVA QUE ES DEL 19% DEL SUBTOTAL Y EL PRECIO
 * NETO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo20 {
    public static void Producto() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Precio De Un Producto: ");
            double precio = teclado.nextDouble();

            System.out.println("Ingrese La Cantida De Productos Comprados: ");
            int cantidad = teclado.nextInt();

            System.out.println("Ingrese Un Descuento Para El Producto: ");
            double descuento = teclado.nextDouble();

            double subtotal = precio * cantidad;
            double iva = subtotal * 0.19;
            double desc = subtotal * (descuento / 100);
            double total = (subtotal + iva) - desc;

            System.out.println("\nPrecio: " + precio + "$" +
                                "\nCantidad: " + cantidad + "$" +
                                "\nSubtotal: " + subtotal + "$" +
                                "\nIva: " + iva + "$" +
                                "\nDescuento (%): " + desc + "$" +
                                "\nTotal:" + total + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
