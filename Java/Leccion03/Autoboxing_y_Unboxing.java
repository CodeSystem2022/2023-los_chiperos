public class TestForEach {
    public static void main(String[] args) {
        //Clase envolvente o Wrapper
        /*  clase envolvente de tipo primitivo
            int = la clase envolvente es integer
            long = la clase envolvente es long
            float = la clase envolvente es float
            double = la clase envolvente es double
            boolean = la clase envolvente es boolean
            byte = la clase envolvente es byte
            char = la clase envolvente es character
            short = la clase envolvente es short
        */
        int enteroprim = 10; //tipo primitivo
        System.out.println("enteroprim = " + enteroprim);
        integer entero = 10; //tipo objet con la clase integer
        System.out.println("entero.doubleValue() = " + entero.doubleValue()); //autoboxing

        int entero2 = entero; //unboxing
        System.out.println("entero2 = " + entero2);
    }
}
