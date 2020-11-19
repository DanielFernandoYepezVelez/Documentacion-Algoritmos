//PROBLEMA #16.
//EN UN ALMACEN SE EFECTUA UNA PROMOCION EN LA CUAL SE HACE UN DESCUENTO SOBRE EL VALOR DE LA COMPRA TOTAL
//SEGUN EL COLOR DE LA BOLITA QUE EL CLIENTE SAQUE EN EL MOMENTO DE PAGAR EN LA CAJA.SI LA BOLITA ES DE COLOR BLANCO;
//NO SE HARA DESCUENTO, SI ES DE COLOR VERDE, SE LE HARA UN DESCUENTO DEL 10%, SI ES AMARILLA UN 25%, SI ES AZUL UN
//50% Y SI ES ROJA UN 100%. DETERMINAR LA CANTIDAD FINAL QUE EL CLIENTE DEBERA PAGAR POR SU COMPRA. SOLO HAY BOLITAS
//DE LOS COLORES MENCIONADOS.

Proceso DieciseisSegundaParte
	
	definir descuento, valorCompra, cantidadFinal como real;
	definir colorBolita como cadena;
	
	Escribir "ingresar el valor total de la compra";
	leer valorCompra;
	Escribir "ingrese el color de la bolita que saco";
	leer colorBolita;
	
	si (colorBolita="blanca" O colorBolita="BLANCA") Entonces
		Escribir " ";
		Escribir "la cantidad final es ", valorCompra;
	SiNo
		si (colorBolita="verde" O colorBolita="VERDE") Entonces
			descuento<-valorCompra*0.10;
			cantidadFinal<-valorCompra-descuento;
			Escribir " ";
			Escribir "la cantidad final a pagar es de ", cantidadFinal;
		SiNo
			si (colorBolita="amarilla" O colorBolita="AMARILLA") Entonces
				descuento<-valorCompra*0.25;
				cantidadFinal<-valorCompra-descuento;
				Escribir " ";
				Escribir "la cantidad final a pagar es de ", cantidadFinal;
			sino 
				si (colorBolita="azul" O colorBolita="AZUL") Entonces
					descuento<-valorCompra*0.50;
					cantidadFinal<-valorCompra-descuento;
					Escribir " ";
					Escribir "la cantidad final a pagar es de ", cantidadFinal;
				SiNo
					si (colorBolita="roja" O colorBolita="ROJA") Entonces
						descuento<-valorCompra;
						cantidadFinal<-valorCompra-descuento;
						Escribir " ";
						Escribir "la cantidad final a pagar es de ", cantidadFinal;
				    FinSi
			    FinSi
		    FinSi
	    FinSi
    FinSi

FinProceso
