import psycopg2 as bd #Renombramos e import para usar bd


conexion = bd.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5432', database = 'test_bd') # podemos pasar una tupla, podemos tener varios parámetros y el ultimo parámetro que podemos pasar puede ser un diccionario


try:
    # conexion.autocommit = False # esto no debe estar, le indicamos que no se guarde automaticamente
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
    valores = ('Maria', 'Esparza', 'mesparzaœmail.com')
    cursor.execute(sentencia, valores)
    conexion.commit() # Realizamos el commit manualmente
    print('Termina la transaccion')

except Exception as e:
    conexion.rollback()  # agregamos el rollback
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    #cerramos la conexion a la base de datos, tenemos abierto el objeto de tipo cursor
    conexion.close()

