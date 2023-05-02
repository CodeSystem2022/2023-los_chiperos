import os

class catalogoPeliculas:
     
     ruta_archivo = 'peliculas.txt'

     @classmethod
     def agregar_peliculas(cls, peliculas):
          with open(cls.ruta_archivos, 'a', encoding='utf8') as archivo:
               archivo.write(f'{peliculas.nombre}\n')

@classmethod
def listar_peliculas(cls):
     with open(cls.ruta_archivos, 'a', encoding='utf8') as archivo:
        print(f'catalogo de peliculas'.center(50, '-'))
        print(archivo.read())

@classmethod
def eliminar_peliculas(cls):
     os.remove(cls.ruta_archivo)
     print(f'archivo eliminado: {cls.ruta_archivo}')

