package ejclase1;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class EjClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        boolean a = true;
        ArrayList<String> lista = new ArrayList<String>();
        
        System.out.println("Escribe 5 nombres");
        
        while (a) {
            if (contador == 5) {
                System.out.println(lista);
                a = false;
            } else {                
                String nom = new Scanner(System.in).nextLine();
                lista.add(nom);
                contador++;
            }
        }
        
    }

}
