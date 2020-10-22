// PROBLEMA #4.
/// UNA EMPRESA CON TRES DEPARTAMENTOS TIENE ESTABLECIDO UN PLAN DE INCENTIVOS PARA SUS VENDEDORES,
/// AL FINAL DEL PERIODO, A CADA DEPARTAMENTO SE LE PIDE EL IMPORTE GLOBAL DE LAS VENTAS. A LOS DEPARTAMENTOS
/// QUE EXCEDAN EL 33% DE LAS VENTAS TOTALES SE LES ADICIONA AL SALARIO DE LOS VENDEDORES UN PORCENTAJE
/// EQUIVALENTE AL 20% DEL SALARIO MENSUAL.

/// VENTAS DEL DEPARTAMENTO 1.
/// VENTAS DEL DEPARTAMENTO 2.
/// VENTAS DEL DEPARTAMENTO 3:
/// SALARIO DE LOS VENDEDORES DE CADA DEPARTAMENTO.

/// HACER UN ALGORITMO QUE DETERMINE CUANTO RECIBIRAN LOS VENDEDORES DE CADA DEPARTTAMENTO AL FINALIZAR EL PERIODO.

Proceso Cuatro
	
	definir ventasDerechoIncentivos1, ventasGlobales, ventasDepartamento1, ventasDepartamento2, ventasDepartamento3 como real;
	definir ventasDerechoIncentivos2, salarioVendedores1, salarioVendedores2, salarioVendedores3 Como Real;
	Definir ventasDerechoIncentivos3, aumento como real;
	
	Escribir "INGRESE LAS VENTAS DEL DEPARTAMENTO #1";
	leer ventasDepartamento1;
	Escribir "INGRESE LAS VENTAS DEL DEPARTAMENTO #2";
	leer ventasDepartamento2;
	Escribir "INGRESE LAS VENTAS DEL DEPARTAMENTO #3";
	leer ventasDepartamento3;
	
	Escribir " ";
	Escribir "INGRESE EL SALARIO DE LOS EMPLEADOS DEL DEPARTAMENTO #1";
	leer salarioVendedores1;
	Escribir "INGRESE EL SALARIO DE LOS EMPLEADOS DEL DEPARTAMENTO #2";
	leer salarioVendedores2;
	Escribir "INGRESE EL SALARIO DE LOS EMPLEADOS DEL DEPARTAMENTO#3";
	Leer salarioVendedores3;
	Escribir " "; 
	
	ventasGlobales = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;
	
	ventasDerechoIncentivos1 = (ventasDepartamento1 * 100) / ventasGlobales;
	ventasDerechoIncentivos2 = (ventasDepartamento2 * 100) / ventasGlobales;
	ventasDerechoIncentivos3 = (ventasDepartamento3 * 100) / ventasGlobales;
	
	si (ventasDerechoIncentivos1 > 33) entonces
		aumento = (salarioVendedores1 * 0.2) + salarioVendedores1;
		Escribir "EL NUEVO SALARIO DE LOS EMPLEADOS DEL DEPARTAMENTO #1: ", aumento;
	SiNo
		Escribir "EL DEPARTAMENTO #1 NO CUMPLIO CON EL OBJETIVO DE LAS VENTAS!!!!! ";
	FinSi
	
	si (ventasDerechoIncentivos2 > 33) Entonces
		aumento = (salarioVendedores2 * 0.2) + salarioVendedores2;
		Escribir "EL NUEVO SALARIO DE LOS EMPLEADOS DEL DEPARTAMENTO #2: ", aumento;
	SiNo
		Escribir "el DEPARTAMENTO #2 NO CUMPLIO CON EL OBJETIVO DE LAS VENTAS!!!!! ";
	FinSi
		
	si (ventasDerechoIncentivos3 > 33) Entonces
		aumento = (salarioVendedores3 * 0.2) + salarioVendedores3;
		Escribir "EL NUEVO SALARIO DE LOS EMPLEADOS DEL DEPARTAMENTO #3: ", aumento;
	SiNo
		Escribir "EL DEPARTAMENTO #3 NO CUMPLIO CON EL OBJETIVO DE LAS VENTAS!!!!! ";
	FinSi
	
FinProceso
