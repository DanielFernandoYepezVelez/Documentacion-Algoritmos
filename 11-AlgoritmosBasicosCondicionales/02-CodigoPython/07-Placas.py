placa = int(input('Ingrese la placa del Vehiculo: '))

if placa == 0 or placa == 1:
    print('Tienes pico y placa los LUNES')
elif placa == 2 or placa == 7:
    print('Tienes pico y placa los MARTES')
elif placa == 9 or placa == 4:
    print('Tienes pico y placa los MIERCOLES')
elif placa == 5 or placa == 3:
    print('Tienes pico y placa los JUEVES')
elif placa == 6 or placa == 8:
    print('Tienes pico y placa los VIERNES')      
else: 
    print('No tienes pico y placa')    