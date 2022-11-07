package examen04;
import java.util.*;
/**
 *
 * @author usuario-mañana
 */
public class Examen04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce la edad de persona1:");
        int edad1 = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce la edad de persona 2:");
        int edad2 = new Scanner(System.in).nextInt();
        
        boolean mayoresEdad, persona1Mayor;
        
        mayoresEdad = edad1 >= 18 && edad2 >=18;
        persona1Mayor = edad1 > edad2;
        
        System.out.println("Ambas personas son mayores de edad: " +mayoresEdad);
        System.out.println("¿Persona1 es mayor que persona2?: " +persona1Mayor);

    }
    
}
