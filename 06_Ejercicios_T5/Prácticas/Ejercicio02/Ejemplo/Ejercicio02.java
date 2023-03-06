package ejercicio02;
import compras.Compras;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compras c = new Compras(20);
        try{
            c.registrarCompra(20);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println(c.toString());
    }

}
