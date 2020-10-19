/** PROBLEMA #10
 * CREAR UN ALGORITMO QUE CALCULE EL PRECIO FINAL DE UN
 * PRODUCTO, TENIENDO EN CUENTA EL IVA DEL 19%, EL USUARIO
 * DEBE INGRESAR EL VALOR DEL PRODUCTO SIN IVA Y EL ALGORITMO
 * DEBE RETORNAR EL VALOR FINAL.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo10 {
    public static void PrecioProducto() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor Del Producto: ");
            double producto = teclado.nextDouble();

            double iva = producto * 0.19;
            double total = producto + iva;

            System.out.println("\nPrecio: " + producto + "$" +
                               "\nIva (19%): " + iva + "$" +
                               "\nPago Final: " + total + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
