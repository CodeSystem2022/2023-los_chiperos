
#Video 7
from NumerosIgualesException import NumIgualEx

resultado: None


try:
    a = int(input(f'Ingrese un número: '))
    b = int(input(f'Ingrese otro número: '))
    #resultado= a/b
    if a==b:
        raise NumIgualEx('Números iguales')
except TypeError as e:
    print(f'TypeError - {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - {type(e)}')
except Exception as e:
    print(f'Ocurrio un error: {e}')
else:
    print(f'no se ejecuto ninguna excepcion')
finally:
    print(f'se ejecuta bloque finally')

print(f'el resultado es {resultado}')
print(f'final del programa')