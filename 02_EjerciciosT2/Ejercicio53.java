package ejercicio53;
import java.util.*;
import java.awt.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarando Constantes
        final Color rojo = Color.RED;
        final Color amari = Color.YELLOW;
        final Color verde = Color.GREEN;
        
        //Apartado a
        TreeMap <String, Color> mapa = new TreeMap <String, Color>();
        
        //Apartado b
        mapa.put("12535ABC", rojo);
        mapa.put("98525KWX", amari);
        mapa.put("17632MSE", verde);
        mapa.put("85321ABC", amari);
        
        //Apartado c
        System.out.println("El tamaño del TreeMap es: "
                +mapa.size());
        
        //Apartado d
        System.out.println("Llamando al metodo toString: "
                    +mapa.toString());
        
        /*Estructuralmente hay diferencias entre el HashMap y el TreeMap,
        pero en este ejercicio no se aprecia ninguna diferencia
        */
    }

}
