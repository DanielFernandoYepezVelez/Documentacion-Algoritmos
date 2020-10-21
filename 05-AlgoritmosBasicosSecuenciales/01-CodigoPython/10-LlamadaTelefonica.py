print('')
minutosLlamada = float(input('Ingrese Los Minutos De La LLamada: '))
costoMinuto = float(input('Ingrese El Valor Economico Por Minuto: '))

costoLlamada = minutosLlamada * costoMinuto

print('')
print('Tiempo LLamada: ', minutosLlamada, 'Minutos')
print('Costo Minuto: ', costoMinuto, 'Pesos')
print(f'Costo Total: {costoLlamada} Pesos')
print('')
