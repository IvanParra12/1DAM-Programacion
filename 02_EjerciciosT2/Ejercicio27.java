package ejercicio27;
import java.util.*;
import java.net.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dime una direccion IP:");
        String ip = new Scanner(System.in).nextLine();
        
        System.out.println("Escriba el tiempo de timeout"
                + "(en milisegundos): ");
        int mili = new Scanner(System.in).nextInt();
                
        try {
            InetAddress ip1 = InetAddress.getByName(ip);
            System.out.println("Haciendo ping a: " 
                    +ip+"..."+ip1.isReachable(mili));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
    
}
