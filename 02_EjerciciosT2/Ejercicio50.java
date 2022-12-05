package ejercicio50;
import java.util.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> lista = new ArrayList <String> ();
        
        lista.add("p1");
        lista.add("p2");
        lista.add("p3");
        lista.add("p4");
        lista.add("p5");
        
        System.out.println("Cantidad de palabras en la lista "
                + "despues de borrar un valor: " 
                +lista.size());
        System.out.println("Cual es 3 posicion de la lista: "
                +lista.get(2));
        System.out.println("Llamando al metodo toString: " 
                +lista.toString());
        
        lista.remove(0);
        
        System.out.println("Cantidad de palabras en la lista "
                + "despues de borrar un valor: " 
                +lista.size());
        System.out.println("Cual es 3 posicion de la lista: "
                +lista.get(2));
        System.out.println("Llamando al metodo toString: " 
                +lista.toString());
       
    }

}
