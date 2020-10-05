//PROBLEMA #8.
//TRES PERSONAS DECIDEN INVERTIR SU DINERO PARA FUNDAR UNA EMPRESA
//CADA UNA DE ELLAS INVIERTE UNA CANTIDAD DISTINTA.OBTENER EL 
// PORCENTAJE QUE CADA QUIEN INVIERTE CON RESPECTO A LA CANTIDAD TOTAL 
//INVERTIDA.

Algoritmo OchoSegundaParte
	
	definir cantidad1, cantidad2, cantidad3, cantidadTotal, porcentaje1, porcentaje2, porcentaje3 como real;
	
	Escribir "ingresar la cantidad 1";
	Leer cantidad1;
	Escribir "ingresar la cantidad 2";
	leer cantidad2;
	Escribir "ingresar la cantidad 3";
	leer cantidad3;
	
	cantidadTotal<-cantidad1 + cantidad2 + cantidad3;
	porcentaje1<-(cantidad1*100)/cantidadTotal;
	porcentaje2<-(cantidad2*100)/cantidadTotal;
	porcentaje3<-(cantidad3*100)/cantidadTotal;
	
	Escribir "el porcentaje 1 fue: ", porcentaje1, " %";
	Escribir "el porcentaje 2 fue: ", porcentaje2, " %";
	Escribir "el porcentaje 3 fue: ", porcentaje3, " %";
	
FinAlgoritmo
