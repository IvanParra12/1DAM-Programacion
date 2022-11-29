package ejercicio37;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dime un numero: ");
        int num = new Scanner(System.in).nextInt();
        
        String aBin = Integer.toBinaryString(num);
        String aHex = Integer.toHexString(num);
        
        System.out.println("El numero en Binario es: "
                + aBin+ "\nY en Hexadecimal es: "
                        + aHex);
    }

}
