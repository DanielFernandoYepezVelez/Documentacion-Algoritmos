/** PROBLEMA #2
 * HACER UN ALGORITMO QUE CALCULE EL TOTAL A PAGAR POR LA COMPRA
 * DE CAMISAS. SI SE COMPRAN TRES CAMISAS O MÀS SE APLICA UN DESCUENTO
 * DEL 20% SOBRE EL TOTAL DE LA COMPRA Y SI SON MENOS DE TRES CAMISAS
 * UN DESCUENTO DEL 10%.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo02 {
    public static void Camisas() {
        double descuento = 0, total = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Precio De La Camisa: ");
            double precio = teclado.nextDouble();

            System.out.println("Ingrese La Cantidad De Camisas: ");
            double cantidad = teclado.nextDouble();

            double compra = precio * cantidad;

            if (cantidad >= 3) {
                descuento = compra * 0.20;
                total = compra - descuento;

            } else if (cantidad > 0 && cantidad < 3) {
                descuento = compra * 0.10;
                total = compra - descuento;

            } else {
                System.out.println("La Cantidad Ingresada No Es Vàlida.");
                return;
            }

            System.out.println("\nCantidad Camisas: " + cantidad +
                               "\nPrecio Camisa: " + precio +
                               "\nCompra Inicial: " + compra +
                               "\nDescuento: " + descuento +
                               "\nPago Total: " + total);

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
