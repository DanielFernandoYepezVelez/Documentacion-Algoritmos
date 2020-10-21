print('')
precioArticulo = float(input('Ingrese El Precio Del Articulo: '))

descuento = precioArticulo * 0.2
iva = precioArticulo * 0.19

articuloDescuento = precioArticulo - descuento
articuloIva = precioArticulo + iva
precioFinal = articuloIva - descuento

print('')
print(f'Precio Articulo: {precioArticulo} Pesos')
print(f'Precio Articulo Con Descuento: {articuloDescuento} Pesos')
print(f'Precio Articulo Con Iva: {articuloIva} Pesos')
print(f'Precio Articulo Con Descuento E Iva: {precioFinal} Pesos')
print('')
