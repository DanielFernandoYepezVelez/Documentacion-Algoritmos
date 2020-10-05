//PROBLEMA #5.
//ELABORE UN ALGORITMO QUE LEA DOS NUMEROS ENTEROS Y QUE PRODUZCA
//COMO SALIDA LA SUMA, RESTA, MULTIPLICACION, DIVISION Y MODULO 
//DEL PRIMERO POR EL SEGUNDO.

Algoritmo Cinco
	
	Definir numero1, numero2, suma, resta, multiplicacion, division, modulo como real;
	
	Escribir "ingresar el primer valor";
	leer numero1;
	Escribir "ingrese el segundo valor";
	leer numero2;
	
	suma<-numero1+numero2;
	resta<-numero1-numero2;
	multiplicacion<-numero1*numero2;
	division<-numero1/numero2;
	modulo<-(numero1 MOD numero2);
	
	Escribir " ";
	Escribir "la suma es: ", + suma;
	Escribir "la resta es: ", + resta;
	Escribir "la multiplicacion es: ", + multiplicacion;
	Escribir "la division es: ", + division;
	Escribir "el modulo es: ", + modulo;
	
FinAlgoritmo
