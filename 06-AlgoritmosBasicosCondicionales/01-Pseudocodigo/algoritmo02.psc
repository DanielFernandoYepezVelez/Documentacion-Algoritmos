// PROBLEMA #2.
/// CIERTA UNIVERSIDAD PARA LIQUIDAR EL PAGO DE MATRICULA DE UN ESTUDIANTE LE EXIGE LOS SIGUIENTES DATOS:
/// NUMERO DE INSCRIPCION
/// NOMBRES.
/// PATRIMONIO.
/// ESTRATO SOCIAL.

/// LA UNIVERSIDAD COBRA UN VALOR CONSTANTE PARA CADA ESTUDIANTE DE $50.000. SI EL PATRIMONIO ES MAYOR QUE
/// 2.000.000 Y EL ESTRATO SUPERIOR A 3, SE LE INCREMENTA UN PORCENTAJE DEL 3% SOBRE EL PATRIMONIO.
/// HACER UN ALGORITMO QUE MUESTRE:
/// NUMERO DE INSCRIPCION.
/// NOMBRES.
/// PAGO DE MATRICULA.

Proceso Dos
	
	Definir numeroInscripcion, patrimonio, estratoSocial, valorConstante, incremento Como Real;
	Definir pagoMatricula, pagoTotal como real;
	Definir nombres como cadena;
	
	valorConstante = 50000;
	
	Escribir "ingrese su nombre completo";
	leer nombres;
	Escribir "ingrese su numero de inscripcion";
	leer numeroInscripcion;
	Escribir "ingrese el valor del pago de su matricula";
	leer pagoMatricula;
	Escribir "ingrese su patrimonio o el de su familia";
	leer patrimonio;
	Escribir "ingrese su estrato social";
	leer estratoSocial;
	
	pagoMatricula<-pagoMatricula+valorConstante;
	
	si (patrimonio > 2000000 y estratoSocial > 3) Entonces
		incremento = patrimonio * 0.03;
		pagoTotal = pagoMatricula + incremento + valorConstante;
		
		Escribir " ";
		Escribir "el numero de inscripcion del estudiante ", nombres, " es ", numeroInscripcion;
		Escribir "el nuevo valor que debe pagar el estudiante es de ", pagoTotal;
	SiNo
		
		Escribir " ";
		Escribir "el numero de inscripcion del estudiante ", nombres, " es ", numeroInscripcion;
		Escribir "el valor que debe pagar el estudiante es de ", pagoMatricula;	
	FinSi
	
FinProceso
