//PROBLEMA #7.
//ELABORE UN ALGORITMO QUE LEA UN DATO, EL CUAL ES EL VALOR DE UN
//ANGULO EN GRADOS, Y QUE LO CONVIERTA E IMPRIMA EN RADIANES.

Algoritmo Siete
	
	Definir angulo, numeroPI, grados, radianes como real;
	
	Escribir "ingresar el valor del angulo";
	leer angulo;
	
	numeroPI<-3.14;
	grados<-180;
	radianes<-(angulo/grados)*numeroPI;
	
	Escribir "el resultado es: ", radianes, " radianes";
	
FinAlgoritmo
