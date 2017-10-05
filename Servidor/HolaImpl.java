import java.rmi.*;

public class HolaImpl 
extends java.rmi.server.UnicastRemoteObject
implements HolaInterfaz {

  public HolaImpl(String nombre) throws java.rmi.RemoteException {
    super();

    try {
      System.out.println("Rebind en objeto remoto: " + nombre);
      java.rmi.Naming.rebind(nombre, this);
    } catch(Exception e) { }

  }

 public String saluda() throws java.rmi.RemoteException {
   return "Hola mundo";
 }

 public String saluda(String nombre) throws java.rmi.RemoteException {
   return "Hola " + nombre + "!";
 }
 

}
