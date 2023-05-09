import psycopg2 # Esto es para poder conectarnos a Postgressql

#Conectarnos a la base de datos
conexion = psycopg2.connect(
    user = 'postgres',
    password = 'Rise020J',
    host = '127.0.0.1',
    port = '5432',
    database = 'test_bd'
)

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s' #Placeholder
            entrada = input('Digite los id_persona a buscar (separados por coma): ')
            llaves_primarias = (tuple(entrada.split(', ')),)
            cursor.execute(sentencia, llaves_primarias) # De esta manera ejecutamos la sentencia
            registros = cursor.fetchall()
            for registro in registros:
                print(registro)

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()