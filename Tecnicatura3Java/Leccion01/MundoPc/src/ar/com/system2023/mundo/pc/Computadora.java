package ar.com.system2023.mundo.pc;

public class Computadora {

    private final int idComputadora;
    private static int contadorComputadoras;
    private String nombre;
    private Raton raton;
    private Teclado teclado;
    private Monitor monitor;

    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Raton raton, Teclado teclado, Monitor monitor) {
        this();
        this.nombre = nombre;
        this.raton = raton;
        this.teclado = teclado;
        this.monitor = monitor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    
    public int getIdComputador() {
        return this.idComputadora;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", raton=" + raton + ", teclado=" + teclado + ", monitor=" + monitor + '}';
    }

}
