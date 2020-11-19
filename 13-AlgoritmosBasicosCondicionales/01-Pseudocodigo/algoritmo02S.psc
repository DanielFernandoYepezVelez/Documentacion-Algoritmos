//PROBLEMA #2.
//ELABORE UN ALGORITMO QUE LEA UN NUMERO ENTERO Y QUE PRODUZCA COMO
//SALIDA EL NUMERO LEIDO CON EL MENSAJE "ES POSITIVO" O "ES NEGATIVO"
//SEGUN EL CASO.

Algoritmo DosSegundaParte
	
	Definir entero1 Como Entero;
	
	Escribir "ingresar el numero entero";
	leer entero1;
	
	si(entero1>0)entonces
		escribir "tu numero fue: ", entero1;
		Escribir "numero ingresado es POSITIVO";
	SiNo
		si(entero1<0)Entonces
			Escribir "tu numero fue: ", entero1;
			escribir"numero ingresado es NEGATIVO";
		SiNo
			Escribir "tu numero fue: ", entero1;
			Escribir "numero ingresado es NEUTRO";
		FinSi
	FinSi
	
FinAlgoritmo
