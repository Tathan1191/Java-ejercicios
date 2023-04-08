import java.io.Reader;
import java.util.Scanner;

  public class AppCuenta {

        public static void main(String[] args) throws Exception { 
            
                Cuenta miCuenta = new Cuenta(100001, "123", 10000, 0.14f);
                Scanner leer = new Scanner(System.in);

                int menu = 0;
                float valor = 0;

              do {

                     valor = miCuenta.getSaldoActual();
                     System.out.print("miCuenta " + miCuenta.getIdCliente ());
                     System.out.println(" tiene saldo: " + valor);
                     System.out.println("1. Calcular interes diario");
                     System.out.println("2. Consignar");
                     System.out.println("3. Retirar");
                     System.out.println("0. Salir");
                     System.out.print("Digitar la opcion: ");

                     menu = leer.nextInt();

                    switch (menu) {
                            case 1:
                                    miCuenta.actualizarSaldo();
                                    break;

                            case 2: 
                                    System.out.println("Digite el valor a consignar ");;
                                    valor = leer.nextInt ();
                                    miCuenta.ingresar(valor);
                                    break;

                            case 3: 
                                    System.out.println("Digite el valor a retirar ");
                                    valor = leer.nextInt ();
                                    miCuenta.retirar(valor);
                                    break;  
                                    
                            case 0: 
                                    System.exit(0);       

                    }

              } while (menu !=0);
          }

}
