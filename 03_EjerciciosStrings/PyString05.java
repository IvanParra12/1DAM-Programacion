package pystring05;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PyString05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce una frase palindromo: ");
        String cadena = new Scanner(System.in).nextLine();
        cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
        
        String invertida = new StringBuilder(cadena).reverse().toString();
        

        if (invertida.equals(cadena)) {
           System.out.println("Es una frase palindromo");
        } else {
            System.out.println("No es una frase palindromo");
        }
        
    }
    
}
