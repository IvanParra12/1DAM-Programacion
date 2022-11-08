package ejercicio11;
import bpc.daw.objetos.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1, c2 = null;
        
        String m1 = "Hola";
        String m2 = "Adios";
                
        c1 = new Caja(m1);
        c2 = new Caja(m2);
        
        c1.abrirCaja();
        c2.abrirCaja();
        
        System.out.println("C1 dice: " +c1.getMensaje());
        System.out.println("C2 dice: " +c2.getMensaje());
        
        c1.cambiarMensaje(m2);
        c2.cambiarMensaje(m1);
        
        System.out.println("C1 dice: " +c1.getMensaje());
        System.out.println("C2 dice: " +c2.getMensaje());
        
    }
    
}
