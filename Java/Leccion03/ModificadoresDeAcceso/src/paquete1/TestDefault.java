package paquete1;

public class TestDefault {

    public static void main(String[] args) {
        ClaseHija2 claseh2 = new ClaseHija2();
        claseh2.atributoDefault = "Cambio desde la prueba";
        System.out.println("Claseh2 atributo default = " + claseh2.atributoDefault);
    }
}
