package ejercicio01;
import daw.sorteo.Sorteo;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sorteo s = new Sorteo(5, 1);
        s.registrarPago();
        s.apuntarNuevoParticipante();
        s.registrarPago();
        System.out.println(s.toString());
    }

}
