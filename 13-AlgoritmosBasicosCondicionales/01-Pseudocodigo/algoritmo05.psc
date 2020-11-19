 //PROBLEMA #5.
//ELABORE UN ALGORITMO QUE LEA TRES ENTEROS POSITIVOS Y QUE DETERMINE
//SI PUEDEN FORMAR TRIANGULO O NO. SI PUEDEN FORMAR TRIANGULO DEBE
//IMPRIMIR QUE CLASE DE TRIANGULO ES: EQUILATERO, ISOSCELES O 
//ESCALENO. TRES ENTEROS FORMA TRIANGULO SI CADA UNO DE ELLOS ES 
//MENOR QUE LA SUMA DE LOS OTROS DOS.

Algoritmo Cinco
	
	Definir entero1, entero2, entero3 Como Real;
	definir triangulo, equilatero, isosceles, escaleno como logico;
	
	Escribir "ingrese un numero positivo";
	leer entero1;
	Escribir "ingrese otro numero positivo";
	leer entero2;
	Escribir "ingrese el tercer numero positivo";
	leer entero3;
	
	triangulo<-(entero1<(entero2+entero3) y entero2<(entero1+entero3) y entero3<(entero1+entero2));
	equilatero<-(entero1=entero2 y entero1=entero3 y entero2=entero3);
	isosceles<-(entero1=entero2 o entero1=entero3 o entero2=entero3);
	escaleno<-(entero1!=entero2 y entero1!=entero3 y entero2!=entero3);
	
	escribir " ";
	si(triangulo y equilatero)Entonces
		Escribir "los numeros si pueden formar triangulo";
		Escribir "el triangulo formado es EQUILATERO";
	SiNo
		si(triangulo y isosceles)Entonces
			Escribir "los numeros si pueden formar triangulo";
			Escribir "el triangulo formado es ISOSCELES";
		SiNo
			si(triangulo y escaleno)Entonces
			  Escribir "los numeros si pueden formar triangulo";
			  Escribir "el triangulo formado es ESCALENO";
		  SiNo
			  Escribir "triangulo no se puede formar";
			FinSi
		FinSi
    FinSi
	
FinAlgoritmo
