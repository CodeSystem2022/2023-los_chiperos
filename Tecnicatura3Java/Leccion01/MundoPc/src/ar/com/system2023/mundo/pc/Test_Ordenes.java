package ar.com.system2023.mundo.pc;

import java.util.ArrayList;
import java.util.List;

public class Test_Ordenes {

    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("USB", "HP");
        Monitor monitor1 = new Monitor("HP", "21 Pulgadas");
        Raton raton1 = new Raton("Bluetooth", "HP");
        Computadora computadora1 = new Computadora("HP", raton1, teclado1, monitor1);

        Teclado teclado2 = new Teclado("USB", "HP");
        Monitor monitor2 = new Monitor("HP", "21 Pulgadas");
        Raton raton2 = new Raton("Bluetooth", "HP");
        Computadora computadora2 = new Computadora("HP", raton1, teclado1, monitor1);

        Teclado teclado3 = new Teclado("USB", "HP");
        Monitor monitor3 = new Monitor("HP", "21 Pulgadas");
        Raton raton3 = new Raton("Bluetooth", "HP");
        Computadora computadora3 = new Computadora("HP", raton1, teclado1, monitor1);

        Teclado teclado4 = new Teclado("USB", "HP");
        Monitor monitor4 = new Monitor("HP", "21 Pulgadas");
        Raton raton4 = new Raton("Bluetooth", "HP");
        Computadora computadora4 = new Computadora("HP", raton1, teclado1, monitor1);

        List<Computadora> computadoras1 = new ArrayList<>();
        computadoras1.add(computadora1);
        computadoras1.add(computadora2);
        
        Orden orden1 = new Orden(computadoras1);
        
        System.out.println("orden1 = " + orden1);
    }
}
