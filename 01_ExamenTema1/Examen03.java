package examen03;
import java.util.*;
/**
 *
 * @author Iván Darío Parra
 */
public class Examen03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce las horas:");
        int horas = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce los minutos:");
        int minutos = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce los segundos:");
        int segundos = new Scanner(System.in).nextInt();
        
        int converHoras = horas * 3600;
        int converMin = minutos * 60;
        
        int totalSegundos = converHoras + converMin + segundos;
        
        System.out.println("El numero total de segundos es: " +totalSegundos);
    }
    
}
