package pystrings01;
import java.util.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PyStrings01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe una frase:");    
        String cadena=new Scanner(System.in).nextLine();
        
        String espacios=cadena.trim();
        int pos=cadena.indexOf(espacios);
        String prim_espacios=cadena.substring(pos);
       
        System.out.println(prim_espacios);
    }
    
}
