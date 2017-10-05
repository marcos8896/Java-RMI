public class HolaServidor {
  public static void main(String[] args) {
    try {
      HolaImpl objRemoto = new HolaImpl("rmi://localhost:2002/saluda");
    } catch(Exception e) { }
  }
}