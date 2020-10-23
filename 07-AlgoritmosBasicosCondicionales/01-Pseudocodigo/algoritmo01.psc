// PROBLEMA #1.
/// ESCRIBA UN ALGORITMO EN PSEUDOCODIGO QUE LEA UN NUMERO REAL E IMPRIMIR UN MENSAJE DICIENDO EN CUAL DE LOS SIGUIENTES
/// INTERVALOS EL NUMERO PERTENECE: [0, 25], [25,50], [50,75], [75,100].CUANDO EL NUMERO SEA MENOR QUE CERO O MAYOR QUE
/// 100, SE DEBE IMPRIMIR EL MENSAJE: "FUERA DEL INTERVALO".
/// EL SIMBOLO "(" REPRESENTA MAYOR QUE, POR EJEMPLO:
/// [0,25] INDICA NUMEROS ENTRE 0 Y 25, INCLUYENDO AMBOS.
/// (25,50] INDICA NUMEROS MAYORES A 25 HASTA EL 50.
/// LA SALIDA DEBE SER UN MENSAJE COMO EL SIGUIENTE EJEMPLO.
/// 25.01 INTERVALO (25,50]
/// 25.00 INTERVALO [0,25]
/// 100.00 INTERVALO (75,100]
/// -25.02 FUERA DEL INTERVALO.

Proceso Uno
	
	Definir numeroReal Como Real;
	
	Escribir "INGRESE UN NUMERO REAL PARA HALLAR SU INTERVALO";
	LEER numeroReal;
	
	si (numeroReal<0) Entonces
		Escribir "EL NUMERO ESTA FUERA DEL INTERVALO";
	SiNo
		si (numeroReal>100) entonces
			Escribir "EL NUMERO ESTA FUERA DEL INTERVALO";
		SiNo
			si (numeroReal>=0 y numeroReal<=25) Entonces
				Escribir numeroReal, " INTERVALO [0,25]";
			SiNo
				si (numeroReal>=25 y numeroReal<=50) Entonces
					Escribir numeroReal, " INTERVALO [25,50]";
				SiNo
					si (numeroReal>=50 y numeroReal<=75) Entonces
						Escribir numeroReal, " INTERVALO [50,75]";
					SiNo
						si (numeroReal>=75 y numeroReal<=100) Entonces
							Escribir numeroReal, " INTERVALO [75,100]";
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinProceso
