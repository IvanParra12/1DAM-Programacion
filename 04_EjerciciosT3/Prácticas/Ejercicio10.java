package ejercicio10;
import java.io.*;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce la ruta de un archivo .txt: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File archivo = new File(ruta);
        
        try {
            BufferedReader leer = 
                new BufferedReader(new FileReader(archivo));
            while (leer.ready()) {
                System.out.println(leer.readLine());
            }
            leer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
    }

}
