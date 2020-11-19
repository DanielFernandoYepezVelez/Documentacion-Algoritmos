//PROBLEMA #4.
//UNA AGENCIA AUTOMOTRIZ OFRECE PLANES DE CREDITO PARA LA ADQUISICION
//DE LOS DIFERENTES MODELOS DE AUTOMOVILES. SI EL AUTOMOVIL VALE MAS
//DE 25.000.000 LA AGENCIA SOLICITA UN 35% DE CUOTA INICIAL Y EL 
//RESTO DEBE CUBRIRSE EN 24 MENSUALIDADES SIN INTERESES. SI EL 
//AUTOMOVIL TIENE UN VALOR MAXIMO DE 25.000.000 SE REQUIERE UNA CUOTA 
//INICIAL DEL 25% Y EL RESTO SE DEBE PAGAR EN 18 MENSUALIDADES
//SIN INTERES.LA AGENCIA DESEA SABER, CON BASE EN EL PRECIO DE UN
//AUTOMOVIL EL VALOR DE LA CUOTA INICIAL Y EL VALOR DE CADA CUOTA.

Algoritmo CuatroSegundaParte
	
	Definir cuotaInicial, resto, pagoTotal, precioAutomovil como real;
	
	Escribir "cuanto cuesta el automovil?";
	leer precioAutomovil;
	
	si(precioAutomovil>25000000)entonces
		cuotaInicial<-precioAutomovil*0.35;
		resto<-precioAutomovil-cuotaInicial;
		pagoTotal<-resto/24;
		Escribir "cuota inicial: ", cuotaInicial;
		Escribir "valor cada cuota: ", pagoTotal;
	SiNo
		cuotaInicial<-precioAutomovil*0.25;
		resto<-precioAutomovil-cuotaInicial;
		pagoTotal<-resto/18;
		Escribir "cuota inicial: ", cuotaInicial;
		Escribir "valor cada cuota: ", pagoTotal;
	FinSi
	
FinAlgoritmo
