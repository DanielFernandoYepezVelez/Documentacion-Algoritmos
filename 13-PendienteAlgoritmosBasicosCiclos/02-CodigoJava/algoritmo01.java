/** PROBLEMA #1
 * IMPRIMIR EN PANTALLA LOS NÙMEROS DEL 1 AL 10 (PARA - FOR).
 */

package com.company;

public class algoritmo01 {
    public static void Numeros() {

        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("Numero => " + (i+1));
            }

        } catch (Exception e) {
            System.out.println("Problemas Con La Ejecuciòn Del Sistema. " + e);
        }
    }
}
