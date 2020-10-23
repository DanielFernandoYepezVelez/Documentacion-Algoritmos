// PROBLEMA #1.
/// UNA TIENDA OFRECE DESCUENTOS DEL 15% POR PAGO EN EFECTIVO EN LA COMPRA DE 
/// SUS PRODUCTOS Y 5% SI LA COMPRA ES CON TARJETA DEBITO
/// O CREDITO. DETERMINE EL VALOR DEL DESCUENTO Y EL PRECIO FINAL DEL ARTICULO.

Proceso UnoSegundaParte
	
	Definir precioArticulo, descuento, precioFinal como real;
	Definir formaPago como cadena;
	
	Escribir "ingresar el precio del articulo";
	leer precioArticulo;
	Escribir "lo pago en efectivo o con tarjeta";
	leer formaPago;
	
	si (formaPago="efectivo" O formaPago="EFECTIVO") Entonces
		
		descuento<-precioArticulo*0.15;
		precioFinal<-precioArticulo-descuento;
		
		Escribir " ";
		Escribir "valor del descuento: ", descuento;
		Escribir "precio final del articulo:", precioFinal;
	SiNo
		si (formaPago="TARJETA DE CREDITO" O formaPago="tarjeta de credito" O formaPago="TARJETA DE DEBITO" O formaPago="tarjeta de debito") Entonces
			
			descuento<-precioArticulo*0.05;
			precioFinal<-precioArticulo-descuento;
			
			Escribir " ";
			Escribir "valor del descuento: ", descuento;
			Escribir "precio final del articulo:", precioFinal;
		FinSi
	FinSi
	
FinProceso
