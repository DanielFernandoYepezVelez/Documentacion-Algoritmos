// PROBLEMA #13.
/// ELABORE UN PROGRAMA QUE REALICE LA CONVERSION DE LIBRAS A  
/// KILOGRAMOS, DONDE 1KG=2.2046 LIBRAS.

Algoritmo TreceSegundaParte
	
	Definir numero, conversion como real;
	
	Escribir "ingresar un numero ";
	leer numero;
	
	conversion = numero * (1 / 2.2046);
	
	Escribir " ";
	Escribir "conversion de libras a kilogramos: ", conversion, " kg";
	
FinAlgoritmo
