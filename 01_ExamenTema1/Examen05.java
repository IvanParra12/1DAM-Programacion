package examen05;
import java.util.*;
/**
 *
 * @author Iván Darío Parra
 */
public class Examen05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce el valor:");
        int num = new Scanner(System.in).nextInt();
        
        int incremento = num += 5;
        
        System.out.println("El numero incrementado es: " +incremento);
        
        int decremento = num -= 4;
        
        System.out.println("El numero decrementado es: " +decremento);
        
        int incrementoUni = num++;
        
        System.out.println("El numero incrementado en una unidad es: " +incrementoUni);
        
        int decrementoUni = num--;
        
        System.out.println("El numero decrementado en una unidad es: " +decrementoUni);
    }
    
}
