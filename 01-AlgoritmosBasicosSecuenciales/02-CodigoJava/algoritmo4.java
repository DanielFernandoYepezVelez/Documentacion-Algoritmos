/* PROBLEMA #4
* ELABORE UN ALGORITMO QUE LEA EL CÓDIGO DE UN ARTICULO,
* EL PRECIO UNITARIO Y LA CANTIDAD VENDIDA. SU ALGORITMO
* DEBE CALCULAR E IMPRIMIR EL TOTAL DE LA VENTA, EL IVA
* Y EL TOTAL A PAGAR, SABIENDO QUE EL IMPUESTO ES DEL 19%.
*/

// package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo4 {
    public static String articulo() {
        Scanner teclado = new Scanner(System.in);
        double IVA = 0.19;

        System.out.println("Ingresar Código Del Articulo: ");
        int id = teclado.nextInt();

        System.out.println("Ingresar El Precio Unitario Del Articulo: ");
        double precio = teclado.nextDouble();

        System.out.println("Ingresar La Cantidad De Unidades Vendidas: ");
        int unidad = teclado.nextInt();

        double totalVenta = precio * unidad;
        double impuesto = totalVenta * IVA;
        double pagoTotal = totalVenta + impuesto;

        return "\nCodigo: " + id + "\nTotal Venta: " + totalVenta + "$" + "\nIVA: " + impuesto + "$" + "\nPago Total: " + pagoTotal+ "$" ;
    }
}
