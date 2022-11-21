package ejercicio1;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Elige una cancion: ");
        int num = new Scanner(System.in).nextInt();
        
        System.out.println("1 - Kemba Walker");
        System.out.println("2 - Locked out of heaven");
        System.out.println("3 - FEEL ME??");
        System.out.println("4 - La nueva y la Ex");
        System.out.println("5 - Wait a Minute!");
        
        switch(num) {
            case 1:
                System.out.println("Se esta reproduciendo: Kemba Walker");
                break;
            case 2:
                System.out.println("Se esta reproduciendo: Locked out of "
                        + "heaven");
                break;
            case 3:
                System.out.println("Se esta reproduciendo: FEEL ME??");
                break;
            case 4: 
                System.out.println("Se esta reproduciendo: La nueva y la Ex");
                break;
            case 5:
                System.out.println("Se esta reproduciendo: Wait a Minute!");
                break;
        }
    }

}
