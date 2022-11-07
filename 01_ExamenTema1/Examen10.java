package examen010;
import java.util.*;
/**
 *
 * @author usuario-mañana
 */
public class Examen010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce un valor entero:");
        int num1 = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce el 2 valor entero:");
        int num2 = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce el 3 valor entero:");
        int num3 = new Scanner(System.in).nextInt();
        
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es num1");
            } else {
                System.out.println("El mayor es num3");
            }
        } else if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("El mayor es num2");
            } else {
                System.out.println("El mayor es num3");
            }
        } else if (num1 == num2) {
            if (num1 == num3) {
                System.out.println("Son iguales");
            }
        }
        
    }
    
}
