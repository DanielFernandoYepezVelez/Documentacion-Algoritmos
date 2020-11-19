//PROBLEMA #10.
//UNA EMPRESA DE BIENES RAICES OFRECE CASAS DE INTERES SOCIAL BAJO LAS SIGUIENTES CONDICIONES: SI LOS INGRESOS DEL COMPRADOR
//SON MENORES DE $8000, LA CUOTA INICIAL SERA DEL 15% DEL COSTO DE LA CASA Y EL RESTO SE DISTRIBUIRA EN PAGOS MENSUALES A PAGAR EN DIEZ
//AÑOS.SI LOS INGRESOS DEL COMPRADOR SON DE $8000 O MAS, LA CUOTA INICIAL SERA DEL 30% DEL COSTO DE LA CASA Y EL RESTO SE DISTRIBUIRA EN 
//PAGOS MENSUALES A PAGAR EN 7 AÑOS.LA EMPRESA QUIERE OBTENER CUANTO DEBE PAGAR UN COMPRADOR POR CONCEPTO DE CUOTA INICIAL Y CUANTO
//POR CADA PAGO PARCIAL O CUOTAS MENSUALES.

Algoritmo DiezSegundaParte
	
	Definir ingresos, precioCasa, cuotaInicial, resto, mesesPago, pagosMensuales como real;
	
	Escribir "Precio de la Casa";
	leer precioCasa;
	Escribir "Ingrese el Valor Economico de sus Ingresos Mensuales";
	leer ingresos;
	
	si ingresos<8000 entonces
		cuotaInicial<-precioCasa*0.15;
		resto<-precioCasa-cuotaInicial;
		mesesPago<-10*12;
		pagosMensuales<-resto/mesesPago;
		
	SiNo
		cuotaInicial<-precioCasa*0.30;
		resto<-precioCasa-cuotaInicial;
		mesesPago<-7*12;
		pagosMensuales<-resto/mesesPago;
		
	FinSi
	
	Escribir " ";
	Escribir "La cuota inicial que debe pagar del comprador es de ", cuotaInicial;
	Escribir "La cuota mensual del comprador es de ", pagosMensuales;

FinAlgoritmo
