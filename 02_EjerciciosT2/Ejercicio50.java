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
        ArrayList <String> mensajes = new ArrayList <String> ();
        
        mensajes.add("p1");
        mensajes.add("p2");
        mensajes.add("p3");
        mensajes.add("p4");
        mensajes.add("p5");
        
        System.out.println("Cantidad de palabras en la lista "
                + "despues de borrar un valor: " 
                +mensajes.size());
        System.out.println("Cual es 3 posicion de la lista: "
                +mensajes.get(2));
        System.out.println("Llamando al metodo toString: " 
                +mensajes.toString());
        
        mensajes.remove(0);
        
        System.out.println("Cantidad de palabras en la lista "
                + "despues de borrar un valor: " 
                +mensajes.size());
        System.out.println("Cual es 3 posicion de la lista: "
                +mensajes.get(2));
        System.out.println("Llamando al metodo toString: " 
                +mensajes.toString());
       
    }

}
