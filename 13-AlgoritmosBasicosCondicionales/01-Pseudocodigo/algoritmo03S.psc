//PROBLEMA #3.
//ELABORE UN ALGORITMO QUE LEA EL NOMBRE DE UN ESTUDIANTE Y LAS TRES
//NOTAS OBTENIDAS EN LOS EXAMENES DE UNA MATERIA.EL ALGORITMO DEBE
//CALCULAR LA DEFINITIVA Y PRODUCIR UN MENSAJE DE FELICITACION SI LA
//MATERIA FUE APROBADA, O UN MENSAJE DE REPROCHE SI LA MATERIA FUE
//REPROBADA. LA MATERIA SE APRUEBA SI OBTIENE COMO DEFINITIVA UNA 
//NOTA MAYOR O IGUAL QUE 3.0.

Algoritmo TresSegundaParte
	
	definir nombre como cadena;
	Definir nota1, nota2, nota3, definitiva Como Real;
	
	Escribir "cual es tu nombre?";
	leer nombre;
	
	Escribir "primera nota";
	leer nota1;
	Escribir "segunda nota";
	leer nota2;
	Escribir "tercer nota";
	leer nota3;
	
	definitiva<-(nota1+nota2+nota3)/3;
	
	si(definitiva>=3.0)entonces
		Escribir "la materia fue aprobada";
	SiNo
		Escribir "la materia fue reprobada";
	FinSi
	
FinAlgoritmo
