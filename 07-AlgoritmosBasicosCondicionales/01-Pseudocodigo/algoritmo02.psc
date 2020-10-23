// PROBLEMA #2.
/// USANDO LA SIGUIENTE TABLA, ESCRIBA UN ALGORITMO QUE LEA EL CODIGO Y LA CANTIDAD DE UN PRODUCTO.LUEGO, IMPRIMA EL VALOR A
/// PAGAR. CODIGO     DESCRIPCION       PRECIO:
///          1.        PAPITAS          4.00
///          2.        SALSICHA         4.50
///          3.        MAICITOS         5.00
///          4.       CEREALES          2.00
///          5.       QUESITO           1.50

/// LA SALIDA DEBE MOSTRAR EL MENSAJE "TOTAL: $" SEGUIDO POR EL VALOR A PAGAR.
/// EJEMPLO DE ENTRADA               EJEMPLO DE SALIDA
/// 32                               $ 10.00
/// 43                               $  6.00
/// 23                               $ 13.50

Proceso Dos
	
	Definir codigo, cantidad, total como real;
	Definir producto como cadena;
	
    Escribir "CODIGO     DESCRIPCION       PRECIO:";
    Escribir   "1.        PAPITAS          4.00";
    escribir   "2.        SALSICHAS        4.50";
    escribir   "3.        MAICITOS         5.00";
    escribir   "4.       CEREALES          2.00";
		Escribir   "5.       QUESITOS          1.50";
	
	Escribir " ";
	Escribir "INGRESE EL CODIGO DEL PRODUCTO QUE DESEA COMPRAR";
	leer codigo;
	
	si (codigo==1) Entonces
		producto<-"PAPITAS";
	SiNo
		si (codigo==2) Entonces
			producto<-"SALSICHAS";
		SiNo
			si (codigo==3) entonces
				producto<-"MAICITOS";
			SiNo
				si (codigo==4) entonces
					producto<-"CEREALES";
				SiNo
					si (codigo==5) Entonces
						producto<-"QUESITOS";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	Escribir "INGRESE LA CANTIDAD DE ", producto, " QUE DESEA LLEVAR";
	leer cantidad;
	
	si (codigo==1) Entonces
		total<-cantidad*4;
		Escribir "TOTAL A PAGAR: ", "$",total;
	SiNo
		si (codigo==2) Entonces
			total<-cantidad*4.5;
			Escribir "TOTAL A PAGAR: ", "$",total;
		SiNo
			si (codigo==3) entonces
				total<-cantidad*5;
				Escribir "TOTAL A PAGAR: ", "$",total;
			SiNo
				si (codigo==4) entonces
					total<-cantidad*2;
					Escribir "TOTAL A PAGAR: ", "$",total;
				SiNo
					si (codigo==5) Entonces
						total<-cantidad*1.5;
						Escribir "TOTAL A PAGAR: ", "$",total;
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinProceso
