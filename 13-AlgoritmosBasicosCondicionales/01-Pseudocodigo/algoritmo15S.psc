//PROBLEMA #15.
//CALCULAR EL NUMERO DE PULSACIONES QUE DEBE TENER UNA PERSONA POR CADA 10 SEGUNDOS DE EJERCICIO AEROBICO;
//LA FORMULA QUE SE APLICA DEPENDE DEL GENERO DE LA PERSONA, ASI:
//NUMERO DE PULSACIONES=(220-EDAD)/10 CUANDO ES MUJER.
//NUMERO DEL PULSACIONES=(210-EDAD)/10 CUANDO ES HOMBRE.

Proceso QuinceSegundaParte
	
	Definir genero como cadena;
	definir edad, pulsaciones como real;
	
	Escribir "ingresar el genero";
	leer genero;
	Escribir "ingresa tu edad";
	leer edad;
	
	si (genero="f" O genero="F") entonces
		pulsaciones<-(220-edad)/10;
		Escribir " ";
		Escribir "el numero de pulsaciones de la mujer es ", pulsaciones;
	sino 
		si (genero="m" O genero="M") entonces 
			pulsaciones<-(210-edad)/10;
			Escribir " ";
			Escribir "el numero de pulsaciones del hombres es ", pulsaciones;
		sino 
			Escribir " ";
			Escribir "salga primero del closed y despues viene y escoge su genero";
		FinSi
	FinSi
	
FinProceso
