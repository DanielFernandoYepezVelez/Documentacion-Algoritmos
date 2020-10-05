//PROBLEMA #6.
//ELABORE UN ALGORITMO QUE LEA UNA TEMPERATURA EN GRADOS FAHREINHEIT
//Y LA CONVIERTA Y LA IMPRIMA EN GRADOS CENTIGRADOS.LOS GRADOS
//FAHREINHEIT SE CONVIERTEN EN GRADOS CENTIGRADOS RESTANDOLES 32 Y
//MULTIPLICANDO POR 5/9.

Algoritmo Seis
	
	Definir gradosF, gradosC como real;
	
	Escribir "ingresar una temperatura en grados fahreinheit";
	Leer gradosF;
	
	gradosC<-(gradosF-32)*(5/9);
	
	Escribir "el resultado es: ", gradosC,  " grados centigrados";
	
FinAlgoritmo
