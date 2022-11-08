package ejercicio19;
import java.util.*;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File primera = new File(ruta);
        long tamaño = primera.length();
        
        System.out.println("El tamaño de la ruta es: " +tamaño);
    }
    
}
