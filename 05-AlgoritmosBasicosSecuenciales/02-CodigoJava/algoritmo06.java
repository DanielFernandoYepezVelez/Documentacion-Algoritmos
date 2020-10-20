/** PROBLEMA #3
 * UN AMIGO SUYO ACABA DE INICIAR UN NEGOCIO DE VENTA DE ZAPATOS.
 * POR AHORA SOLO SE VENDEN TRES TIPOS DE ZAPATOS: SANDALIAS,
 * TENIS Y MOCASIONES. CADA TIPO DE ZAPATO LO ADQUIERE A UN COSTO
 * DISTINTO Y PARA VENDERLOS, SUPONE UNA GANANCIA DEL 55%.
 * CUANDO UN CLIENTE LLEGA DEBE COMPRAR DE LOS TRES TIPOS DE
 * ZAPATOS Y LA CANTIDAD QUE DESEE DE CADA UNO DE ELLOS (SI O SI
 * EL CLIENTE SIEMPRE COMPRA LOS 3 TIPOS DE ZAPATOS).EL CLIENTE
 * TIENE DERECHO A UN 8% DE DESCUENTO SOBRE LA COMPRA QUE REALIZA.
 * AYUDELE A SU AMIGO A CREAR UN PROGRAMA QUE, PARA CADA CLIENTE
 * DADO, MUESTRE SU NOMBRE, EL VALOR DE LA VENTA SIN DESCUENTO,
 * EL DESCUENTO, EL VALOR DE LA VENTA CON DESCUENTO Y VALOR DE LA
 * VENTA INCLUYENDO IVA(VENTA NETA FINAL).
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo06 {
    public static void VentaZapatos() {
        double PRECIO_SANDALIAS = 8000;
        double PRECIO_TENNIS = 15000;
        double PRECIO_MOCASIONES = 25000;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Nombre Completo: ");
            String nombre = teclado.nextLine();

            System.out.println("Cantidad De Sandalias: ");
            int sandaliasC = teclado.nextInt();
            double sandaliasP = sandaliasC * PRECIO_SANDALIAS;

            System.out.println("Cantidad De Tenis: ");
            int tennisC = teclado.nextInt();
            double tennisP = tennisC * PRECIO_TENNIS;

            System.out.println("Cantidad De Mocasiones: ");
            int mocasinesC = teclado.nextInt();
            double mocasinesP = mocasinesC * PRECIO_MOCASIONES;

            double venta = sandaliasP + tennisP + mocasinesP;
            double iva = venta * 0.19;
            double descuento = venta * 0.08;
            double ventaDescuento = venta - descuento;
            double pagoTotal = (venta + iva) - descuento;

            System.out.println("\nSandalias => Precio: " + sandaliasP + "$ - Cantidad: " + sandaliasC +
                               "\nTennis => Precio: " + tennisP + "$ - Cantidad: " + tennisC +
                               "\nMocasiones => Precio: " + mocasinesP + "$ - Cantidad: " + mocasinesC +
                               "\n\nNombre Completo: " + nombre +
                               "\nVenta Sin Descuento: " + venta + "$" +
                               "\nIva: " + iva + "$" +
                               "\nDescuento: " + descuento + "$" +
                               "\nVenta Con Descuento: " + ventaDescuento + "$" +
                               "\nPago Total: " + pagoTotal + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
