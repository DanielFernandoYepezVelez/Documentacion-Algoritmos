// PROBLEMA #1.
/// ESCRIBIR EL ALGORITMO QUE CALCULE Y MUESTRE EL VALOR DE X, DE ACUERDO CON LO SIGUIENTE:
/// X = 0 SI Y < A y (A < B < C)
/// X = 1 SI A <= Y < B
/// X = 2 SI B <= Y < C
/// X = 3 SI C <= Y
/// X = 4 SI NO SE CUMPLE NINGUNA DE LAS ANTERIORES.

Proceso Uno
	
	definir I, A, B, C como real;
	
	Escribir "ingrese un valor para I";
	leer I;
	Escribir "ingrese un valor para A";
	leer A;
	Escribir "ingrese un valor para B";
	leer B;
	Escribir "ingrese un valor para C";
	leer C;
	
	Escribir " ";
	si (I<A Y A<B Y B<C) entonces
		Escribir "**********X=0**********";
	SiNo
		si (A<=I Y I<B) Entonces
			Escribir "*******X=1******";
		SiNo
			si (B<=I Y I<C) Entonces
				Escribir "*******X=2*******";
			SiNo
				si (C<=I) Entonces
					Escribir "*******X=3********";
				SiNo
					Escribir "como no cumple con las condiciones del ejercicio, ";
					Escribir "entonces ***********X=4*********";
				FinSi
			FinSi
		FinSi
	FinSi

FinProceso
