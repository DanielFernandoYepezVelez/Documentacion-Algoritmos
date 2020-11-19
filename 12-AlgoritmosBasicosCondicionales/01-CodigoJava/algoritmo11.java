/** PROBLEMA #11
 * UNA EMPRESA DESEA UNA COMPRA DE VARIAS
 * PIEZAS DE LA MISMA CLASE A UNA FABRICA. LA
 * EMPRESA, DEPENDIENDO DEL VALOR DE LA COMPRA,
 * DECIDIRÀ LA FORMA EN QUE LE PAGARÀ AL
 * FABRICANTE. SI EL VALOR DE LA COMPRA EXCEDE
 * O ES IGUAL A $5_000_000, LA EMPRESA TENDRÀ LA
 * CAPACIDAD DE PAGAR CON RECURSOS PROPIOS EL 55%
 * DEL VALOR DE LA COMPRA, PEDIRÀ PRESTADO A UN BANCO
 * EL 30% Y EL RESTO LO PAGARÀ SOLICITANDO UN CRÈDITO
 * AL FABRICANTE. SI EL MONTO TOTAL DE LA COMPRA
 * NO EXCEDE DE $5_000_000, LA EMPRESA TENDRÀ LA CAPACIDAD
 * DE PAGAR CON LOS RECURSOS PROPIOS UN 70% Y EL 30% RESTANTE,
 * LO PAGARÀ SOLICITANDO UN CRÈDITO AL FABRICANTE.
 * EL FABRICANTE COBRA UN 15% DE INTERÈS SOBRE LA CANTIDAD
 * QUE LE PAGUE A CRÈDITO.
 */

package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class algoritmo11 {
    public static void PiezasFabrica() {
        double pagoPropioEmpresa = 0, solicitarPrestamoBanco = 0, resto = 0,
                pagoFabricanteInteres = 0, totalPagoFabricante = 0, total = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese El Valor De La Compra: ");
            double compra = teclado.nextDouble();

            if (compra >= 100) {
                pagoPropioEmpresa = compra * 0.55;
                solicitarPrestamoBanco = compra * 0.30;
                resto = compra - (pagoPropioEmpresa + solicitarPrestamoBanco);

            } else {
                pagoPropioEmpresa = compra * 0.70;
                resto = compra - pagoPropioEmpresa;
            }
            pagoFabricanteInteres = resto * 0.15;
            totalPagoFabricante = resto + pagoFabricanteInteres;
            total = pagoPropioEmpresa + solicitarPrestamoBanco + totalPagoFabricante;

            System.out.println("\nValor De La Compra: " + compra + "$" +
                               "\nValor Pago Empresa: " + pagoPropioEmpresa + "$" +
                               "\nValor Prestamo Banco: " + solicitarPrestamoBanco + "$" +
                               "\nValor Credito Fabricante: " + resto + "$" +
                               "\nInteres Pago Fabricante: " + pagoFabricanteInteres + "$" +
                               "\nPago Total Fabricante: " + totalPagoFabricante + "$" +
                               "\nPago Total Por Las Piezas: " + total + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Vàlido. " + e);
        }
    }
}
