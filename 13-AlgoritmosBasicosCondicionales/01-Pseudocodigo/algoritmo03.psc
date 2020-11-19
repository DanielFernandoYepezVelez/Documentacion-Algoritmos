//PROBLEMA #3.
//ELABORE UN ALGORITMO QUE LEA TRES DATOS NUMERICOS ENTEROS Y QUE
//DETERMINE SI CON ESOS TRES DATOS SE PUEDE CONSTRUIR UN TRIANGULO
//EQUILATERO. SU ALGORITMO DEBE IMPRIMIR: SI SE PUEDE O NO SE PUEDE.

Algoritmo Tres
	
	Definir entero1, entero2, entero3 Como Entero;
	
	Escribir "ingrese el primer numero";
	leer entero1;
	Escribir "ingrese el segundo numero";
	leer entero2;
	Escribir "ingrese el tercer numero";
	leer entero3;
	
	si(entero1=entero2 y entero1=entero3 y entero2=entero3)Entonces
		Escribir "si se puede";
	SiNo
		Escribir "no se puede";
	FinSi
	
FinAlgoritmo
