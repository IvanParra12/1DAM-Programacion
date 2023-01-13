package ejercicio05;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repetir = true;
        int suma = 0;
        
        System.out.println("Cuantas piezas se pueden cazar hoy?");
        int num = new Scanner(System.in).nextInt();
        
        System.out.println("--Empieza la caza");
        while(repetir) {
            
            System.out.println("Introduzca el numero de piezas cazadas: ");
            int piezas = new Scanner(System.in).nextInt();
            suma += piezas;
            System.out.println("Usted lleva cazadas " +suma+ " piezas"
                    + " de " +num+ " cazadas");
            
            if (piezas >= num || suma >= num) {
                System.out.println("El numero maximo de piezas ha sido "
                        + "excedido");
                repetir = false;
            }
        }
    }

}
