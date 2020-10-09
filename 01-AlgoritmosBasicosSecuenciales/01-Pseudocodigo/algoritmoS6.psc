// PROBLEMA #6.
/// ESCRIBA UN PSEUDOCODIGO QUE LUEGO DE LEER LOS SIGUEINTES DATOS
/// DE UN EMPLEADO(NOMBRE Y SUELDO MENSUAL) GENERE UN COMPROBANTE 
/// DE PAGO CON LOS SIGUIENTES DATOS.
/// *******COMPROBANTE DE PAGO*******
/// NOMBRE:    XXXXXXXXXXXXXXX
/// SUELDO:    $XXXXX

/// DETALLES DEL PAGO
/// APORTES A SALUD 4%:   $XXXXXXXX
/// APORTES A PENSION 4%: $XXXXX
/// TOTAL A PAGAR:    XXXXXX

Algoritmo SeisSegundaParte
	
	Definir nombre como cadena;
	definir sueldoMensual, salud, pension, totalPago como real;
	
	Escribir "cual es su nombre?";
	leer nombre;
	Escribir "sueldo mensual";
	leer sueldoMensual;
	
	salud = sueldoMensual * 0.04;
	pension = sueldoMensual * 0.04;
	totalPago = salud + pension;
	
	Escribir " ";
	Escribir "*******COMPROBANTE DE PAGO********";
	Escribir "NOMBRE: ", nombre;
	Escribir "SUELDO: ", sueldoMensual;
	Escribir " ";
	Escribir "DETALLES DEL PAGO";
	Escribir "APORTES A SALUD 4%: ", salud;
	Escribir "APORTES A PENSION 4%: ", pension;
	Escribir "TOTAL A PAGAR: ", totalPago;
	
FinAlgoritmo
