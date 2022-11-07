package ejercicio09;
import bpc.daw.objetos.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1 = null;
        
        String m1 = "Bienvenidos al instituto";
        c1 = new Caja(m1);
        
        System.out.println("El mensaje con la caja cerrada es: " +c1.getMensaje());
        
        c1.abrirCaja();
        
        System.out.println("El mensaje con la caja abierta es: " +c1.getMensaje());
        
    }
    
}
