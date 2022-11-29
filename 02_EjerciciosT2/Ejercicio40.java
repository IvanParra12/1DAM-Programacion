package ejercicio40;
import java.lang.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Runtime r = Runtime.getRuntime();
       int cpu = r.availableProcessors();
       long ram = r.totalMemory();
       
       System.out.println("Cantidad de procesadores: "
                    +cpu+ "\nCantidad de memoria total "
                            + "asociada a Java: "
                            +ram+ " bytes");
    }

}
