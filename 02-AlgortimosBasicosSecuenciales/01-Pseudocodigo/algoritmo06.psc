// PROBLEMA #6.
/// UN EMPLEADO TRABAJA 48 HORAS EN LA SEMANA A RAZON DE 5.000 HORA.
/// EL PORCENTAJE DE RETENCION EN LA FUENTE ES DEL 12.5% DEL SUELDO BRUTO.
/// SE DESEA SABER CUAL ES EL SALARIO BRUTO, LA RETENCION EN LA FUENTE 
/// Y EL SALARIO NETO DEL TRABAJADOR.

Algoritmo Seis
	
	Definir horasLaboradas, pagoHora, retencion, salarioBruto, salarioNeto como real;
	
	horasLaboradas = 48;
	pagoHora = 5000;
	salarioBruto = horasLaboradas * pagoHora;
	retencion = salarioBruto * 0.125;
	salarioNeto = salarioBruto - retencion;
	
	Escribir "salario bruto: ", salarioBruto, " pesos";
	escribir "retencion: ", retencion, " pesos";
	Escribir "salario neto: ", salarioNeto, " pesos";

FinAlgoritmo
