package ejercicio23;
import daw.zoo.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Leon l1 = new Leon("Alfredo", 10);
        Tigre t1 = new Tigre("Pepe", 10);
        
        TransporteAnimales ta = new TransporteAnimales();
        System.out.println(ta.comprobarDisponibilidadPlaza(l1));
        ta.añadir(l1);
        
        System.out.println(ta.comprobarDisponibilidadPlaza(t1));


    }
}
