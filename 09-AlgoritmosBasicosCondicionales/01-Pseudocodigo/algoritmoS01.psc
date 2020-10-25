// PROBLEMA #1.
/// UN EQUIPO DE FUTBOL HA TENDIO UNA BUENA CAMPA�A Y DESEA PREMIAR A SUS JUGADORES CON UN AUMENTO DEL SALARIO PARA LA SIGUIENTE
/// CAMPA�A.LOS SALARIOS DEBEN AJUSTARSE DE LA SIGUIENTE FORMA:
/// SUELDO ACTUAL                 POSICION                       AUMENTO
/// 0-$2.000.000                  DELANTERO                        20%.
/// $2.000.001 - $5.000.000       VOLANTE DE MARCA O DELANTERO     10%.
/// $5.000.001 - $10.000.000      VOLANTE DE MARCA O DEFENSA       5%.
/// SUPERIOR A $10.000.000        DEFENSA O ARQUERO                0%.
/// ELABORAR UN ALGORITMO QUE LEA EL SALARIO DE UN JUGADOR Y QUE IMPRIMA EL PORCENTAJE DE AUMENTO, EL SALARIO ACTUAL Y EL SALARIO
/// AUMENTADO.

Proceso UnoSegundaParte
	
	Definir nombre como cadena;
	definir salarioActual, aumento, nuevoSalario como real;
	
	Escribir "INGRESE EL NOMBRE DEL JUGADOR";
	leer nombre;
	Escribir "INGRESE EL SALARIO ACTUAL";
	leer salarioActual;
	
	si (salarioActual >= 0 Y salarioActual <= 2000000) entonces
		aumento = salarioActual * 0.20;
		nuevoSalario = salarioActual + aumento;
		
		Escribir "";
		Escribir "EL SALARIO ACTUAL DEL JUGADOR ES: ", salarioActual;
		Escribir "EL PORCENTAJE DE AUMENTO FUE DE: ", aumento;
		Escribir "EL NUEVO SALARIO DEL JUGADOR ES: ", nuevoSalario;
	SiNo
		si (salarioActual >= 2000001 Y salarioActual <= 5000000) entonces
			aumento = salarioActual * 0.10;
			nuevoSalario = salarioActual + aumento;
		
		Escribir "";
		Escribir "EL SALARIO ACTUAL DEL JUGADOR ES: ", salarioActual;
		Escribir "EL PORCENTAJE DE AUMENTO FUE DE: ", aumento;
		Escribir "EL NUEVO SALARIO DEL JUGADOR ES: ", nuevoSalario;
	SiNo
		si (salarioActual >= 5000001 Y salarioActual <= 10000000) entonces
		aumento = salarioActual * 0.05;
		nuevoSalario = salarioActual + aumento;
		
		Escribir "";
		Escribir "EL SALARIO ACTUAL DEL JUGADOR ES: ", salarioActual;
		Escribir "EL PORCENTAJE DE AUMENTO FUE DE: ", aumento;
		Escribir "EL NUEVO SALARIO DEL JUGADOR ES: ", nuevoSalario;
	SiNo
		si (salarioActual > 10000000) entonces
			aumento = salarioActual * 0;
			nuevoSalario = salarioActual + aumento;
			
			Escribir "";
			Escribir "EL SALARIO ACTUAL DEL JUGADOR ES: ", salarioActual;
			Escribir "EL PORCENTAJE DE AUMENTO FUE DE: ", aumento;
			Escribir "EL NUEVO SALARIO DEL JUGADOR ES: ", nuevoSalario;
		SiNo
			Escribir "EL DATO INGRESADO NO HACE PARTE DE LAS OPCIONES ESTABLECIDAS";
			FinSi
		FinSi
	FinSi
FinSi
	
FinProceso
