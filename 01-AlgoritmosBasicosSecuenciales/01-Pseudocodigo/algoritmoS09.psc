// PROBLEMA #9.
/// UN VENDENDOR RECIBE UN SUELDO BASE MAS UN 10% EXTRA POR 
/// COMISION DE SUS VENTAS, EL VENDEDOR DESEA SABER CUANTO DINERO
/// OBTENDRA POR CONCEPTO DE COMISIONES POR LAS TRES VENTAS QUE 
/// REALIZA EN EL MES Y EL TOTAL QUE RECIBIRA EN EL MES TOMANDO
/// EN CUENTA SU SUELDO BASE Y COMISIONES.

Algoritmo NueveSegundaParte
	
	Definir base, comision, dineroComision, totalPago como real;
	
	Escribir "ingrese su salario base";
	leer base;
	
	comision = base * 0.10;
	dineroComision = comision * 3;
	totalPago = base + dineroComision;
	
	Escribir " ";
	Escribir "su pago total es: ", totalPago, " pesos";
	
FinAlgoritmo
