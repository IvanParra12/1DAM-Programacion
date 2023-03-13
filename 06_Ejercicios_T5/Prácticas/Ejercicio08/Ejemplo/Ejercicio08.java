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
        Trabajador t = new Trabajador("Antonio", 1200,
                54372785, 'T');
        System.out.println(t);
        
        TrabajadorTecleante tc = new TrabajadorTecleante("Javier", 1500, 
                54372786, 'W', 85);
        System.out.println(tc);
        
        Administrativo a = new Administrativo("Angel", 1500, 
                54372787, 'O', 100);
        a.escribirInforme("Prueba");
        System.out.println(a);
        
        Programador p = new Programador("Pedro", 1200, 
                54372784, 'E', 90);
        p.aprenderLenguaje("Java", "Hola Mundo");
        
        System.out.println(p);
        System.out.println(p.programarHolaMundo("Java"));
    }

}
