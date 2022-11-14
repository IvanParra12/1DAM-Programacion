package pystrings03;
import java.util.Scanner;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PyStrings03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce una frase para traducirla a latin: ");
        String cadena = new Scanner(System.in).nextLine();
        
        boolean vocal = cadena.endsWith("a") || cadena.endsWith("e") ||
                        cadena.endsWith("i") || cadena.endsWith("o") ||
                        cadena.endsWith("u");
              
        if (vocal == true) {
            System.out.println(cadena.substring(0, cadena.length()-1) + "us");
        } else {
            System.out.println(cadena + "us");
        }
    }
    
}
