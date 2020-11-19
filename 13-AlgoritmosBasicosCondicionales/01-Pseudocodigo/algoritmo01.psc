//PROBLEMA #1.
//ELABORE UN ALGORITMO QUE LEA UN NUMERO ENTERO Y QUE PRODUZCA EL 
//MENSAJE ACERCA DE SI EL ENTERO LEIDO ES PAR O IMPAR.

Algoritmo Uno
	
	Definir numeroUnico Como Entero;
	
	Escribir "ingresar un numero entero";
	leer numeroUnico;
	
	si(numeroUnico MOD 2=0)entonces
		Escribir "el numero ingresado es par";
	SiNo
		Escribir "el numero ingresado es impar";
	FinSi
	
FinAlgoritmo
