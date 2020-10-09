// PROBLEMA #12.
/// UN CONSTRUCTOR SABE QUE NECESITA 0.5 METROS CUBICOS DE ARENA POR
/// METRO CUADRADO DE REVOQUE A REALIZAR.HACER UN PROGRAMA DONDE INGRESE
/// LAS MEDIDAS DE UNA PARED (LARGO Y ANCH0) EXPRESADA EN METROS Y 
/// OBTENGA LA CANTIDAD DE ARENA NECESARIA PARA REVOCARLA.

Algoritmo DoceSegundaParte
	
	Definir altura, anchura, metrosArena, cantidadArena como real;
	
	Escribir "metros de altura que tiene la pared";
	leer altura;

	Escribir "metros de anchura que tiene la pared";
	leer anchura;
	
	metrosArena = altura * anchura;
	cantidadArena = metrosArena / 0.5;
	
	Escribir " ";
	Escribir "cantidad de arena necesaria: ", cantidadArena, " metros cubicos de arena";
	
FinAlgoritmo
