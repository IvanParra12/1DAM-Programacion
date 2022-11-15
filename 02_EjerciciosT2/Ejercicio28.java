package ejercicio28;
import java.util.*;
import java.net.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca un nombre de equipo: ");
        String direccion = new Scanner(System.in).nextLine();
        
        try {
            InetAddress ip1 = InetAddress.getByName(direccion);
            System.out.println("La IP de " +direccion+ " es: " +ip1.getHostAddress());
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
    
}
