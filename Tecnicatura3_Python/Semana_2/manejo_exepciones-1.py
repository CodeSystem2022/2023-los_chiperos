# declaramos la variable

try:
    archivo = open('"prueba.txt","w"') # la w es write la que te dejara escribir
    archivo.write('programamos con diferentes tipos de archivo,ahora en txt.\n')
    archivo.write('los acentos son importantes para las palabras.\n')
    archivo.write('como por ejemplo: accion, ejecucion y produccion')
    archivo.write('con esto terminamos...')
    archivo.write('las letras son:"r= read = leer",\n  "a= append = anexa"\n, ')
    archivo.write('"w= write = escribe",\n "x= crea un archivo".\n, t= esta es para texto o text\n')
    archivo.write('b= archivos binarios\n, w+ = sirve para escribir y lee informacion\n, r+= sirve para leer w+\n')
except Exception as e:
    
    print(e)
finally: #siempre se ejecuta 
    archivo.close() #con esto se debe cerrar el archivo
    #archivo.write('todo quedo perfecto') # esto es un error que nos puede suceder 

