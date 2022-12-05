package ejercicio52;
import java.util.*;
import java.awt.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarando Constantes
        final Color rojo = Color.RED;
        final Color amari = Color.YELLOW;
        final Color verde = Color.GREEN;
        
        //Apartado a
        HashMap <String, Color> mapa = new HashMap <String, Color> ();
        
        //Apartado b
        mapa.put("12535ABC", rojo);
        mapa.put("98525KWX", amari);
        mapa.put("17632MSE", verde);
        mapa.put("85321ABC", amari);
        
        //Apartado c
        System.out.println("El tamaño del map es: "
                    +mapa.size());
        
        //Apartado d
        System.out.println("Llamando al metodo toString: "
                    +mapa.toString());
        
        //Apartado e
        System.out.println("Introduce el numero de matricula: ");
        String matricula = new Scanner(System.in).nextLine();
        
        if (mapa.containsKey(matricula) == true) {
            System.out.println("El color del coche es: "
                    +mapa.get(matricula));
        } else {
            System.out.println("No existe esa matricula");
        }
    }

}
