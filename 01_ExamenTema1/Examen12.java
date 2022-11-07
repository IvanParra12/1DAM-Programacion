package examen012;
import java.util.*;
/**
 *
 * @author usuario-mañana
 */
public class Examen012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce la edad:");
        int edad = new Scanner(System.in).nextInt();
        
        boolean comprobacion;
        comprobacion = edad >=18? true:false;
        
        System.out.println("Es mayor de edad?: " +comprobacion);
    }
    
}
