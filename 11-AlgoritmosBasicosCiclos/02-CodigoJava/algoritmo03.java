/** PROBLEMA #3
 * IMPRIMA EN PANTALLA LOS NÙMEROS DEL 1 AL 10 (MIENTRAS - WHILE).
 */
package com.company;

public class algoritmo03 {
    public static void NumerosWhile() {
        int i = 0;

        try {
            while(i < 10) {
                System.out.println("Numero => " + (i+1));
                i++;
            }

        } catch (Exception e) {
            System.out.println("Problemas Con La Ejecuciòn Del Sistema. " + e);
        }
    }
}
