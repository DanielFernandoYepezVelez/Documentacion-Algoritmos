/** PROBLEMA #5
 * UNA EMPRESA ALQUILA AUTOS DE TRES CLASES: PEQUEÑOS, MEDIANOS
 * Y GRANDES. LA TARIFA DE ALQUILER POR DIA ES: $50.000 EN EL
 * AUTO PEQUEÑO; $80.000 EN EL AUTO MEDIANO Y $110.000 EN EL
 * AUTO GRANDE. ADEMÀS, LA EMPRESA COBRA $1.500/KM RECORRIDO
 * EN EL AUTO PEQUEÑO, $2.300/KM RECORRIDO EN EL AUTO MEDIANO
 * Y $2.600/KM EN EL AUTO GRANDE. SI LA CANTIDAD DE KILOMETROS
 * RECORRIDOS POR EL AUTO SUPERA LOS 50 KM, SE LE AUMENTARÀ UN
 * 2.5% SOBRE EL MONTO A PAGAR POR EL CLIENTE. ELABORE UN
 * ALGORITMO QUE GENERE EL SIGUIENTE REPORTE:
 *
 * TAMAÑO DEL AUTO ALQUILADO:   XXX
 * TARIFA POR DÌA:              $$$
 * KILÒMETROS RECORRIDOS:       XXX
 * VALOR A PAGAR:               $$$
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo05 {
    public static void Autos() {
        Scanner teclado = new Scanner(System.in);
        double valorDia = 0, valorKm = 0, alquiler = 0, valorKM = 0, pagoReserva = 0, extra = 0;

        System.out.println("Codigo  - - Tamaño Auto");
        System.out.println("  1     - -   Pequeño");
        System.out.println("  2     - -   Mediano");
        System.out.println("  3     - -   Grande");

        try {
            System.out.println("\nIngrese El Còdigo Del Tamaño Del Auto: ");
            String tamaño = teclado.nextLine();

            if(tamaño.contains("1") || tamaño.contains("2") || tamaño.contains("3")) {
                System.out.println("\nIngrese La Cantidad De Dìas Reservados: ");
                int dias = teclado.nextInt();

                System.out.println("Ingrese Los Kilometros Recorridos: ");
                double km = teclado.nextDouble();

                if(tamaño.contains("1")) {
                    valorKm = 1500;
                    valorDia = 50_000;
                    tamaño = "Pequeño";
                    valorKM = km * 1500;
                    alquiler = dias * 50_000;
                    pagoReserva = alquiler + valorKM;

                } else if (tamaño.contains("2")) {
                    valorKm = 2300;
                    valorDia = 80_000;
                    valorKM =km * 2300;
                    tamaño = "Mediano";
                    alquiler = dias * 80_000;
                    pagoReserva = alquiler + valorKM;

                } else if (tamaño.contains("3")) {
                    valorKm = 2600;
                    tamaño = "Grande";
                    valorDia = 110_000;
                    valorKM = km * 2600;
                    alquiler = dias * 110_000;
                    pagoReserva = alquiler + valorKM;
                }

                if(km > 50) {
                    extra = pagoReserva * 0.025;
                    pagoReserva += extra;
                }

                System.out.println("\nTamaño Auto: " + tamaño +
                        "\nDias Reservados: " + dias +
                        "\nKilomètros Recorridos: " + km +
                        "\nValor Dìa: " + valorDia + "$" +
                        "\nValor Km: " + valorKm + "$" +
                        "\nValor Dias Reservados: " + alquiler + "$" +
                        "\nValor Kilometros Recorridos: " + valorKM + "$" +
                        "\nExcendente: " + extra + "$" +
                        "\nPago Total: " + pagoReserva + "$");

            } else  {
                System.out.println("El Codigo Ingresado No Hace Parte De Nuestro Portafolio De Servicios.");
                return;
            }

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
