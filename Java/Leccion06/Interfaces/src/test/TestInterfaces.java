
package test;

import accesodatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql(); 
        //datos.listar();
        //imprimir(datos);

        // polimorfismo, una misma variable apunta a diferentes implementaciones
        
        datos = new ImplementacionOracle();
        // datos.listar();
        imprimir(datos);

    }

    // si agregamos otro método, debe ser estático
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
