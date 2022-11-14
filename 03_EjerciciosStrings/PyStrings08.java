package pystrings08;
import java.util.Scanner;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PyStrings08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe tu segundo nombre: ");
        String nombre2 = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe tu apellido: ");
        String ape = new Scanner(System.in).nextLine();
        
        char n1, n2 = 0;
        
        n1 = nombre.charAt(0);
        n2 = nombre.charAt(0);
        
        System.out.println(ape+ ", " +n1+"."+n2);
    }
    
}
