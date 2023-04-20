# Declaramos una variable

try:
    archivo = open('prueba.txt', 'w', encoding= 'utf8') # Si el archivo no existe lo va a crear, de otro modo lo va a buscar
    # la w proviene de la palabra write
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('las letras son:\nr read leer,\na append anexar,\nw write escribe,\nx crea un archivo')
    archivo.write('\nt es para texto o text,\nb es para archivos binarios,\nw+ lee y escribe son iguales r+\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: #siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo
# archivo.write('Todo quedo perfecto'): este es un error