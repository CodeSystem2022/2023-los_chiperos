package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    static { //Bloque de inicializacion estático
        System.out.println("Ejecución del bloque estático");
        ++Persona.contadorPersonas;
        //idPersona = 10; No es estático por esto tenemos un error
    }

    /*No corresponde trabajar en el bloque de inicializacion estático 
      con atributos que no son estáticos*/
    { //Bloque de inicialización NO estático (contexto dinámico)
        System.out.println("Ejecución del bloque NO estático");
        this.idPersona = Persona.contadorPersonas++; //Incrementamos el atributo
    }

    //Los bloques de inicialización se ejecutan antes del constructor
    public Persona() {
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

}
