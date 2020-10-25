// PROBLEMA #2.
/// A UN TRABAJADOR LE DESCUENTAN DE SU SUELDO EL 10% SI SU SUELDO ES MENOR O IGUAL A 1.000.000; POR ENCIMA DE 1.000.000 Y HASTA 2.000.000 
/// EL 5% DEL ADICIONAL Y POR ENCIMA DE 2.000.000 EL 3% DEL ADICIONAL.CALCULAR EL DESCUENTO Y SUELDO NETO QUE RECIBE EL TRABAJADOR DADO SU 
/// SUELDO INICIAL.

Proceso DosSegundaParte
	
	Definir sueldo, descuento, resto  Como Real;
	Definir nombre como cadena;
	
	Escribir "INGRESE SU NOMBRE COMPLETO";
	leer nombre;
	Escribir "INGRESE SU SUELDO";
	leer sueldo;
	
	si (sueldo <= 1000000) Entonces
		descuento = sueldo * 0.1;
		resto = sueldo - descuento;
		
		Escribir "";
		Escribir "EL DESCUENTO DEL EMPLEADO ", nombre, "FUE DE: ", descuento;
		Escribir "EL SUELDO NETO QUE RECIBE EL EMPLEADO ", nombre, "ES DE: ", resto;
	SiNo
		si (sueldo > 1000000 Y sueldo <= 2000000) Entonces
			descuento = sueldo * 0.05;
			resto = sueldo - descuento;
			
			Escribir "";
			Escribir "EL DESCUENTO DEL EMPLEADO ", nombre, "FUE DE: ", descuento;
			Escribir "EL SUELDO NETO QUE RECIBE EL EMPLEADO ", nombre, "ES DE: ", resto;
		SiNo
			si (sueldo > 2000000) Entonces
				descuento = sueldo * 0.03;
				resto = sueldo - descuento;
				
				Escribir "";
				Escribir "EL DESCUENTO DEL EMPLEADO ", nombre, "FUE DE: ", descuento;
				Escribir "EL SUELDO NETO QUE RECIBE EL EMPLEADO ", nombre, "ES DE: ", resto;
			FinSi
		FinSi
	FinSi

FinProceso