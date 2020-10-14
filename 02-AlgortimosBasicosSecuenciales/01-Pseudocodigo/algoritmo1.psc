// PROBLEMA #1.
/// EL CALCULO DEL PAGO MENSUAL DE UN EMPLEADO DE UNA EMPRESA SE EFECTUA DE LA
/// SIGUIENTE MANERA: EL SUELDO BASICO SE CALCULA CON BASE AL NUMERO TOTAL
/// DE HORAS TRABAJADAS Y UNA TARIFA HORARIA; AL SUELDO BASICO, SE LE
/// APLICA UNA BONIFICACION DEL 20% OBTENIENDOSE EL SUELDO BRUTO, AL
/// SUELDO BRUTO, SE LE APLICA UN DESCUENTO DEL 10% OBTENIENDOSE
/// EL SUELDO NETO. ESCRIBA UN ALGORITMO QUE CALCULE E IMPRIMA EL
/// SUELDO BASICO, EL SUELDO BRUTO Y EL SUELDO NETO DE UN TRABAJADOR.

Algoritmo Uno
	
	Definir sueldoBasico, horasTrabajadas, tarifaHoraria, bonificacion, sueldoBruto, descuento, sueldoNeto Como Real;
	
	Escribir "ingrese el numero total de horas laboradas";
	leer horasTrabajadas;
	Escribir "ingrese su tarifa cobrada por hora";
	leer tarifaHoraria;
	
	sueldoBasico<-horasTrabajadas*tarifaHoraria;
	bonificacion<-sueldoBasico*0.20;
	sueldoBruto<-sueldoBasico+bonificacion;
	descuento<-sueldoBruto*0.10;
	sueldoNeto<-sueldoBruto-descuento;
	
	Escribir "salario basico: ", + sueldoBasico;
	Escribir "salario bruto: ", + sueldoBruto;
	Escribir "salario neto: ",  + sueldoNeto;
	
FinAlgoritmo
