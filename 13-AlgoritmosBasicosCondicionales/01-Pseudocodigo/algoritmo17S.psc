//PROBLEMA #17.
//EN UNA JUEGO DE PREGUNTAS A LAS QUE SE RESPONDE "SI" O "NO", GANA QUIEN RESPONDA CORRECTAMENTE LAS TRES PREGUNTAS.
//SI SE RESPONDE MAL A CUALQUIERA DE ELLAS, YA NO SE PREGUNTA LA SIGUIENTE Y TERMINA EL JUEGO. LAS PREGUNTAS SON:
//¿BOLIVAR LIBERTO A COLOMBIA?
//¿COLON DESCUBRIO AMERICA?
//¿J BALVIN ES UN ARTISTA COLOMBIANO?

Proceso DiecisieteSegundaParte
	
	definir respuesta, respuesta1, respuesta2 como cadena;
	
	Escribir "¿Bolivar liberto a colombia?";
	leer respuesta;
	
	si (respuesta="si" O respuesta="SI") entonces
		Escribir "********CONTINUA JUGANDO*******";
		Escribir "¿colon descubrio america?";
		leer respuesta1;
		si (respuesta1="si" O respuesta1="SI") Entonces
			Escribir "********CONTINUA JUGANDO*******";
			Escribir "¿j balvin es un artista colombiano?";
			Leer respuesta2;
			si (respuesta2="si" O respuesta2="SI") Entonces
				Escribir "********YOU ARE THE BEST*******";			
			FinSi
		FinSi
	SiNo
		Escribir "****LO SIENTO, EL JUEGO HA TERMNADO****";
	FinSi	
	
FinProceso
