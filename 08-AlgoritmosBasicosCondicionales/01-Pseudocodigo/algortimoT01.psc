// PROBLEMA #1.
/// UNA TIENDA OFRECE MEMORIAS USB CON DESCUENTO,SEGUN LA CANTIDAD QUE SE ADQUIERA,DE ACUERDO CON LA SIGUIENTE TABLA:
/// CANTIDAD DE MEMORIAS USB            DESCUENTO
/// 1-3                                    5%
/// 4-10                                   10%
/// 11 EN ADELANTE                         15%
/// CALCULAR CUANTO DEBE PAGAR POR LAS MEMORIAS Y CUANTO ES EL AHORRO O DESCUENTO TOTAL APLICADO.

Proceso UnoCondicionalAnidado
	
	Definir cantidad, pagoMemoria, pagoTotal, descuento como real;
	
	Escribir "ingrese la cantidad de memorias que va llevar";
	leer cantidad;
	Escribir "precio por unidad del producto";
	leer pagoMemoria;
	
	si (cantidad>=1 y cantidad<=3) entonces
		pagoTotal<-cantidad*pagoMemoria;
		descuento<-pagoTotal*0.05;
		
		Escribir " ";
		Escribir "EL PAGO TOTAL ES: ", pagoTotal, " pesos";
		Escribir "EL DECUENTO APLICADO FUE DE: ", descuento, " pesos";
	SiNo
		si (cantidad>=4 y cantidad<=10) entonces
			pagoTotal<-cantidad*pagoMemoria;
			descuento<-pagoTotal*0.10;
			
			Escribir " ";
			Escribir "EL PAGO TOTAL ES: ", pagoTotal, " pesos";
			Escribir "EL DECUENTO APLICADO FUE DE: ", descuento, " pesos";
		SiNo
			si (cantidad>=11) entonces
				pagoTotal<-cantidad*pagoMemoria;
				descuento<-pagoTotal*0.05;
				
				Escribir " ";
				Escribir "EL PAGO TOTAL ES: ", pagoTotal, " pesos";
				Escribir "EL DECUENTO APLICADO FUE DE: ", descuento, " pesos";
			FinSi
		FinSi
	FinSi

FinProceso
