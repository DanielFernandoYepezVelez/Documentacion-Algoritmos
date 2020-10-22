// PROBLEMA #3.
/// LEER UN NUMERO ENTERO. SI ES POSITIVO, MOSTRAR UN MENSAJE INDICANDO QUE LO ES.

Proceso Tres
	
	Definir num como entero;
	
	Escribir "INGRESE UN NUMERO ENTERNO";
	leer num;
	
	si (num > 0) Entonces
		Escribir "EL NUMERO INGRESADO ES POSITIVO";
	SiNo
		si (num == 0) Entonces
			Escribir "EL NUMERO INGRESADO ES EL ELEMENTO NEUTRO";
		SiNo
			Escribir "EL NUMERO INGRESADO NO ES POSITIVO";
		FinSi
	FinSi
	
FinProceso
