package mundopc;

import ar.com.system2023.mundopc.Monitor;

public class mundopc{
    public static void main (String[]args){
        Monitor monitorHP = new Monitor("HP",13); // importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth","HP");
        Computadora computadoraHP = new Computadora("ComputadoraHP",monitorHP,tecladoHP,ratonHP);

        //Creamos otros objetos de diferentes marcas
        Monitor monitorGamer = new Monitor("Gamer",32); // importar la clase
        Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
        Raton ratonGamer = new Raton("Bluetooth","Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer,tecladoGamer,ratonGamer);
        Orden orden1 = new Orden();// Inicializamos el arreglo vacio
        Orden orden2 = new Orden();// una nueva lista para el objeto orden2
        orden1.agregarCmputadora(computadoraHP);
        orden1.agregarCmputadora(computadoraGamer);

        Computadora computadorasVarias = new computadora("computadora de difrentes marcas",monitorHP,tecladoGamer,ratonHP);
        orden2.agregarCmputadora(computadorasVarias);

        orden1.mostrarOrden();
        orden2.mostrarOrden();

    }
        


    }
}