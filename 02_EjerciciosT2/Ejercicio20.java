package ejercicio20;
import java.io.File;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File primera = new File(ruta);
        
        if (primera.exists() && primera.isDirectory()) {
           System.out.println("La ruta introducida corresponde a un directorio");
        } else if (primera.isFile()) {
            System.out.println("La ruta introducida es un archivo de tamaño: " +primera.length()+ " bytes\n");
            System.out.println("Desea borrarlo(si/no)?");
            String respuesta = new Scanner(System.in).nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                primera.delete();
            }
            if (primera.exists()) {
                    System.out.println("Se ha producido un error al borrar");
                } else {
                    System.out.println("Se ha borrado correctamente");
                } 
        } else {
                System.out.println("Borrado cancelado");
            }    
            
    }
    
}
