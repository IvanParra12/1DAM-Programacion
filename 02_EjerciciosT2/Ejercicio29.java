package ejercicio29;
import java.util.*;
import bpc.daw.objetos.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Apartado a
        System.out.println("Escribe un numero:" );
        int numero = new Scanner(System.in).nextInt();
        System.out.println("El nombre de la excepción es InputMismatchException");
        
        //Apartado b
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        
        int multi = n1 * n2;
        
        System.out.println("El resultado es: " +multi);
        System.out.println("La excepcion es ArrayIndexOutOfBoundsException");

        //Apartado c
        Caja caja = new Caja("hola");
        String mensaje = caja.getMensaje();
        int longitud = mensaje.length();
        
        System.out.println("Su logintud es de: " +longitud);
        System.out.println("La excepcion es NullPointerException");
    }
    
}
