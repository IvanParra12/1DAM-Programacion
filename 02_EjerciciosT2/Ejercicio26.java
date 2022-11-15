package ejercicio26;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿cuántos segundos quiere esperar?:");
        int seg = new Scanner(System.in).nextInt();
        
        try {
            seg = seg * 1000;
            Thread.sleep(seg);
            System.out.println("Programa finalizado");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
    
}
