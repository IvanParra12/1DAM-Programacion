package ejercicio13;
import java.util.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        
        System.out.println("Tu nombre en mayusculas: " +nombre.toUpperCase());
        System.out.println("Tu nombre en mayusculas: " +nombre.toLowerCase());
        System.out.println("Total de caracteres de tu nombre: " +nombre.length());

    }
    
}
