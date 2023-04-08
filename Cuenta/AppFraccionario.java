import java.io.Reader;
import java.util.Scanner;

public class AppFraccionario {
  public static void main(String[] args) {
      Fraccionario f1 = new Fraccionario(1, 2);
      Fraccionario f2 = new Fraccionario(3, 4);
      
      Fraccionario suma = f1.sumar(f2);
      Fraccionario resta = f1.restar(f2);
      Fraccionario multiplicacion = f1.multiplicar(f2);
      Fraccionario division = f1.dividir(f2);
      
      System.out.println("f1: " + f1);
      System.out.println("f2: " + f2);
      System.out.println("Suma: " + suma);
      System.out.println("Resta: " + resta);
      System.out.println("Multiplicación: " + multiplicacion);
      System.out.println("División: " + division);
  }
}