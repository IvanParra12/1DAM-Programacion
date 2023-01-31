package ejercicio01;
import daw.persona.DNI;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DNI d1 = new DNI(54373785, 't');
        DNI d2 = new DNI("54372784G");
        
        System.out.println(d2.getDNI());
    }

}
