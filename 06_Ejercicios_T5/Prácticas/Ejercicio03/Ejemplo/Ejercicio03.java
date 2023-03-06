package ejercicio03;
import daw.figuras.Rectangulo;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(3,5);
        
        r.setBase(4);
        r.setAltura(4);
        System.out.println(r.getArea());
        System.out.println(r);
    }

}
