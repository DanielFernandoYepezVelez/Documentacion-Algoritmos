//PROBLEMA #13.
//ESCRIBA UN ALGORITMO QUE LEA DOS NUMEROS ENTEROS Y QUE VERIFIQUE SI EL PRIMERO ES DIVISIBLE POR EL SEGUNDO.
//EJEMPLO:
//AL INGRESAR 36 Y 4, DEBE SALIR POR PANTALLA "36 ES DIVISIBLE POR 4".

Proceso TreceSegundaParte
	
	definir numero1, numero2 como real;
	
	Escribir "ingresar el primer digito";
	leer numero1;
	Escribir "ingresar segundo digito";
	leer numero2;
	
	si (numero1 MOD numero2=0) entonces
		Escribir "el numero ", numero1, " es divisible entre el numero ", numero2;
	sino 
		Escribir "el numero ", numero1, " no es divisible entre el numero ", numero2;
	FinSi
	
FinProceso
