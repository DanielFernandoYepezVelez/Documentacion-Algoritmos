user = str(input('Ingrese el usuario: '))
password = str(input('Ingrese la contraseña: '))

print('\nIniciar Sesión =>')
if user == 'Daniel' and password == '1234':
    print('*****Bienvenido*****')
else:
    print('Acceso Denegado')