//PROBLEMA # 4.
/// ELABORE UN ALGORITMO QUE LEA EL CODIGO DE UN ARTICULO, EL PRECIO
/// UNITARIO Y LA CANTIDAD VENDIDA. SU ALGORITMO DEBE CALCULAR E 
/// IMPRIMIR EL TOTAL DE LA VENTA, EL IVA Y EL TOTAL A PAGAR, SABIENDO
/// QUE EL IMPUESTO ES DEL 19%.

Algoritmo Cuatro
	
	Definir codigo, precioUnitario, cantidadVendida, totalVenta, iva, totalPago como real;
	
	Escribir "codigo del articulo";
	leer codigo;
	Escribir "el precio unitario del articulo";
	leer precioUnitario;
	Escribir "cantidad total de articulos vendidos";
	Leer cantidadVendida;
	
	totalVenta = cantidadVendida*precioUnitario;
	iva = totalVenta*0.19;
	totalPago = totalVenta+iva;

	Escribir " ";
	Escribir "las ventas totales fueron de: ", + totalVenta;
	Escribir "el iva fue de: ", + iva;
	Escribir "el pago total es de: ", + totalPago;
	Escribir "el codigo del articulo es: ", codigo;
	
FinAlgoritmo
