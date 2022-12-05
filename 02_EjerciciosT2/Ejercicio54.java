package ejercicio54;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Apartado a
        ArrayList <String> mensajes = new ArrayList <String> ();
        
        mensajes.add("p1");
        mensajes.add("p2");
        mensajes.add("p3");
        mensajes.add("p4");
        mensajes.add("p5");
        mensajes.add("p6");
        mensajes.add("p7");
        mensajes.add("p8");
        mensajes.add("p9");
        mensajes.add("p10");
        
        //Apartado b
        System.out.println("Llamando al metodo toString: " 
                +mensajes.toString());
        
        //Apartado c
        Collections.sort(mensajes);
        
        //Apartado d
        System.out.println("Llamando al metodo toString: " 
                +mensajes.toString());

    }

}
