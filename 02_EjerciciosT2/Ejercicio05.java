package ejercicio5;
import bpc.daw.mario.*;

/**
 *
 * @author Your Name <iparigl784@g.educaand.es>
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cañon c1, c2 = null;
        
        c1 = new Cañon(400,500);
        c2 = new Cañon(600, 650);
        
        c1.disparar(0, 60);
        c1.disparar(0, 50);
        
        c2.disparar(0, 60);
        c2.disparar(10, 70);
        c2.disparar(20, 80);
        
        int cañon1 = c1.getTotalDisparosRealizados();
        int cañon2 = c2.getTotalDisparosRealizados();

        System.out.println("El cañon 1 ha disparado un total de: " +cañon1+ "veces");
        System.out.println("El cañon 2 ha disparado un total de: " +cañon2+ "veces");

        
    }
    
}
