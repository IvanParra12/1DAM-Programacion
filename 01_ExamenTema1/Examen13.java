package examen013;
import java.util.*;
import java.math.*;
/**
 *
 * @author Iván Darío Parra
 */
public class Examen013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double pi = 3.14;
        
        System.out.println("Introduce el radio: ");
        double r = new Scanner (System.in).nextDouble();
        r = Math.pow(r, 2);
        
        double area = pi * r;
        
        System.out.println("El area del circulo es: " +area);
        
    }
    
}
