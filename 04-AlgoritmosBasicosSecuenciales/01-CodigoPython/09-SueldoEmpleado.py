print(' ')
nombreEmpleado = str(input('Ingrese El Nombre: '))
horasTrabajadas = float(input('Ingrese Las Horas Trabajadas: '))
valorHora = float(input('Valor De La Hora Trabajada: '))

sueldoEmpleado = valorHora * horasTrabajadas

print(' ')
print('Nombre Empleado: ', nombreEmpleado)
print('Horas Trabajadas: ', horasTrabajadas, 'Hora(s)')
print('Valor Hora: ', valorHora, 'Pesos')
print(f'Sueldo Empleado es: {sueldoEmpleado} Pesos')
print(' ')
