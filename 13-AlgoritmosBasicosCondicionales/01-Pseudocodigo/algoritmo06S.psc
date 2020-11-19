//PROBLEMA #6
//EN UN MUSEO LOS VISITANTES MAYORES DE EDAD RECIBEN COMO OBSEQUIO UN LIBRO;
//EN CASO CONTRARIO, RECIBEN UN LAPICERO. DADA LA EDAD DEL VISITANTE,
//DISEÑE UN ALGORITMO QUE DETERMINE SI EL VISITANTE ES MAYOR DE EDAD O MENOR DE EDAD Y
//QUE REGALO LE CORRESPONDE.

Algoritmo SeisSegundaParte
	
	definir edad como real;
	
	escribir "visitante cual es su edad?";
	leer edad;
	
	si(edad>=18) entonces
		Escribir "visitante tu eres mayor de edad y te corresponde un LIBRO";
	SiNo
		Escribir "visitante eres menor de edad y te corresponde un LAPICERO" ;
	FinSi
	
FinAlgoritmo
