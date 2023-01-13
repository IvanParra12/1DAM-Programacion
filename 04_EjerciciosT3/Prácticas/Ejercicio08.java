package ejercicio08;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repetir = true;
        int cantidad = 0;
        
        System.out.println("Escribe una frase: ");
        String frase = new Scanner(System.in).nextLine();
        
        StringTokenizer a = new StringTokenizer(frase, " ");
        
        while(repetir) {
            
            System.out.println(a.nextToken());
            cantidad++;
            
            if(a.hasMoreTokens() == false) {
                System.out.println("Numero total de palabras encontradas: "
                    +cantidad);
                repetir = false;
            }
        }
    }

}
