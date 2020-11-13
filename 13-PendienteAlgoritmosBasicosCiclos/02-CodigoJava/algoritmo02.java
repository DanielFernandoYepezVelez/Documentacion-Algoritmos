/** PROBLEMA #2
 * IMPRIMIR EN PANTALLA LOS PRIMEROS 50 NÙMEROS NATURALES (PARA - FOR).
 */

package com.company;

public class algoritmo02 {
    public static void NumerosNaturales() {

        try {
            for(int i = 0; i < 50; i++) {
                System.out.println("Numero => " + (i+1));
            }

        } catch (Exception e) {
            System.out.println("Problemas Con La Ejecuciòn Del Sistema. " + e);
        }
    }
}
