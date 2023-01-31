package ejercicio02;
import daw.objetos.Caja;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caja c1 = new Caja("Hola");
        Caja c2 = new Caja(true, "hola");
        Caja c3 = new Caja();
        
        System.out.println(c1.getMensaje());
        System.out.println(c3.getEstado());
    }

}
