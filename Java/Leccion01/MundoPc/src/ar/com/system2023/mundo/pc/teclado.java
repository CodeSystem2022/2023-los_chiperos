package ar.com.system.mundopc;

public class Teclado extends DispositivoEntrada {
  private final int idTeclado;
  private static int contadorteclados;
  public static int contadorteclados;
  
  public Teclado(String TipoEntrada, String marca){
    super(tipoEntrada, marca);
    this.idTeclado = ++Teclado.contadorTeclados;
  }
  @Override
  public String toString(){
    
    return "Teclado{" + "idTeclado=" + idTeclado +", "+super.toString()+'};
    
  }
}
