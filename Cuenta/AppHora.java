
import java.io.Reader;
import java.util.Scanner;



public class AppHora {
    
  
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese una hora en formato HH:MM:SS: ");
        String horaStr = scanner.nextLine();

        
        String[] partesHora = horaStr.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);
        int segundos = Integer.parseInt(partesHora[2]);

        
        Hora horaUsuario = new Hora(horas, minutos, segundos);

        
        int segundosFaltantes = 24 * 3600 - horaUsuario.aSegundos();

        
        System.out.printf("Faltan %d segundos para la medianoche.\n", segundosFaltantes);
    }
}
