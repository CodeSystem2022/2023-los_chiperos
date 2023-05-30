
package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10; //atributo constante, estático, publico y final
    
    //Método insertar: abstracto y sin cuerpo
    void insertar(); //no tiene {}
    void listar();
    void actualizar();
    void eliminar();
    //Son todos métodos tipicos al trabajar con base de datos
    
}
