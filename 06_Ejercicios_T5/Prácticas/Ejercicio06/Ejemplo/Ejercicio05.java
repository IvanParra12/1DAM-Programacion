package ejercicio05;
import daw.ciudad.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Edificio e = new Edificio("Prueba", 3);
        
        System.out.println(e);
        
        Rascacielos r = new Rascacielos("Prueba", 3, 1);
        
        System.out.println(r);
        
        Hotel h = new Hotel("Prueba", 2,2);
        h.añadirCliente("Juan");
        h.añadirCliente("Pedro");
        
        System.out.println(h);
        
        CasaRural c = new CasaRural("Prueba");
        
        System.out.println(c);
    }

}
