package ar.com.system2023.mundo.pc;

public class Teclado extends DispositivoEntrada {
  private final int idTeclado;
  private static int contadorteclados;
  
  public Teclado(String TipoEntrada, String marca){
    super(TipoEntrada, marca);
    this.idTeclado = ++Teclado.contadorteclados;
  }

  @Override
  public String toString() {
    return "Teclado{" +
            "idTeclado=" + idTeclado + ", "+super.toString()+
            '}';
  }
}
