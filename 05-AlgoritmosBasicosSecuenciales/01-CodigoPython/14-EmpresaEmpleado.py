print('')
diasEstadia = int(input('Ingrese El Numero De Dias En La Capital: '))
valorHotel = float(input('Ingrese El Valor Por Noche En El Hotel: '))
valorComida = float(input('Ingrese El Valor De Alimentación Por Dia: '))
otrosGatos = 200000

chequeHotel = diasEstadia * valorHotel
chequeComida = diasEstadia * valorComida
ChequeOtrosGastos = diasEstadia * otrosGatos
chequeTotal = chequeHotel + chequeComida + ChequeOtrosGastos

print('')
print(f'Dias Instancia: ', diasEstadia)
print(f'Valor Hotel: {chequeHotel} Pesos')
print(f'Valor Comida: {chequeComida} Pesos')
print(f'Valor Otros Gastos: {ChequeOtrosGastos} Pesos')
print(f'Cheque Total: {chequeTotal} Pesos')
print('')
