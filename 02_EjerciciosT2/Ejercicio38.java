package ejercicio38;
import java.math.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 1, b = -5, c = 6;
       double s1, s2, resultado;
       
       resultado = Math.sqrt(Math.pow(b, 2)-(4*a*c));
       
       if (resultado > 0) {
           System.out.println("Hay 2 soluciones");
           
           s1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
           s2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
           
           System.out.println("La primera solucion es: " +s1);
           System.out.println("La segunda solucion es: " +s2);
       } else{
           if(resultado == 0) {
               System.out.println("Hay 1 solucion");
               
               s1 = ((-b) - (4 * a * c)) / (2 * a);
               
               System.out.println("La solucion es: " +s1);
           } else {
               System.out.println("No tiene solucion");
           }
       }
    }

}
