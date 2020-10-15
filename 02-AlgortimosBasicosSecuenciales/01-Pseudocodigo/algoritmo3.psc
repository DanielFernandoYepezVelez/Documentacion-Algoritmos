//PROBLEMA #3
//A LA MAMA DE JUAN LE PREGUNTAN SU EDAD Y CONTESTA: TENGO 3 HIJOS
//PREGUNTELE A JUAN SU EDAD. ALBERTO TIENE 2/3 DE LA EDAD DE JUAN, ANA
//TIENE 4/3 DE LA EDAD DE JUAN Y MI EDAD ES LA SUMA DE LAS TRES. HACER
//UN ALGORITMO QUE MUESTRE LA EDAD DE LOS CUATRO.

Algoritmo Tres
	
	Definir edadJuan, edadAlberto, edadAna, edadMama Como real;

	Escribir "juan cuantos años tienes?";
	leer edadJuan;
	
	edadAlberto = trunc(edadJuan * (2 / 3));
	edadAna = trunc(edadJuan * (4 / 3));
	edadMama = edadAlberto + edadAna + edadJuan;
	
	Escribir "edad de la mama: ", edadMama, " años";
	Escribir "edad de juan: ", edadJuan, " años";
	Escribir "edad de alberto: ", edadAlberto, " años";
	Escribir "edad de ana: ", edadAna, " años";
	
FinAlgoritmo
