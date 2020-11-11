from datetime import date
today = date.today()
year = today.year

nacimiento = int(input('Ingrese Año De Nacimiento: '))
edad = year - nacimiento

if edad > 17:
    print('Puedes obtener la cedula')
else:
    print('NO puedes Obtener la cedula')