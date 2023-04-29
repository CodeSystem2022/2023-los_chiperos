#video 4
resultado = None
a = 10
b = 0
try:
    resultado = a / b # modificamos
except TypeError as e:
    print(f'TypeError -Ocurrio un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}')
except Exception as e:
    print(f'Exception - ocurrio un error: {type(e)}')
print(f'El resultado es: {resultado}')
print('seguimos...')


#Video 5
resultado= None
try:
    a = int(input('Digite el primer número: '))
    b = int(input( 'Digite el segundo número: '))
    resultado = a / b # modificamos
except TypeError as e:
    print(f'TypeError -Ocurrio un error:{type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}')
except Exception as e:
    print(f'Exception - Ocurrio un error: {type(e)}')

print(f'El resultado es: {(resultado)}' )
print('seguimos...')

#Video 6

resultado= None
try:
    a = int(input('Digite el primer número: '))
    b = int(input( 'Digite el segundo número: '))
    resultado = a / b # modificamos
except TypeError as e:
    print(f'TypeError -Ocurrio un error:{type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}')
except Exception as e:
    print(f'Exception - Ocurrio un error: {type(e)}')
else:
    print("No se arrojo ninguna exception")
finally: #siempre se va a ejecutar
    print('Ejecuccion de este bloque finally')

print(f'El resultado es: {(resultado)}' )
print('seguimos...')