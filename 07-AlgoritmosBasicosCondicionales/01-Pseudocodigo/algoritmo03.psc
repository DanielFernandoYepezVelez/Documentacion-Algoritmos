// PROBLEMA #3.
/// LEER CUATRO NUMEROS (N1, N2, N3, N4), CON UN DIGITO DESPUES DEL PUNTO DECIMAL,CORRESPONDIENTE A 4
/// RESULTADOS OBTENIDOS POR UN ESTUDIANTE.CALCULAR EL PROMEDIO PARA ESTOS 4 RESULTADOS, E IMPRIMIR EL 
/// MENSAJE "PROMEDIO:", SEGUIDO POR EL CALCULO OBTENIDO. SI EL PROMEDIO ES DE 7.0 O MAS, IMPRIMIR EL
/// MENSAJE "ESTUDIANTE APROBADO.". SI EL PROMEDIO ES MENOR QUE 5.0, IMPRIMIR EL MESAJE: "ESTUDIANTE REPROBADO."
/// SI EL PROMEDIO ES ENTRE 5.0 Y 6.9, INCLUYENDO ESTE, EL PROGRAMA DEBERA IMPRIMIR EL MENSAJE.
/// "ESTUDIANTE EN EXAMEN".EN CASO DE EXAMEN, LEA UN PUNTUACION MAS.IMPRIMIR EL MENSAJE "NOTA DE EXAMEN:"
/// SEGUIDO POR LA PUNTUACION A LEER.VUELVA A CALCULAR EL PROMEDIO (SUMA LA PUNTUACION DEL EXAMEN CON EL 
/// PROMEDIO CALCULADO ANTERIORMENTE Y DIVIDA POR 2) E IMPRIMA EL SIGUIENTE MENSAJE "ESTUDIANTE APROBADO", EN
/// CASO DE QUE EL PROMEDIO SEA 5.0 O MAS, O "ESTUDIANTE REPROBADO", EN CASO EN QUE EL PROMEDIO SEA 4.9 O MENOR.
/// PARA ESTOS 2 CASOS (APROBADO O REPROBADO DESPUES DEL EXAMEN), IMPRIMIR EL MENSAJE "PROMEDIO FINAL: ",
/// SEGUIDO POR EL PROMEDIO FINAL PARA ESTE ESTUDIANTE EN LA ULTIMA LINEA.LA SALIDA DEBE SER UN MENSAJE COMO
/// EL SIGUIENTE EJEMPLO.

/// EJEMPLO DE ENTRADA.        EJEMPLO DE SALIDA.
/// 2.0, 4.0, 7.5, 8.0,         PROMEDIO:5.4
/// 6.4.                        ESTUDIANTE EN EXAMEN.
///                             NOTA DEL EXAMEN:6.4
///                             ESTUDIANTE APROBADO.
/// 				                    PROMEDIO FINAL: 5.9.


/// 2.0, 6.5, 5.4, 5.0	          PROMEDIO: 4.8.
/// 		                          ESTUDIANTE REPROBADO.

/// 9.0, 4.0, 8.5, 9.0            PROMEDIO: 7.6
/// 						                  ESTUDIANTE APROBADO.

Proceso Tres
	
	Definir n1, n2, n3, n4, promedio1234, puntuacionMas, nuevoPromedio como real;	
	
	Escribir"INGRESE LA PRIMERA NOTA"; 
	leer n1;
	Escribir "INGRESE LA SEGUNDA NOTA";
	leer n2;
	Escribir "INGRESE LA TERCERA NOTA";
	leer n3;
	Escribir "INGRESE LA CUARTA NOTA";
	leer n4;
	
	promedio1234<-(n1+n2+n3+n4)/4;
	Escribir " ";
	Escribir "PROMEDIO: ", promedio1234;
	
	si (promedio1234>=7.0) Entonces
		Escribir "ESTUDIANTE APROBADO";
	SiNo
		si (promedio1234<5.0) Entonces
			Escribir "ESTUDIANTE REPROBADO";
		SiNo
			si (promedio1234>5.0 y promedio1234<=6.9) Entonces
				Escribir "ESTUDIANTE EN EXAMEN";
				Escribir " ";
				Escribir "INGRESAR UNA NUEVA PUNTUACION";
				leer puntuacionMas;
				Escribir "NOTA DE EXAMEN: ", puntuacionMas;
				nuevoPromedio<-(promedio1234+puntuacionMas)/2;
				
				Escribir " ";
				si (nuevoPromedio>=5.0) Entonces
					Escribir "ESTUIDANTE APROBADO";
					Escribir "PROMEDIO FINAL: ", nuevoPromedio;
				SiNo
					si (nuevoPromedio<=4.9) Entonces
						Escribir "ESTUDIANTE REPROBADO";
						Escribir "PROMEDIO FINAL: ", nuevoPromedio;
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinProceso
