package ejercicio17;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        
        System.out.println("Introduce tu dominio: ");
        String dominio = new Scanner(System.in).nextLine();
        
        if (dominio.endsWith(".es") || dominio.endsWith(".com")) {
            String correo = "@"+dominio;
            String conjunto = nombre+correo;
            System.out.println("Tu correo es: " +conjunto);
        } else {
            System.out.println("El dominio es incorrecto");
        }
        
    }
    
}
