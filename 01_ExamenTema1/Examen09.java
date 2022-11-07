package examen09;
import java.util.Scanner;

/**
 *
 * @author Iván Darío Parra
 */
public class Examen09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce un numero comprendido entre 10 y 56:");
        int num = new Scanner(System.in).nextInt();
        
        if (num >= 10) {
            if (num <= 56) {
                System.out.println("Es correcto");
            } else {
                System.out.println("No es correcto");
            }
        } else {
        System.out.println("No es correcto");        
        }
    }
    
}
