//PROBLEMA #14.
//ESCRIBIR UN ALGORITMO QUE CALCULE EL TOTAL A PAGAR POR LA COMPRA DE CAMISAS.SI SE COMPRAN TRES CAMISAS O MAS
//SE APLICA UN DESCUENTO DEL 20% SOBRE EL TOTAL DE LA COMPRA; Y SI SON MENOS DE TRES CAMISAS, UN DESCUENTO DEL 10%.

Proceso CatorceSegundaParte
	
	definir numeroCamisas, descuento, valorCompra, totalCompra como real;
	
	Escribir "cuantas camisas compro?";
	leer numeroCamisas;
	Escribir "valor de la compra";
	leer valorCompra;
	
	si numeroCamisas>=3 entonces
		descuento<-valorCompra*0.2;
		totalCompra<-valorCompra-descuento;
		
		Escribir "el descuento de la compra es ", descuento;
		Escribir "el pago total de la compra es ", totalCompra;
	SiNo
		
		descuento<-valorCompra*0.1;
		totalCompra<-valorCompra-descuento;
		
		Escribir "el descuento de la compra es ", descuento;
		Escribir "el pago total de la compra es ", totalCompra;
	FinSi
	
FinProceso
