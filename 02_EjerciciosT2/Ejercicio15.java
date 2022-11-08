package ejercicio15;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave = "1234";
        
        System.out.println("Introduce la contraseña: ");
        String passwd = new Scanner(System.in).nextLine();
        
        System.out.println("Es correcto?: " +clave.equals(passwd));
    }
    
}
