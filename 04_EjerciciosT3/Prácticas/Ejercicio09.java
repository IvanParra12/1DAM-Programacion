package ejercicio09;
import java.util.*;
import java.math.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repetir = true;
        double A = 1, S = 1;
        double dif;
        
        System.out.println("Introduce el valor de N: ");
        int N = new Scanner(System.in).nextInt();
        
        while (repetir) {

            S = 0.5 * (A + N/A);
            dif = Math.abs(S - A);
            
            if (dif < 0.000001) {
                System.out.println("La raiz cuadrada aproximada es : "
                        +dif);
                repetir = false;
            } else {
                A = S;
            }
        }
    }

}
