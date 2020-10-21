print('')
nombre = str(input('Ingrese El Nombre: '))
tipoZapato = str(input('Ingrese Tipo De Zapato: '))
costoZapato = float(input(f'Ingrese El Precio Del {tipoZapato}: '))
cantidadZapato = int(
    input(f'Ingrese La Cantidad De Zapatos {tipoZapato} Que Va A Comprar: '))

valorCompra = costoZapato * cantidadZapato
descuento = valorCompra * 0.08
iva = valorCompra * 0.19
valorCompraDescuento = valorCompra - descuento
valorCompraIva = valorCompra + iva
compraTotal = (valorCompra + iva) - descuento

print('')
print(f'Nombre Cliente: {nombre}')
print(f'Valor Compra: {valorCompra}')
print(f'Descuento:  {descuento}')
print(f'Iva:  {iva}')
print(f'Valor Compra Con Descuento: {valorCompraDescuento}')
print(f'Valor Compra Con Iva: {valorCompraIva}')
print(f'Pago Neto: {compraTotal}')
print('')
