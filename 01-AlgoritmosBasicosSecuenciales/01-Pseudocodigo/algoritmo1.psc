//PROBLEMA #1.
/// ELABORE UN ALGORITMO QUE LEA EL SALARIO ACTUAL DE UN EMPLEADO
/// Y EL PORCENTAJE DE AUMENTO Y QUE CALCULE E IMPRIMA EL SALARIO
/// ACTUAL, EL AUMENTO Y EL NUEVO SALARIO.

Algoritmo Uno
	
	Definir salarioActual, porcentaje, aumento, nuevoSalario como real;
	
	Escribir "Ingrese el valor de su salario actual";
	leer salarioActual;
	Escribir "Ingrese el porcentaje de aumento";
	leer porcentaje;
	
	porcentaje = (porcentaje/100);
	aumento = salarioActual*porcentaje;
	nuevoSalario = salarioActual+aumento;
	
	Escribir " ";
	Escribir "el salario actual es de: ", + salarioActual;
	Escribir "el aumento es de: ", + aumento;
	Escribir "el nuevo salario es de: ", + nuevoSalario;
	
FinAlgoritmo
