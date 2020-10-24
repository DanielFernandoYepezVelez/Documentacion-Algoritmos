// PROBLEMA #7.
/// ESCRIBA UN PSEUDOCODIGO QUE PERMITA CALCULAR EL AREA DE LAS 
/// SIGUIENTES FORMAS PLANAS A PARTIR DEL INGRESO DE LAS VARIABLES 
/// IDENTIFICADAS EN CADA FORMULA.

/// TRIANGULO<=>AREA=(BASE*ALTURA)/2
/// RECTANGULO<=>AREA=ANCHURA*ALTURA
/// TRAPECIO<=>AREA=(AREA MENOR+AREA MAYOR)*ALTURA
/// CUADRADO<=>AREA=(LONGITUD DEL LADO)^2
/// PARALELOGRAMO<=>AREA=ANCHURA*ALTURA
/// CIRCULO<=>AREA=PI*(RADIO)^2

Algoritmo SieteSegundaParte
	
	Definir base, altura, areaTriangulo, anchura, altura1, areaRectangulo, baseMenor, baseMayor, altura3, areaTrapecio, lado como real;
	definir areaCuadrado, anchura1, altura4, areaParalelogramo, radianes, numeroPI, areaCirculo como real;
	
	Escribir " ";
	Escribir "INGRESE DOS VALORES PARA CALCULAR EL AREA DE UN TRIANGULO";
	Escribir "ingrese el valor de la base";
	leer base;

	Escribir "ingrese el valor de la altura";
	leer altura;

	areaTriangulo = (base * altura) / 2;
	Escribir "el area del triangulo: ", areaTriangulo, " metros cuadrados";
	
	Escribir " ";
	Escribir "INGRESE DOS VALORES PARA CALCULAR EL AREA DE RECTANGULO";
	Escribir "ingrese el valor de la anchura";
	leer anchura;

	Escribir "ingrese el valor de la altura";
	leer altura1;

	areaRectangulo = anchura * altura1;
	Escribir"el area del rectangulo: ", areaRectangulo, " metros cuadrados";
	
	Escribir " ";
	Escribir "INGRESE TRES VALORES PARA CALCULAR EL AREA DE UN TRAPECIO";
	Escribir "ingrese el valor de la base menor";
	leer baseMenor;

	Escribir "ingrese el valor de la base mayor";
	leer baseMayor;

	Escribir "ingrese el valor de la altura";
	leer altura3;

	areaTrapecio = (baseMenor + baseMayor) * altura3;
	Escribir "el area del trapecio: ", areaTrapecio, " metros cuadrados";
	
	Escribir " ";
	Escribir "INGRESE UN VALOR PARA CALCULAR EL AREA DE UN CUADRADO";
	Escribir "ingrese el valor del lado";
	leer lado;

	areaCuadrado = (lado) ^ 2;
	Escribir "el area del cuadrado: ", areaCuadrado, " metros cuadrados";
	
	Escribir " ";
	Escribir "INGRESE DOS VALORES PARA CALCULAR EL AREA DE UN PARALELOGRAMO";
	Escribir "ingrese el valor de la anchura";
	Leer anchura1;

	Escribir "ingrese el valor de la altura";
	leer altura4;

	areaParalelogramo = anchura1 * altura4;
	Escribir "el area del paralelogramo: ", areaParalelogramo, " metros cuadrados";
	
	Escribir " ";
	Escribir "INGRESE UN VALOR PARA CALCULAR EL AREA DE UN CIRCULO";
	Escribir "ingrese el valor de los radianes";
	leer radianes;

	numeroPI = 3.14;
	areaCirculo = [(radianes) ^ 2] * numeroPI;
	Escribir "el area del circulo es: ", areaCirculo, " metros cuadrados";
	
FinAlgoritmo
