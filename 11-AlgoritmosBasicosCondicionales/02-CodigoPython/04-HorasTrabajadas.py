horasTrabajadas = float(input('Ingrese el Número de horas trabajadas: '))

if horasTrabajadas <= 40:
    total = horasTrabajadas * 300
elif horasTrabajadas > 40:
    salarioSemanal = 40 * 300
    horasExtras = (horasTrabajadas - 40) * 500
    total = salarioSemanal + horasExtras

print(f'Salario Semanal Del Empleado: {total} Pesos')