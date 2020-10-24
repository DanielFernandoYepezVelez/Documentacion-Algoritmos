/* PROBLEMA #5
* HACER UN SEGUIMIENTO O PRUEBA DE ESCRITORIO
* DEL SIGUIENTE GRUPO DE INSTRUCCIONES
*/

package com.danielfernandoyepezvelez;

public class algoritmo5 {
    public static void PruebaEscritorio() {
        double SUMA = 0;
        double X = 20;
        SUMA += X;

        double Z = 40;
        X += Math.pow(Z, 2);
        SUMA += X / Z;

        System.out.println("El Valor De Suma Es: " +  SUMA);
        System.out.println("Prueba De Escritorio En El Cuaderno Es Correcta!!!!");
    }
}
