import java.io.Reader;
import java.util.Scanner;

  public class AppCafetera {

  public static void main(String[] args) {
      // Crear una cafetera con capacidad máxima de 1000 cc y vacía
      Cafetera miCafetera = new Cafetera();
      
      // Llenar la cafetera
      miCafetera.llenarCafetera();
      
      // Servir una taza de 250 cc
      miCafetera.servirTaza(250);
      
      // Agregar 500 cc de café a la cafetera
      miCafetera.agregarCafe(500);
      
      // Servir otra taza de 350 cc
      miCafetera.servirTaza(350);
      
      // Vaciar la cafetera
      miCafetera.vaciarCafetera();
  }
}
