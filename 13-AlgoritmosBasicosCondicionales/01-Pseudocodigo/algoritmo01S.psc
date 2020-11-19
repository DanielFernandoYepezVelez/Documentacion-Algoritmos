//PROBLEMA #1.
//ELABORE UN ALGORITMO QUE LEA UN NUMERO ENTERO Y QUE DETERMINE E 
//IMPRIMA EL MENSAJE APROPIADO SI EL NUMERO LEIDO ES IMPAR Y MENOR QUE
//100.

Algoritmo UnoSegundaParte
	
	definir numero1 Como Entero;
	
	Escribir "ingrese un numero entero";
	leer numero1;
	
	si(numero1 MOD 2!=0 y numero1<100)Entonces
		Escribir "el numero ingresado es impar y menor a 100";
	SiNo
		
	FinSi
	
FinAlgoritmo
