//PROBLEMA #11.
//EN UNA PANADERIA SE HACE UN DESCUENTO DEL 20% A LOS CLIENTES CUYA COMPRA SUPERE LOS $10.000.
//¿CUAL SERA LA CANTIDAD QUE DEBE PAGAR UNA PERSONA POR SU COMPRA?

Algoritmo OnceSegundaParte
	
	Definir compra, descuento, cantidadPago como real;
	
	Escribir "valor de la compra";
	leer compra;
	
	si compra>10000 entonces
		descuento<-compra*0.20;
		cantidadPago<-compra-descuento;
	SiNo
		cantidadPago<-compra;
		
	FinSi
	
	Escribir " ";
	Escribir "el valor a pagar es de ", cantidadPago;
	
FinAlgoritmo
