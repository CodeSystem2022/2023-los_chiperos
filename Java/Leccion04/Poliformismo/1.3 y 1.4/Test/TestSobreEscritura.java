
package Test;

import domain.*;


public class TestSobreEscritura {
    
    public static void main(String[] args) {
        
       // Gerente gerente = new Gerente("Jose", 5000,"Sistemas");
       // System.out.println("Gerente: " + gerente.obtenerDetalles());
       
       //-------1.3 Polimorfismo Parte 1 y 2
       /*
       Empleado empleado1 = new Empleado("Juan", 10000);
        //System.out.println("empleado1: "+ empleado1.obtenerDetalles());
        imprimir(empleado1);
         Gerente gerente = new Gerente("Jose", 5000,"Sistemas");
        //System.out.println("Gerente: " + gerente.obtenerDetalles());
        imprimir(gerente);
        */
        
       // 1.4 Polimorfismo paso a paso
        Empleado empleado1 = new Empleado("Juan", 10000);
        //System.out.println("empleado1: "+ empleado1.obtenerDetalles());
        imprimir(empleado1);
         empleado1 = new Gerente("Jose", 5000,"Sistemas");
        //System.out.println("Gerente: " + gerente.obtenerDetalles());
        imprimir(empleado1);
    }
    
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("detalles: " + detalles );
    }
}
