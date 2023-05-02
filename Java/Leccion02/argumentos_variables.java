//video 1

package test;

public class TestArgumentoVariables {
    public state void main (string[] args) {
    
    }
    
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.lenght; i++) {
            System.out.println("Elementos: "+numeros[i];
            }
     }
}

//video 2

package test;

public class TestArgumentoVariables {
    public state void main (string[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2) ;
        variosParametros( =, =, :‘27, 8, 9);
    }
    
    private static void variosParametros(string nombre, string apellido, int ...numeros){
        System.out.println("Nombre: "+nombre+", Apellido: "+apellido+);
        imprimirNumeros(numeros)
    
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.lenght; i++) {
            System.out.println("Elementos: "+numeros[i];
            }
     }
}
