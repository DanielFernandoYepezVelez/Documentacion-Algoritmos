// PROBLEMA #4.
/// ESCRIBA UN ALGORITMO QUE LEA EL NOMBRE DE UN TRABAJADOR, LAS VENTAS Y EL CODIGO DE LA ZONA DE TRABAJO, Y QUE MUESTRE:
/// EL VALOR A PAGAR POR COMISION; Y EL TOTAL A PAGAR. PARA ELLO, TENGA EN CUENTA LA SIGUIENTE TABLA. TABLA PARA EL
/// CALCULO DE LA COMISION.
///  ZONA.    % COMISION.
///   1          7
///   2          9
///   3         12
///   4         14

Proceso Cuatro
	
	definir nombre como cadena;
	definir ventas, codigo, valorPagoComision, pagoTotal como real;
	
	Escribir "INGRESE SU NOMBRE";
	leer nombre;
	Escribir "INGRESE LAS VENTAS REALIZADAS";
	leer ventas;
	Escribir " ";
	Escribir "RECUERDE QUE EL CODIGO ES DE 1 A 4";
	Escribir "INGRESE EL CODIGO EN LA ZONA DE TRABAJO";
	leer codigo;
	
	si (codigo=1) Entonces
		valorPagoComision<-ventas*0.07;
		pagoTotal<-ventas+valorPagoComision;
		Escribir " ";
		Escribir "LA COMISION A PAGAR ES DE: ", valorPagoComision;
		Escribir "EL PAGO TOTAL AL TRABAJDOR ES DE: $",pagoTotal;
		
	SiNo
		si (codigo=2) entonces
			valorPagoComision<-ventas*0.09;
			pagoTotal<-ventas+valorPagoComision;
			Escribir " ";
			Escribir "LA COMISION A PAGAR ES DE: ", valorPagoComision;
			Escribir "EL PAGO TOTAL AL TRABAJDOR ES DE: $",pagoTotal;
			
		SiNo
			si (codigo=3) Entonces
				valorPagoComision<-ventas*0.12;
				pagoTotal<-ventas+valorPagoComision;
				Escribir " ";
				Escribir "LA COMISION A PAGAR ES DE: ", valorPagoComision;
				Escribir "EL PAGO TOTAL AL TRABAJDOR ES DE: $",pagoTotal;
				
			SiNo
				si (codigo=4) Entonces
					valorPagoComision<-ventas*0.14;
					pagoTotal<-ventas+valorPagoComision;
					Escribir " ";
					Escribir "LA COMISION A PAGAR ES DE: ", valorPagoComision;
					Escribir "EL PAGO TOTAL AL TRABAJDOR ES DE: $",pagoTotal;
					
				SiNo
					Escribir "EL NUMERO INGRESADO NO HACE PARTE DEL CODIGO DE ZONA";
				FinSi
			FinSi
		FinSi
	FinSi

FinProceso
