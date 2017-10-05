import java.rmi.*;
public interface HolaInterfaz extends java.rmi.Remote {
  public String salida() throws java.rmi.RemoteException;
  public String salida(String nombre) throws java.rmi.RemoteException;
}