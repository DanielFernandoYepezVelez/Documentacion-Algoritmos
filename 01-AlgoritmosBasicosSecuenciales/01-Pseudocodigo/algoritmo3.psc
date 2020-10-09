// PROBLEMA #3.
/// ELABORE UN ALGORITMO QUE LEA DOS DATOS ENTEROS CORRESPONDIENTES
/// A LOS CATETOS DE UN TRIANGULO Y QUE CALCULE E IMPRIMA EL VALOR DE 
/// LA HIPOTENUSA DE DICHO TRIANGULO.

Algoritmo Tres
	
	Definir cateto1, cateto2, hipotenusa como real;

	Escribir "ingrese el valor del cateto 1";
	leer cateto1;
	Escribir "ingrese el valor del cateto 2";
	leer cateto2;
	
	hipotenusa = rc(((cateto1)^2) + ((cateto2)^2));
	
	Escribir "el valor de la hipotenusa es de: ", hipotenusa;
	
FinAlgoritmo
