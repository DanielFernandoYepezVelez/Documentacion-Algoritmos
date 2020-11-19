//PROBLEMA #7
//DADO UN PARTIDO DE FUTBOL JUGADO ENTRE DOS EQUIPOS A Y B, DISEÑE UN ALGORITMO QUE
//DETERMINE EL RESULTADO DEL PARTIDO DICIENDO SI GANO A, GANO B O HUBO EMPATE.

Algoritmo SieteSegundaParte
	
	Definir A, B como real; 
	
	Escribir "ingrese el resultado del encuentro para un equipo";
	leer A;
	Escribir "ingrese el resultado del encuentro para el otro equipo";
	leer B;
	
	si(A>B) entonces
		Escribir "el partido fue ganado por A";
	SiNo
		si(A<B) Entonces
			Escribir "el partido fue ganado por B";
		SiNo
			Escribir "el partido quedo empatado" ;
		FinSi
	FinSi
	
FinAlgoritmo
