package ejercicio21;
import java.io.File;
import java.util.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe la ruta de directorio: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File primera = new File(ruta);
        
        if (primera.isDirectory() == false) {
            System.out.println("No es un directorio");
        } else {
            File[] ficheros = primera.listFiles();
            System.out.println("Total de archivos y carpetas que contiene: "
                    +ficheros.length);
        }
        }
    }
    


