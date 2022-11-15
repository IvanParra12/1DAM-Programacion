package ejercicio24;
import java.io.*;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dime una frase: ");
        String frase1 = new Scanner(System.in).nextLine();
        
        System.out.println("Dime otra frase: ");
        String frase2 = new Scanner(System.in).nextLine();
        
        
        try {
            PrintWriter fichero = new PrintWriter(""
                    + "C:\\Users\\Iván Darío Parra\\Documents\\DAM\\Programación\\frases.txt");
            fichero.println(frase1);
            fichero.println(frase2);
            fichero.close();
        } catch(FileNotFoundException permisos) {
            System.out.println(permisos.getMessage());
        }
        
    }
    
}
