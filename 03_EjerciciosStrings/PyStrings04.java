package pystrings04;
import java.util.*;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PyStrings04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce una frase (max 5 caracteres) para representarla en ASCII: ");
        String cadena = new Scanner(System.in).nextLine();
        
        System.out.println("Introduce un numero: ");
        int numero = new Scanner(System.in).nextInt();
        
        byte [] bytes = cadena.getBytes(StandardCharsets.US_ASCII);
        
        if (cadena.length() > 5) {
            System.out.println("Escribe una frase mas corta");
        } else {
           System.out.println("primer caracter en ASCII: "+bytes[0]+numero);
           System.out.println("segundo caracter en ASCII: "+bytes[1]+numero);
           System.out.println("tercer caracter en ASCII: "+bytes[2]+numero);
           System.out.println("cuarto caracter en ASCII: "+bytes[3]+numero);
           System.out.println("quinto caracter en ASCII: "+bytes[4]+numero);
        }
    }
    
}
