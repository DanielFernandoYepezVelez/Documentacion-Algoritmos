/* PROBLEMA #7
* ESCRIBA UN PSEUDOCÓDIGO QUE PERMITA CALCULAR EL AREA DE LAS
* SIGUIENTES FORMAS PLANAS A PARTIR DEL INGRESO DE LAS VARIABLES
* IDENTIFICADAS EN CADA FÓRMULA.
*
* TRIANGULO <=> AREA = (BASE * ALTURA) / 2
* RECTANGULO <=> AREA = ANCHO * ALTO
* TRAPECIO <=> AREA = (AREA MENOR + AREA MAYOR) * ALTURA
* CUADRADO <=> AREA = (LONGITUD DEL LADO) ^ 2
* PARALELOGRAMO <=> AREA = ANCHO * ALTO
* CIRCULO <=> AREA = PI * (RADIO) ^ 2
* */

package com.danielfernandoyepezvelez;

import java.util.Scanner;

public class algoritmoS7 {
    public static String FigurasPlanas() {
        double PI = Math.PI;
        double base, altura, ancho, menorA, mayorA, lado, radio;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese Un Valor Para Determinar La BASE De Una Firgura Geométrica Plana: ");
        base = teclado.nextDouble();

        System.out.println("Ingrese Un Valor Para Determinar La ALTURA De Una Firgura Geométrica Plana: ");
        altura = teclado.nextDouble();

        System.out.println("Ingrese Un Valor Para Determinar El ANCHO De Una Firgura Geométrica Plana: ");
        ancho = teclado.nextDouble();

        System.out.println("Ingrese Un Valor Para Determinar El AREA MENOR De Una Firgura Geométrica Plana: ");
        menorA = teclado.nextDouble();

        System.out.println("Ingrese Un Valor Para Determinar El AREA MAYOR De Una Firgura Geométrica Plana: ");
        mayorA = teclado.nextDouble();

        System.out.println("Ingrese Un Valor Para Determinar El LATERAL De Una Firgura Geométrica Plana: ");
        lado = teclado.nextDouble();

        System.out.println("Ingrese Un Valor Para Determinar El RADIO De Una Firgura Geométrica Plana: ");
        radio = teclado.nextDouble();

        double triangulo = (base * altura) / 2;
        double rectangulo = ancho * altura;
        double trapecio = (menorA + mayorA) * altura;
        double cuadrado =  Math.pow(lado, 2);
        double paralelogramo = ancho * altura;
        double circulo = PI * Math.pow(radio, 2);

        return "\nArea Triangulo: " + triangulo +
               "\nArea Rectangulo: " + rectangulo +
               "\nArea Trapecio: " + trapecio +
               "\nArea Cuadrado: " + cuadrado +
               "\nArea Paralelogramo: " + paralelogramo +
               "\nArea Circulo: " + circulo;
    }
}
