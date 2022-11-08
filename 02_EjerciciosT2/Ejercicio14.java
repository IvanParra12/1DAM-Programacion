package ejercicio14;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe una frase: ");
        String frase = new Scanner(System.in).nextLine();
        
        char mitad = frase.charAt(frase.length()/2);
        
        System.out.println("La letra del medio de la frase es: " +mitad);
    }
    
}
