package ejercicio08;
import daw.empresa.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programador p = new Programador("Pedro", 1200, 
                54372784, 'E', 90);
        p.aprenderLenguaje("Java", "Hola Mundo");
        System.out.println(p.programarHolaMundo("Java"));
        System.out.println(p);
    }

}
