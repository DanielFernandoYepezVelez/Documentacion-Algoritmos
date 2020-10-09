/* PROBLEMA #8
* TRES PERSONAS DECIDEN INVERTIR SU DINERO PARA FUNDAR UNA EMPRESA
* CADA UNA DE ELLAS INVIERTE UNA CANTIDAD DISTINTA. OBTENER EL
* PORCENTAJE QUE CADA QUIÉN INVIERTE CON RESPECTO A LA CANTIDAD
* TOTAL INVERTIDA.
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS8 {
    public static String Invertir() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Primera Cantidad Invertida: ");
        double cantidadUno = teclado.nextDouble();

        System.out.println("Segunda Cantidad Invertida: ");
        double cantidadDos = teclado.nextDouble();

        System.out.println("Tercera Cantidad Invertidad: ");
        double cantidadTres = teclado.nextDouble();

        double cantidadCompleta = cantidadUno + cantidadDos + cantidadTres;
        double porcentajeInvertidoUno = cantidadUno / cantidadCompleta * 100;
        double porcentajeInvertidoDos = cantidadDos / cantidadCompleta * 100;
        double porcentajeInvertidoTres = cantidadTres / cantidadCompleta * 100;

        return "\nInversión Total: " + cantidadCompleta + "$" +
               "\nInversión Uno %: " + Math.round(porcentajeInvertidoUno) + "%" +
               "\nInversión Dos %: " + Math.round(porcentajeInvertidoDos) + "%" +
               "\nInversión Tres %: " + Math.round(porcentajeInvertidoTres) + "%";
    }
}
