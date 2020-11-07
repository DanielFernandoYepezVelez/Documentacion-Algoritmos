/** PROBLEMA #5
 * IMPRIMIR EN PANTALLA LOS NÙMEROS DEL 1 AL 10 (REPETIR HASTA QUE - DO WHILE).
 */

package com.company;

public class algoritmo05 {
    public static void NumeroDoWhile() {
        int i = 0;

        try {
            do {
                System.out.println("Numero => " + (i+1));
                i++;
            } while (i < 10);

        } catch (Exception e) {
            System.out.println("Problemas Con La Ejecuciòn Del Sistema. " + e);
        }
    }
}
