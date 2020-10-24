/* PROBLEMA #2
* SI LAS VARIABLES X Y Z TIENEN ALMACENADOS INTERNAMENTE LOS VALORES
* 30 Y 40 RESPECTIVAMENTE, EL RESULTADO DE LAS SIGUIENTES EXPRESIONES
* SERA:
* EXPRESIÓN       RESULTADO
* X = Z            (F O V)
* X > Z
* (X + 20) <> (Z + 1)
* Z >= X
* "A" > "B"
*/

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmo2 {
    public static void Expresiones() {
        int X = 30, Z = 40;
        Scanner teclado = new Scanner(System.in);

        System.out.println("SI X=30 Y Z=40 ENTONCES CONSIDERAR LOS SIGUIENTES ENUNCIADOS: ");
        System.out.println("SU RESPUESTA SOLO PUEDE SER: 'VERDADERAO O FALSO' \n");

        System.out.println("Respuesta Para Esta Expresión => (X = Z): ");
        String respuesta = teclado.nextLine();

        if(respuesta.equals("falso") || respuesta.equals("FALSO") || respuesta.contains("Falso")){
            System.out.println("**** CORRECTO ****\n");
        } else {
            System.out.println("ANALIZA MEJOR EL ENUNCIADO INICIAL\n");
        }

        System.out.println("Respuesta Para Esta Expresión => (X > Z): ");
        respuesta = teclado.nextLine();

        if(respuesta.equals("falso") || respuesta.equals("FALSO") || respuesta.contains("Falso")){
            System.out.println("**** CORRECTO ****\n");
        } else {
            System.out.println("ANALIZA MEJOR EL ENUNCIADO INICIAL\n");
        }

        System.out.println("Respuesta Para Esta Expresión => (X + 20) <> (Z + 1): ");
        respuesta = teclado.nextLine();

        if(respuesta.equals("verdadero") || respuesta.equals("VERDADERO") || respuesta.contains("Verdadero")){
            System.out.println("**** CORRECTO ****\n");
        } else {
            System.out.println("ANALIZA MEJOR EL ENUNCIADO INICIAL\n");
        }

        System.out.println("Respuesta Para Esta Expresión => (Z >= X): ");
        respuesta = teclado.nextLine();

        if(respuesta.equals("verdadero") || respuesta.equals("VERDADERO") || respuesta.contains("Verdadero")){
            System.out.println("**** CORRECTO ****\n");
        } else {
            System.out.println("ANALIZA MEJOR EL ENUNCIADO INICIAL\n");
        }

        System.out.println("Respuesta Para Esta Expresión => (\"A\" > \"B\"): ");
        respuesta = teclado.nextLine();

        if(respuesta.equals("falso") || respuesta.equals("FALSO") || respuesta.contains("Falso")){
            System.out.println("**** CORRECTO ****\n");
        } else {
            System.out.println("ANALIZA MEJOR EL ENUNCIADO INICIAL\n");
        }
    }
}
