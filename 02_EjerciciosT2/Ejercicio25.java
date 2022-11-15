package ejercicio25;
import java.util.*;
import java.io.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fichero = new File("C:\\Users\\Iván Darío Parra\\Documents\\DAM\\Programación\\frases.txt");
        
        try {
            Scanner contenido = new Scanner(fichero);
            contenido.useDelimiter("\\Z");
            System.out.println(contenido.next());
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
    
}
