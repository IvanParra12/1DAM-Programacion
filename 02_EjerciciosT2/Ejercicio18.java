package ejercicio18;
import java.util.Scanner;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce tu correo: ");
        String correo = new Scanner(System.in).nextLine();
        
        int corte = correo.indexOf("@");
        int cantidad = correo.length();
        
        String parte1 = correo.substring(0, corte);
        String parte2 = correo.substring(corte+1, cantidad);
        
        System.out.println("Tu nombre de usuario es: "+parte1);
        System.out.println("Tu dominio es: "+parte2);
    }
    
}
