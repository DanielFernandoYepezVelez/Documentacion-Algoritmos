// PROBLEMA #3.
/// PARA LAS VOTACIONES DE UN MUNICIPIO DE ANTIOQUIA, SE TIENEN ASIGNADAS 5 MESAS ELECTORALES, LAS PERSONAS QUE PODRAN VOTAR
/// DEBEN SER MAYORES DE EDAD Y DE NACIONALIDAD COLOMBIANA; DE ACUERDO AL ULTIMO DIGITO DE SUS CEDULA DE CIUDADANIA, LES SERA ASIGNADA
/// LA MESA ELECTORAL ASI:
/// ULTIMOS DIGITOS      NRO. MESA
/// 0 Y 1                   1
/// 2 Y 3                   2
/// 4 Y 5                   3
/// 6 Y 7                   4
/// 8 Y 9                   5
/// REALIZAR UN ALGORITMO QUE LE INDIQUE A UNA PERSONA SI ES APTA O NO PARA VOTAR Y SI ES APTA, DEBE INDICARLE EN QUE MESA PODRA HACERLO.

Proceso Dos
	
	Definir edad, ultimo Como Entero;
	definir nombre, nacionalidad como cadena;
	
	Escribir "INGRESE SU NOMBRE";
	leer nombre;
	Escribir "INGRESAR EDAD";
	leer edad;
	Escribir "INGRESAR NACIONALIDAD";
	leer nacionalidad;
	Escribir "INGRESE EL ULTIMO NUMERO DE SU CEDULA";
	leer ultimo;
	
	Escribir " ";
	si (edad >= 18 Y (nacionalidad = "colombiana" O nacionalidad = "COLOMBIANA")) Entonces
		
		si (ultimo = 0 O ultimo = 1) entonces
			Escribir nombre, " BIENVENIDO!!!!! ERES APTO O APTA PARA EJERCER EL DERECHO DE LA DEMOCRACIA";
			Escribir nombre, " DEBES VOTAR EN LA MESA #1";
		SiNo
			si (ultimo = 2 O ultimo = 3) Entonces
				Escribir nombre, " BIENVENIDO!!!!! ERES APTO O APTA PARA EJERCER EL DERECHO DE LA DEMOCRACIA";
				Escribir nombre, " DEBES VOTAR EN LA MESA #2";
			SiNo
				si (ultimo = 4 O ultimo = 5) Entonces
					Escribir nombre, " BIENVENIDO!!!!! ERES APTO O APTA PARA EJERCER EL DERECHO DE LA DEMOCRACIA";
					Escribir nombre, " DEBES VOTAR EN LA MESA #3";
				SiNo
					si (ultimo = 6 O ultimo = 7) Entonces
						Escribir nombre, " BIENVENIDO!!!!! ERES APTO O APTA PARA EJERCER EL DERECHO DE LA DEMOCRACIA";
						Escribir nombre, " DEBES VOTAR EN LA MESA #4";
					SiNo
						si (ultimo = 8 O ultimo = 9) Entonces
							Escribir nombre, " BIENVENIDO!!!!! ERES APTO O APTA PARA EJERCER EL DERECHO DE LA DEMOCRACIA";
							Escribir nombre, " DEBES VOTAR EN LA MESA #5";
						SiNo
							Escribir nombre, " EL NUMERO INGRESADO NO ES VALIDO";
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	SiNo
		si (edad < 18) Entonces
			Escribir nombre, " LO SENTIMOS!!!!! PERO POR LEY, AUN NO ESTAS EN LA CAPACIDAD DE EJERCER EL DERECHO AL VOTO";
		FinSi
	FinSi
	
FinProceso
