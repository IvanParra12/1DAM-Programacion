package ejercicio6;
import bpc.daw.mario.*;
import java.util.*;


/**
 *
 * @author Your Name <iparigl784@g.educaand.es>
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Indica la primera coordenada: ");
        int coor1 = new Scanner(System.in).nextInt();
        
        System.out.println("Indica la segunda coordenada: ");
        int coor2 = new Scanner(System.in).nextInt();
        
        Mario m1 = null;
        
        m1 = new Mario(coor1, coor2);
    }
    
}
