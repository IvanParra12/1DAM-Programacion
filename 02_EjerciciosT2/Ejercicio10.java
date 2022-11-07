package ejercicio10;
import bpc.daw.objetos.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1 = null;
        
        String m1 = "Bienvenidos a 1DAM";
        String m2 = "No sois Bienvenidos a 1DAM";

        c1 = new Caja(m1);
        
        c1.abrirCaja();
        
        System.out.println("El mensaje de la caja es: " +c1.getMensaje());
        
        c1.cambiarMensaje(m2);
        
        System.out.println("El mensaje de la caja es: " +c1.getMensaje());

    }
    
}
