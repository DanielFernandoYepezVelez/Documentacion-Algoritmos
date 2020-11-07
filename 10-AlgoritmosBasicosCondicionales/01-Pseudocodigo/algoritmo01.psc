// PROBLEMA #1.
/// LA AGENCIA DE VIAJES PAPELUCHO, OFRECE PLANES DE CREDITO PARA LA ADQUISICION DE LOS DIFERENTES PLANES DE VIAJES QUE REALIZAN
/// ALREDEDOR DEL MUNDO. SI EL VIAJE VALE MAS DE 35,000.000 LA AGENCIA SOLICITA UN 50% DE CUOTA INICIAL Y EL RESTO DEBE CUBIRSE EN
/// 12 MENSUALIDADES SIN INTERESES. SI EL PLAN DE VIAJE TIENE UN VALOR MAXIMO DE 35,000.000 EL RESTO SE DEBE PAGAR EN 10 
/// MENSUALIDADES SIN INTERESES.
/// LA AGENCIA DESEA SABER, EN BASE AL PRECIO DE UN VIAJE QUE UN DETERMINADO CLIENTE ELIJA, CUAL ES EL MONTO DE LA CUOTA INICIAL
/// Y CUAL ES EL NUMERO Y EL MONTO DE LAS MENSUALIDADES QUE ESTE DEBE CUBRIR.

Proceso UnoITM
	
	Definir PrecioUsuario, cuotaInicial, resto, contador, cuotas como real;
	Definir cuotasTexto como cadena;
	
	contador = 0;
	
	Escribir "SEÑOR USUARIO INGRESE EL PRECIO TOTAL DEL VIAJE QUE USTED DESEA REALIZAR";
	leer PrecioUsuario;
	
	si (PrecioUsuario > 35000000) Entonces
		
		cuotaInicia = PrecioUsuario * 0.5;
		resto = (PrecioUsuario - cuotaInicial) / 12;
		cuotas = 12;
		cuotasTexto = "Doce Cuotas Mensuales";
	SiNo
		si (PrecioUsuario <= 35000000) entonces
			
			cuotaInicial = PrecioUsuario * 0.5;
			resto = (PrecioUsuario - cuotaInicial) / 10;
			cuotas = 10;
			cuotasTexto = "Diez Cuotas Mensuales";
		FinSi
	FinSi
	
	Escribir " ";
	Escribir "LA CUOTA INICIAL QUE EL USUARIO DEBE DAR ES DE: ",cuotaInicial;
	Escribir "LAS CUOTAS MENSUALES QUE EL USUARIO DEBE DAR SON DE: ",resto;
	Escribir "EL NUMERO DE CUOTAS QUE EL USUARIO DEBE PAGAR SON: ",cuotas," (",cuotasTexto,")";
	
FinProceso