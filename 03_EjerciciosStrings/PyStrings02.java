package pystrings02;
import java.util.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PyStrings02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce un maximo de 50 caracteres: ");
        String cadena = new Scanner(System.in).nextLine();
        
        if (cadena.length() > 50) {
            System.out.println("Error, solo se permiten un total de 50 caracteres.");
        } else {
            System.out.println(cadena.replaceAll("\\s", ""));
        }
        
    }
    
}
