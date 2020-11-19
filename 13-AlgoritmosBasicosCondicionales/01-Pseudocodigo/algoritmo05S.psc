//PROBLEMA #5.
//ESCRIBA UN PROGRAMA QUE, AL RECIBIR COMO DATO EL PRECIO DE UN 
//PRODUCTO, INCREMENTE 11% DEL MISMO, SI ES INFERIOR A 150.000 Y QUE
//ADEMAS ESCRIBA EL NUEVO PRECIO DEL PRODUCTO.

Algoritmo CincoSegundaParte
	
	Definir precio, incremento, nuevoPrecio como real;
	
	Escribir "precio del producto?";
	leer precio;
	
	si(precio<150000) entonces
		
		incremento<-precio*0.11;
		nuevoPrecio<-precio+incremento;
		
		Escribir "el nuevo precio del producto es: ", nuevoPrecio;
		
	FinSi
	
FinAlgoritmo
