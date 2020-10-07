// PROBLEMA #2.
/// ELABORE UN ALGORITMO QUE LUEGO DE LEER LA EDAD DE UNA PERSONA,
/// MUESTRE LA CANTIDAD DE DIAS, SEMANAS, MESES, HORAS, MINUTOS, SEGUNDOS 
/// QUE HA VIVIDO.

Algoritmo DosSegundaParte
	
	Definir edad, dias, semanas, meses, horas, minutos, segundos como Real;
	
	Escribir "cuantos años tienes?";
	leer edad;
	
	dias = edad * 365;
	semanas = edad * 48;
	meses = edad * 12;
	horas = dias * 24;
	minutos = horas * 60;
	segundos = minutos * 60;
	
	Escribir "Dias Vividos: ",dias;
	Escribir "Semanas Vividas: ",semanas;
	Escribir "Meses Vividos: ",meses;
	Escribir "Horas Vividas: ",horas;
	Escribir "Minutos Vividos: ",minutos;
	Escribir "Segundos: ",segundos;
	
FinAlgoritmo
