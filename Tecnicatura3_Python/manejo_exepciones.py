resultado = None
a = '10'
b = 0

try:
    resultado = a / b # modificamos

except ZeroDivisionError as e:
    print(f'ocurrio un error: {e}')

print(f'el rersultado es: {resultado}')
print(f'seguimmos...')
