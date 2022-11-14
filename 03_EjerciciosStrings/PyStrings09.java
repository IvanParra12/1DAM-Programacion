package pystrings09;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PyStrings09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce la primera frase: ");
        String cadena = new Scanner(System.in).nextLine();
        
        System.out.println("Introduce la segunda frase: ");
        String cadena2 = new Scanner(System.in).nextLine();
        
        cadena = cadena.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "")
                .replace(".", "")
                .replace(",", "");
        
        cadena2 = cadena2.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "")
                .replace(".", "")
                .replace(",", "");
        
        char[] caracteres = cadena.toCharArray();
        Arrays.sort(caracteres);
        cadena = new String(caracteres);
        
        char[] caracteres2 = cadena2.toCharArray();
        Arrays.sort(caracteres2);
        cadena2 = new String(caracteres2);
     
        
        if (cadena.equals(cadena2)) {
            System.out.println("Las frases son anagramas");
        } else {
            System.out.println("Las frases no son anagramas");
        }
        
        
    }
    
}
