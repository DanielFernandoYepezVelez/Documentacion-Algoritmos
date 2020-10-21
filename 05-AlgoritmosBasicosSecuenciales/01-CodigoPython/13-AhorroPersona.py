print('')
sueldo = float(input('Ingrese Salario Mensual: '))

semanasAnuales = 48
ahorroMensual = sueldo * 0.15
ahorroSemanal = ahorroMensual * 4
ahorroAnual = ahorroSemanal * semanasAnuales

print('')
print(f'Ahorro Mensual: {ahorroMensual} Pesos')
print(f'Ahorro Semanal: {ahorroSemanal} Pesos')
print(f'Ahorro Anual: {ahorroAnual} Pesos')
print('')
