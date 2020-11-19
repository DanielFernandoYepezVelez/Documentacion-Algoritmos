//PROBLEMA #4.
//ELABORE UN ALGORITMO QUE LEA DOS NUMEROS ENTEROS, EFECTUE EL PRODUCTO
//Y LA SUMA DE ELLOS Y LUEGO IMPRIMA EL RESULTADO MAYOR ENTRE LA SUMA 
//Y EL PRODUCTO, CON UN MENSAJE APROPIADO.

Algoritmo Cuatro
	
	definir numero1, numero2, suma, producto como entero;
	
	Escribir "ingrese un numero entero";
	leer numero1;
	Escribir "ingrese un segundo numero entero";
	leer numero2;
	
	suma<-numero1+numero2;
	producto<-numero1*numero2;
	
	si(producto>suma)entonces
		escribir "resultado: ", producto;
		Escribir "el producto es mayor que la suma";
	SiNo
		Escribir "resultado: ", suma;
		Escribir "la suma es mayor que el producto";
	FinSi
	
FinAlgoritmo
