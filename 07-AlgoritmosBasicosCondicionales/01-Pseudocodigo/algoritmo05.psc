// PROBLEMA #5.
/// UNA EMPRESA ALQUILA AUTOS DE TRES CLASES:PEQUE�OS, MEDIANOS Y GRANDES. LA TARIFA DEL ALQUILER POR DIA ES:
/// $50.000 EN EL AUTO PEQUE�O; $80.000 EN EL AUTO MEDIANO Y $110.000 EN EL AUTO GRANDE.ADEMAS, LA EMPRESA COBRA $1.500/KM 
/// RECORRIDO EN EL AUTO PEQUE�O, $2.300/KM RECORRIDO EN EL AUTO MEDIANO Y $2.600 EN EL AUTO GRANDE. SI LA CANTIDAD DE KM RECORRIDOS
/// POR EL AUTO SUPERA LOS 50 KM, SE LE AUMENTARA UN 2.5% SOBRE EL MONTO A PAGAR POR EL CLIENTE. ELABORE UN ALGORITMO QUE GENERE EL 
/// SIGUIENTE REPORTE:
/// TAMA�O DEL AUTO ALQUILADO:   XXX
/// TARIFA POR DIA:             $$$
/// KILOMETROS RECORRIDOS:      XXX
/// VALOR A PAGAR:             $$$

Proceso Cinco
	
	Definir tamano como cadena;
	definir tarifaDia, diasUso, kilometros, valorPago, total, aumento, pagoFinal como real;
	
	Escribir "INGRESE EL TAMA�O DEL AUTO QUE ALQUILO";
	leer tamano;
	Escribir "CUANTOS DIAS UTILIZO EL AUTOMOVIL";
	Leer diasUso;
	Escribir "INGRESE EL NUMERO DE KM RECORRIDOS";
	leer kilometros;
	
	si (tamano="peque�o" O tamano="PEQUE�O") Entonces
		tarifaDia<-50000*diasUso;
		valorPago<-kilometros*1500;
		total<-tarifaDia+valorPago;
		
		si (kilometros>50) entonces
			aumento<-total*0.025;
			pagoFinal<-total+aumento;
			
			Escribir " ";
			Escribir "TAMA�O DEL AUTO ALQUILADO: ", tamano;
			Escribir "TARIFA POR DIA: ", tarifaDia;
			Escribir "KILOMETROS RECORRIDOS: ", kilometros;
			Escribir "VALOR A PAGAR: ", pagoFinal;
			
		SiNo
			Escribir " ";
			Escribir "TAMA�O DEL AUTO ALQUILADO: ", tamano;
			Escribir "TARIFA POR DIA: ", tarifaDia;
			Escribir "KILOMETROS RECORRIDOS: ", kilometros;
			Escribir "VALOR A PAGAR: ", total;
		FinSi
		
	SiNo
		si (tamano="mediano" O tamano="MEDIANO") Entonces
			tarifaDia<-80000*diasUso;
			valorPago<-kilometros*2300;
			total<-tarifaDia+valorPago;
			
			si (kilometros>50) entonces
				aumento<-total*0.025;
				pagoFinal<-total+aumento;
				
				Escribir " ";
				Escribir "TAMA�O DEL AUTO ALQUILADO: ", tamano;
				Escribir "TARIFA POR DIA: ", tarifaDia;
				Escribir "KILOMETROS RECORRIDOS: ", kilometros;
				Escribir "VALOR A PAGAR: ", pagoFinal;
				
			SiNo
				Escribir " ";
				Escribir "TAMA�O DEL AUTO ALQUILADO: ", tamano;
				Escribir "TARIFA POR DIA: ", tarifaDia;
				Escribir "KILOMETROS RECORRIDOS: ", kilometros;
				Escribir "VALOR A PAGAR: ", total;
			FinSi
			
		SiNo
			si (tamano="grande" O tamano="GRANDE") Entonces
				tarifaDia<-110000*diasUso;
				valorPago<-kilometros*2600;
				total<-tarifaDia+valorPago;
				
				si (kilometros>50) entonces
					aumento<-total*0.025;
					pagoFinal<-total+aumento;
					
					Escribir " ";
					Escribir "TAMA�O DEL AUTO ALQUILADO: ", tamano;
					Escribir "TARIFA POR DIA: ", tarifaDia;
					Escribir "KILOMETROS RECORRIDOS: ", kilometros;
					Escribir "VALOR A PAGAR: ", pagoFinal;
					
				SiNo
					Escribir " ";
					Escribir "TAMA�O DEL AUTO ALQUILADO: ", tamano;
					Escribir "TARIFA POR DIA: ", tarifaDia;
					Escribir "KILOMETROS RECORRIDOS: ", kilometros;
					Escribir "VALOR A PAGAR: ", total;
				FinSi
				
			SiNo
				Escribir "EL TAMA�O INGRESADO NO ES EL ADECUADO";
			FinSi
		FinSi
	FinSi
	
FinProceso
