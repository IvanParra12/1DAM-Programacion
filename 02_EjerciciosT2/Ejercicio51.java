package ejercicio51;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> mensajes = new HashSet<String>();
        
        //Apartado a
        mensajes.add("silla");
        mensajes.add("mesa");
        mensajes.add("niño");
        mensajes.add("mesa");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("lapiz");
        
        //Apartado b
        System.out.println("Tamaño de la lista: "
                +mensajes.size());
        
        //Apartado c
        System.out.println("Llamando al metodo toString: "
                +mensajes.toString());
    }

}
