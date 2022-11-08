package ejercicio16;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce la primera frase: ");
        String frase1 = new Scanner(System.in).nextLine();
        
        System.out.println("Introduce la segunda frase: ");
        String frase2 = new Scanner(System.in).nextLine();
        
        System.out.println("La segunda frase esta incluida dentro de la primera?: " +frase1.contains(frase2));
    }
    
}
