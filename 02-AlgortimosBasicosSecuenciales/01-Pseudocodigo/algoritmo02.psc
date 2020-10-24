// PROBLEMA #2.
/// SI LAS VARIABLES X y Z TIENEN ALMACENADOS INTERNAMENTE LOS VALORES
/// 30 Y 40 RESPECTIVAMENTE,EL RESULTADO DE LAS SIGUIENTES EXPRESIONES
/// SERA:
/// EXPRESION             RESULTADO
/// X = Z                  (F O V)
/// X > Z
/// (X+20) <>(Z+1)
/// Z >= X
/// "A" > "B"

Algoritmo Dos
	
	Definir X,Z como entero;
	definir respuesta1, respuesta2, respuesta3, respuesta4, respuesta5 como cadena;
	
	X = 30;
	Z = 40;
	
	Escribir "SI X=30 Y Z=40 ENTONCES CONSIDERAR LOS SIGUIENTES ENUNCIADOS:";
	Escribir "posibles resultados FALSO O VERDADERO.";
	
	Escribir " ";
	Escribir "ENUNCIADO #1:";
	Escribir "ENTONCES X = Z";
	leer respuesta1;
	si (respuesta1="falso" O respuesta1="FALSO") entonces
		Escribir "*****VERDADERO******";
	SiNo
		Escribir "ANALIZA MEJOR EL ENUNCIADO";
	FinSi
	
	Escribir " ";
	Escribir "ENUNCIADO #2:";
	Escribir "ENTONCES X > Z";
	leer respuesta2;
	si (respuesta2="falso" O respuesta2="FALSO") entonces
		Escribir "*****VERDADERO******";
	SiNo
		Escribir "ANALIZA MEJOR EL ENUNCIADO";
	FinSi
	
	Escribir " ";
	Escribir "ENUNCIADO #3:";
	Escribir "ENTONCES Z >= X ";
	leer respuesta3;
	si (respuesta3="verdadero" O respuesta3="VERDADERO") entonces
		Escribir "*****VERDADERO******";
	SiNo
		Escribir "ANALIZA MEJOR EL ENUNCIADO";
	FinSi
	
	Escribir " ";
	Escribir "ENUNCIADO #4:";
	Escribir "ENTONCES (X+20) <> (Z+1) ";
	leer respuesta4;
	si (respuesta4="verdadero" O respuesta4="VERDADERO") entonces
		Escribir "*****VERDADERO******";
	SiNo
		Escribir "ANALIZA MEJOR EL ENUNCIADO";
	FinSi
	
	Escribir " ";
	Escribir "ENUNCIADO #5:";
	Escribir "ENTONCES A > B ";
	leer respuesta5;
	si (respuesta5="no existe en el planteamiento inicial" O respuesta5="NO EXISTE EN EL PLANTEAMIENTO INICIAL") entonces
		Escribir "*****VERDADERO******";
	SiNo
		si(respuesta2="falso" O respuesta2="FALSO") entonces
			Escribir "FALSO ESTA BIEN,PERO ES PREFERIBLE DECIR NO EXISTE EN EL PLANTEAMIENTO INICIAL";
		FinSi	
	FinSi
	
FinAlgoritmo
