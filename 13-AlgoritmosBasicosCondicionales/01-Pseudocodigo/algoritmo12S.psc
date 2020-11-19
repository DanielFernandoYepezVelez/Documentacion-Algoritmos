//PROBLEMA #12.
//CONSULTE EN LA FUENTE QUE PREFIERA LA MANERA DE SABER LA CANTIDAD DE CIFRAS QUE TIENE UN NUMERO CUALQUIERA 
//(EL 7 ES DE UNA CIFRA, EL 23 DE DOS CIFRAS, EL 231 ES DE TRES CIFRAS, ETC.) LUEGO, ESCRIBA UN ALGORITMO QUE UNA VEZ LEIDA UNA CANTIDAD
//NUMERICA, DIGA LA CANTIDAD DE CIFRAS QUE TIENE. MAXIMO HASTA CINCO CIFRAS, ES DECIR, ENTRE 0 Y 99999.

Algoritmo DoceSegundaParte
	
	Definir cifrasNumero Como Real;
	
	Escribir "ingrese un numero ENTERO de una o varias cifras, maximo 5";
	leer cifrasNumero;
	
	si cifrasNumero>=1 y cifrasNumero<=9 entonces
		escribir "el numero ingresado es de UNA CIFRA";
	SiNo
		si cifrasNumero>=10 y cifrasNumero<=99 entonces
			Escribir "el numero ingresado es de DOS CIFRAS";
		SiNo
			si cifrasNumero>=100 y cifrasNumero<=999 Entonces
				Escribir "el numero ingresado es de TRES CIFRAS";
			SiNo
				si cifrasNumero>=1000 y cifrasNumero<=9999 Entonces
					Escribir "el numero ingresado es de CUATRO CIFRAS";
				SiNo
					si cifrasNumero>=10000 y cifrasNumero<=99999 Entonces
						Escribir "el numero ingresado es de CINCO CIFRAS";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	si cifrasNumero<=-1 y cifrasNumero>=-9 entonces
		escribir "el numero ingresado es de UNA CIFRA";
	SiNo
		si cifrasNumero<=-10 y cifrasNumero>=-99 entonces
			Escribir "el numero ingresado es de DOS CIFRAS";
		SiNo
			si cifrasNumero<=-100 y cifrasNumero>=-999 Entonces
				Escribir "el numero ingresado es de TRES CIFRAS";
			SiNo
				si cifrasNumero<=-1000 y cifrasNumero>=-9999 Entonces
					Escribir "el numero ingresado es de CUATRO CIFRAS";
				SiNo
					si cifrasNumero<=-10000 y cifrasNumero>=-99999 Entonces
						Escribir "el numero ingresado es de CINCO CIFRAS";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	si cifrasNumero=0 entonces
		Escribir "este numero es de UNA CIFRA Y SE CONOCE COMO EL ORIGEN";
	FinSi
	
FinAlgoritmo
