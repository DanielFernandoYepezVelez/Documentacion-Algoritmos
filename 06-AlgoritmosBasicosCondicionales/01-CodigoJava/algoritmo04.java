/** PROBLEMA #4
 * UNA EMPRESA CON TRES DEPARTAMENTOS TIENE ESTABLECIDO
 * UN PLAN DE INCENTIVOS PARA SUS VENDEDORES. AL FINAL DEL
 * PERIODO A CADA DEPARTAMENTO SE LE PIDE EL INFORME GLOBAL
 * DE LAS VENTAS. A LOS DEPARTAMENTOS QUE EXCEDAN EL 33% DE
 * LAS VENTAS TOTALES SE LES ADICIONA AL SALARIO DE LOS
 * VENDEDORES UN PORCENTAJEN EQUIVALENTE AL 20% DEL
 * SALARIO MENSUAL. LAS NÓMINAS DE LOS TRES DEPARTAMENTOS
 * SON IGUALES. SI SE TIENEN LOS SIGUIENTES DATOS:
 *
 * VENTAS DEL DEPARTAMENTO 1.
 * VENTAS DEL DEPARTAMENTO 2.
 * VENTAS DEL DEPARTAMENTO 3.
 * SALARIO DE LOS VENDEDORES DE CADA DEPARTAMENTO.
 *
 * HACER UN ALGORITMO QUE DETERMINE CUÁNTO RECIBIRÁN
 * LOS VENDEDORES DE CADA DEPARTAMENTO AL FINALIZAR
 * EL PERIODO.
 */

package com.danielfernandoyepezvelez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algoritmo04 {
    public static void VentasDepartamento() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese Las Ventas Del Departamento #1: ");
            double departamentoUno = teclado.nextInt();

            System.out.println("Ingrese Las Ventas Del Departamento #2: ");
            double departamentoDos = teclado.nextInt();

            System.out.println("Ingrese Las Ventas Del Departamento #3: ");
            double departamentoTres = teclado.nextInt();

            System.out.println("Ingrese El Salario De Los Vendedores: ");
            double salarioVendedores = teclado.nextDouble();

            double incremento = salarioVendedores * 0.20;
            double salarioVendedorUno = salarioVendedores;
            double salarioVendedorDos = salarioVendedores;
            double salarioVendedorTres = salarioVendedores;

            double ventasTotales = departamentoUno + departamentoDos + departamentoTres;

            double porcentajeUno = (departamentoUno * 100) / ventasTotales;
            double porcentajeDos = (departamentoDos * 100) / ventasTotales;
            double porcentajeTres = (departamentoTres * 100) / ventasTotales;

            if(porcentajeUno > 33) {
                salarioVendedorUno = salarioVendedores + incremento;
            }

            if(porcentajeDos > 33) {
                salarioVendedorDos = salarioVendedores + incremento;
            }

            if(porcentajeTres > 33) {
                salarioVendedorTres = salarioVendedores + incremento;
            }

            System.out.println("\nVentas Totales: " + ventasTotales + "$" +
                               "\nPorcentaje Ventas Departamento #1: " + porcentajeUno + "%" +
                               "\nPorcentaje Ventas Departamento #2: " + porcentajeDos + "%" +
                               "\nPorcentaje Ventas Departamento #3: " + porcentajeTres + "%" +
                               "\nSalario Base Vendedores: " + salarioVendedores + "$" +
                               "\nIncremento (20%): " + incremento + "$" +
                               "\nSalario Vendedores Departamento #1: " + salarioVendedorUno + "$" +
                               "\nSalario Vendedores Departamento #2: " + salarioVendedorDos + "$" +
                               "\nSalario Vendedores Departamento #3: " + salarioVendedorTres + "$");

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
        }
    }
}
