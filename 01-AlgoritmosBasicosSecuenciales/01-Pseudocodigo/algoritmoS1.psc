// PROBLEMA #1.
/// A UN EMPLEADO LE RETIENEN EL 12% DE SU SALARIO BASICO.CALCULAR EL
/// SALARIO NETO, SABIENDO QUE LE ENTREGAN UN BONO DEL 2.3% DEL SALARIO 
/// BASICO.SE DEBE LEER EL SALARIO BASICO DEL EMPLEADO.

Algoritmo UnoSegundaParte
	
	Definir salarioBasico, retencion, aumento, salarioNeto como real;
	
	Escribir "cual es su salario basico?";
	leer salarioBasico;
	
	retencion = salarioBasico * 0.12;
	aumento = salarioBasico * 0.023;
	salarioNeto = (salarioBasico + aumento) - retencion;
	
	Escribir "el salario neto es de:", salarioNeto;
	
FinAlgoritmo
