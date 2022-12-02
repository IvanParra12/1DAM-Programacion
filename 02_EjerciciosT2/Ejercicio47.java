package ejercicio47;
import java.util.*;
import java.awt.*;
import java.io.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dime la ruta de un archivo:");
        String ruta = new Scanner(System.in).nextLine();
        
        File archivo = new File(ruta);
        Desktop obj = Desktop.getDesktop();
        
        try{
            obj.open(archivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
