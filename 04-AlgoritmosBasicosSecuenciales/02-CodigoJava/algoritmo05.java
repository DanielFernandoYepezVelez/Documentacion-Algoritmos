/** PROBLEMA #5
 * CREAR UN ALGORITMO QUE CALCULE EL PROMEDIO DE
 * 3 NOTAS. (N1 = 4.3 - N2 = 3.5 - N3 = 2.8)
 */

package com.danielfernandoyepezvelez;

public class algoritmo05 {
    public static void Promedio() {
        double NOTA_UNO = 4.3;
        double NOTA_DOS = 3.5;
        double NOTA_TRES = 2.8;

        try {
            double promedio = (NOTA_UNO + NOTA_DOS + NOTA_TRES) / 3;
            System.out.println("Promedio Final: " + promedio);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El Valor No Es Válido. " + e);
        }
    }
}
