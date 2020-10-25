// PROBLEMA #1.
/// UN VENDEDOR DE TELEVISORES, OFRECE UN DESCUENTO DEL 15% SOBRE EL PRECIO SIN IVA, PARA CUALQUIER APARATO CUYO PRECIO SUPERE $1.000.000
/// ADEMAS, OFRECE UN 7% SOBRE EL PRECIO SIN IVA, SI EL APARATO ES MARCA LG. DETERMINAR CUANTO DEBE PAGAR CON IVA INCLUIDO (19%) 
/// CUALQUIER COMPRADOR.

Proceso Uno
	
	Definir descuento, precio, iva, pago, pagoTotal como real; 
	Definir marca como cadena;
	
	Escribir "*****ALMACEN DE TELEVISORES********";
	Escribir "INGRESE EL PRECIO DE TV QUE DESEA COMPRAR";
	leer precio;
	Escribir "INGRESE LA MARCA DEL TV QUE DESEA COMPRAR";
	leer marca;
	
	si (precio > 1000000 Y (marca = "LG" O marca = "lg")) Entonces
		descuento = precio * 0.22;
		pago = precio - descuento;
		iva = pago * 0.19;
		pagoTotal = pago + iva;
		
		Escribir " ";
		Escribir "EL COMPRADOR DEBE PAGAR: $", pagoTotal;
		
	SiNo
		si (precio > 1000000) entonces
			descuento = precio * 0.15; 
			pago = precio - descuento;
			iva = pago * 0.19;
			pagoTotal = pago + iva;
			
			Escribir " ";
			Escribir "EL COMPRADOR DEBE PAGAR: $",pagoTotal;
			
		SiNo
			si(marca = "LG" O marca = "lg") Entonces
				descuento = precio * 0.07;
				pago = precio - descuento;
				iva = pago * 0.19;
				pagoTotal = pago + iva;
				
				Escribir " ";
				Escribir "EL COMPRADOR DEBE PAGAR: $",pagoTotal;
				
			SiNo
				iva = precio * 0.19;
				pagoTotal = precio + iva;
				
				Escribir "LAS ESPECIFICACIONES DEL PRODUCTO COMPRADO NO APLICA PARA";
				Escribir "DESCUENTOS O PROMOCIONES VIGENTES";
				Escribir "EL VALOR A PAGAR ES DE: $",pagoTotal;
			FinSi
		FinSi
	FinSi
	
FinProceso
