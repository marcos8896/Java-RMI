import java.rmi.*;
public interface HolaInterfaz extends java.rmi.Remote {
  public String saluda() throws java.rmi.RemoteException;
  public String saluda(String nombre) throws java.rmi.RemoteException;
}