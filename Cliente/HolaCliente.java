public class HolaCliente {

    public static void main(String[] args) {

        try {
          HolaInterfaz objRemoto = (HolaInterfaz) java.rmi.Naming.lookup("rmi://localhost:2002/saluda");
            System.out.println(objRemoto.saluda("Marcos"));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
        }
    }
}