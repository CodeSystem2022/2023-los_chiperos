# declaramos la variable

try:
    archivo = open('prueba.txt', 'w', encoding='utf8')   # Declaramos una variable y  generamos el metodo open(), la w es de -write- nos va a permitir escribir informacion hacia el archivo. utf8 es para el juego de caracteres para los acentos.
    archivo.write('Progresamos con diferentestipos de archivos, ahora en -.txt- .\n')# Agregamos informacion al archivo con el metodo write
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción.\n')
    archivo.write('Las letras son:\nr: "read" leer, \na: "append" anexa, \nw: "wrtite" escribe, \nx: crea un archivo')
    archivo.write('\nt: "text" especificamos el tipo de archivo con el cual vamos a trabajar')
    archivo.write('\nb: "binary" archivos tipo binario como imagenes, pdf, etc.')
    archivo.write('\nw+: "write and read" lee y escribe')
    archivo.write('\nr+: "read and write" al igual que la letra w+')
    archivo.write('\nCon esto terminamos.')
    
except Exception as e:
    print(e)
finally: #siempre se ejecuta 
    archivo.close() #con esto se debe cerrar el archivo
    #archivo.write('todo quedo perfecto') # esto es un error que nos puede suceder 

