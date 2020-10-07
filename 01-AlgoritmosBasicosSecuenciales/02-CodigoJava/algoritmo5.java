/* PROBLEMA #5
* ELABORE UN ALGORITMO QUE LEA DOS NUMEROS ENTEROS Y QUE RETORNE
* COMO SALIDA LA SUMA, RESTA, MULTIPLICACIÓN, DIVISÓN Y MODULO
* DEL PRIMERO POR EL SEGUNDO.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo5 {
    public String operaciones() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese El Primer Valor: ");
        double numeroUno = teclado.nextDouble();

        System.out.println("Ingrese El Segundo Valor: ");
        double numeroDos = teclado.nextDouble();

        var suma = this.suma(numeroUno, numeroDos);
        var sustraccion = this.sustraccion(numeroUno, numeroDos);
        var producto = this.producto(numeroUno, numeroDos);
        var division = this.division(numeroUno, numeroDos);
        var modulo = this.modulo(numeroUno, numeroDos);

        return "SUMA: " + suma + "\nRESTA: " + sustraccion + "\nPRODUCTO: " + producto + "\nDIVISION: " + division + "\nMODULO: " + modulo;
    }

    private double suma(double numeroUno, double numeroDos) {
        return numeroUno + numeroDos;
    }

    private double sustraccion(double numeroUno, double numeroDos) {
        return numeroUno - numeroDos;
    }

    private double producto(double numeroUno, double numeroDos) {
        return numeroUno * numeroDos;
    }

    private double division(double numeroUno, double numeroDos) {
        if(numeroDos == 0) {
            System.out.println("\nNo Es Posible Dividir Por 0 Actualmente");
            return -1;
        }

        return numeroUno / numeroDos;
    }

    private double modulo(double numeroUno, double numeroDos) {
        if(numeroUno == 0 || numeroDos == 0) {
            System.out.println("No Es Posible Aplicar El Operador Modulo A Esta Operación");
            return -1;
        }

        return numeroUno % numeroDos;
    }
}
