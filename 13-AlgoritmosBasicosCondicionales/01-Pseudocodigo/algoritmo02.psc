//PROBLEMA #2.
//ELABORE UN ALGORITMO QUE LEA EL NOMBRE DE UNA PERSONA, SU ESTATURA
//Y SU PESO. EL ALGORITMO DEBE IMPRIMIR LOS DATOS LEIDOS Y UN MENSAJE
//ACERCA DE SI LA PERSONA ES OBESA O NO.UNA PERSONA SE CONSIDERA
//OBESA SI LA RELACION ESTATURA-PESO ES MENOR O IGUAL QUE 2. SU 
//PROGRAMA DEBE LEER LA ESTATURA EN METROS Y EL PESO EN KILOGRAMOS;
//ADEMAS, LA RELACION ESTATURA-PESO SE CALCULA EN CENTIMETROS 
//SOBRE KILOGRAMOS.

Algoritmo Dos
	
	Definir nombre como cadena;
	Definir estatura, peso, obesa, estaturaTotal Como Real;
	
	escribir "cual es su nombre?";
	leer nombre;
	Escribir "cuanto mide en metros";
	leer estatura;
	Escribir "cuanto es su peso corporal";
	leer peso;
	
	estaturaTotal<-estatura*(100/1);
	obesa<-(estaturaTotal/peso);
	
	si(obesa<=2)entonces
		Escribir "usted sufre de obesidad";
	SiNo
		Escribir "usted no sufre de obesidad";
	FinSi
	
	Escribir "nombre: ", nombre;
	Escribir "estatura: ", estatura, " metros";
	Escribir "peso: ", peso, " kilogramos";

FinAlgoritmo
