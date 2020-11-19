//PROBLEMA #9.
//LE HAN CONTRATADO PARA ELABORAR UN PROGRAMA QUE LE PERMITE A UN PROFESOR DE POESIA Y LITERATURA MODERNA,
//SABER SI UN ESTUDIANTE APROBO O NO LA MATERIA. EL ESTUDIANTE APRUEBA SI SU NOTA ES SUPERIOR A 2.95,
//EN CASO CONTRARIO REPRUEBA.LA FORMA DE CALCULAR LA NOTA DEFINITIVA ES:

//PROMEDIO DE LOS CUATRO ENSAYOS QUE DEBEN ELABORAR * 40%
//PROMEDIO DE LAS CINCO POESIAS QUE SE ELABORAN A LO LARGO DEL CURSO * 50%
//NOTA UNICA POR LA CRITICA HECHA A LAS OBRAS ENTREGADAS * 10%

Algoritmo NueveSegundaParte
	
	definir ensayo1,ensayo2,ensayo3,ensayo4 como real;
	Definir poesia1,poesia2,poesia3,poesia4,poesia5 como real;
	definir critica como real;
	Definir promedioNotasEnsayos como real;
	Definir promedioNotasPoesias como real;
	Definir promedioTotalEnsayos Como Real;
	definir promedioTotalPoesia como real;
	Definir notaCritica como real;
	Definir notaDefinitiva como real;
	
	escribir "nota del primer ensayo";
	leer ensayo1;
	escribir "nota del segundo ensayo";
	leer ensayo2;
	escribir "nota del tercer ensayo";
	leer ensayo3;
	escribir "nota del cuarto ensayo";
	leer ensayo4;
	
	Escribir "nota de la primera poesia";
	leer poesia1;
	Escribir "nota de la segunda poesia";
	leer poesia2;
	Escribir "nota de la tercera poesia";
	leer poesia3;
	Escribir "nota de la cuarta poesia";
	leer poesia4;
	Escribir "nota de la quinta poesia";
	leer poesia5;
	
	Escribir "nota de la critica";
	leer critica;
	
	promedioNotasEnsayos<-(ensayo1+ensayo2+ensayo3+ensayo4)/4;
	promedioTotalEnsayos<-promedioNotasEnsayos*0.40;
	
	promedioNotasPoesias<-(poesia1+poesia2+poesia3+poesia4+poesia5)/5;
	promedioTotalPoesias<-promedioNotasPoesias*0.50;
	
	notaCritica<-critica*0.10;
	
	notaDefinitiva<-promedioTotalEnsayos+promedioTotalPoesias+notaCritica;
	
	si(notaDefinitiva>2.95) entonces
		Escribir "el estudiante aprobo el curso con una nota final de ", notaDefinitiva;
	SiNo
		Escribir "el estudiante reprobo el curso con una nota final de ", notaDefinitiva;
	FinSi
	
FinAlgoritmo
