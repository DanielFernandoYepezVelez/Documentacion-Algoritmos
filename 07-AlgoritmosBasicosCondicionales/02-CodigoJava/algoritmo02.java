/** PROBLEMA #2
 * USANDO LA SIGUIENTE TABLA, ESCRIBA UN ALGORITMO QUE LEA EL
 * CÒDIGO Y LA CANTIDAD DE UN PRODUCTO. VALOR A PAGAR.
 *
 * CÒDIGO DESCRIPCIÒN PRECIO
 *   1    Papitas     4.00
 *   2    Salchichas  4.50
 *   3    Maicitos    5.00
 *   4    Cereales    2.00
 *   5    Quesito     1.50
 *
 *  LA SALIDA DEBE MOSTRAR EL MENSAJE "TOTAL: $" SEGUIDO POR
 *  EL VALOR A PAGAR.
 *
 *  EJEMPLO DE ENTRADA EJEMPLO DE SALIDA
 *      3.2            Total: $10.00
 *      4.3            Total: $6.00
 *      2.3            Total: $13.50
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo02 {
    public static void Productos() {
        int cantidad = 0;
        double precio = 0;
        String nombre = "No Definido";
        Scanner teclado = new Scanner(System.in);
        String[] nombreProducto = {"Papitas", "Salchichas", "Maicitos", "Cereales", "Quesito"};

        try {
            System.out.println("Ingresa El Còdigo Del Producto: ");
            int codigo = teclado.nextInt();

            if (codigo >= 1 && codigo <= 5) {
                System.out.println("Ingrese La Cantidad De Productos Requeridos: ");
                cantidad = teclado.nextInt();
            }

            if(codigo == 1) {
                nombre = nombreProducto[0];
                precio = cantidad * 4.00;

            } else if(codigo == 2) {
                nombre = nombreProducto[1];
                precio = cantidad * 4.50;

            } else if(codigo == 3) {
                nombre = nombreProducto[2];
                precio = cantidad * 5.00;

            } else if(codigo == 4) {
                nombre = nombreProducto[3];
                precio = cantidad * 2.00;

            } else if(codigo == 5) {
                nombre = nombreProducto[4];
                precio = cantidad * 1.50;

            } else {
                codigo = 0;
                System.out.println("El Valor Ingresado No Tiene Un Còdigo Asignado.");
            }

            System.out.println("\nCodigo: " + codigo +
                               "\nNombre: " + nombre +
                               "\nCantidad: " + cantidad +
                               "\nTotal: " + precio + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
