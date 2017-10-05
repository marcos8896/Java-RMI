public class HolaServidor {
  public static void main(String[] args) {
    try {
      HolaImpl objetoRemoto = new HolaImpl("rmi://localhost:1099/hola");
    } catch(Exception e) { }
  }
}