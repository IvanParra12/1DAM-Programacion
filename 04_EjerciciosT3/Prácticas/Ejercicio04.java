package ejercicio04;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repetir = true;
        
        while(repetir) {
            System.out.println("Eres mayor de edad(si/no)");
            String resp = new Scanner(System.in).nextLine();
            resp = resp.toLowerCase();
            
            if(resp.equals("si")) {
                System.out.println("El usuario es mayor de edad");
                repetir = false;
            } else if (resp.equals("no")) {
                System.out.println("El usuario es menor de edad");
                repetir = false;
            } else {
                System.out.println("No te entiendo");
            }
        }
        
    }

}
