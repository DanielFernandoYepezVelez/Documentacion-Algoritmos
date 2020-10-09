// PROBLEMA #10.
/// UN ALUMNO DESEA SABER CUAL SERA SU CALIFICACION FINAL EN LA
/// MATERIA DE ALGORITMO.DICHA CALIFICACION SE COMPONE DE LOS
/// SIGUIENTES PORCENTAJES:

/// 55% DEL PROMEDIO DE SU TRES CALIFICACIONES PARCIALES.
/// 30% DE LA CALIFICACION DEL EXAMEN FINAL.
/// 15% DE LA CALIFICACION DE UN TRABAJO FINAL.

Algoritmo DiezSegundaParte
	
	Definir nota1, nota2, nota3, nota4, nota5, promedio, porcentajePromedio, examenFinal, trabajoFinal, calificacionFinal como real;
	
	Escribir"calificacion 1";
	leer nota1;

	Escribir"calificacion 2";
	leer nota2;

	Escribir "califiacion 3";
	leer nota3;

	Escribir "calificacion 4";
	leer nota4;

	Escribir "calificacion 5";
	leer nota5;
	
	promedio = (nota1 + nota2 + nota3) / 3;
	porcentajePromedio = promedio * 0.55;
	examenFinal = nota4 * 0.30;
	trabajoFinal = nota5 * 0.15;
	calificacionFinal = porcentajePromedio + examenFinal + trabajoFinal;
	
	Escribir " ";
	Escribir "la calificacion final es: ", calificacionFinal;
	
FinAlgoritmo
