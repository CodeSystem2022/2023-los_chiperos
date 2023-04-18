package ar.com.system2023.mundo.pc;

import java.util.List;

public class Orden {

    private final int idOrden;
    private static int contadorOrdenes;
    private List<Computadora> computadoras;

    private Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
    }

    public Orden(List<Computadora> computadoras) {
        this();
        this.computadoras = computadoras;
    }

    public void agregarComputadora(Computadora computadora) {
        this.computadoras.add(computadora);
    }

    @Override
    public String toString() {
        String Computadoras_Str = "";
        for (Computadora computadora : this.computadoras) {
            Computadoras_Str += "\n[ "+computadora.toString()+"]";
        }

        return "Orden{" + "idOrden=" + idOrden + ", computadoras=" + Computadoras_Str + '}';
    }

}
