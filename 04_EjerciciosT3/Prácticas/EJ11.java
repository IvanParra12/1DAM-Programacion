package ej11;
import java.util.*;
import java.math.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class EJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        int cuadrado = 0;
        int cubo = 0;
        
        System.out.println("Introduce un numero entero: ");
        try {
            num = new Scanner(System.in).nextInt();
            for (int cont = 0; cont <= 5; cont++) {
                
                cuadrado = (int) Math.pow(num, 2);
                cubo = (int) Math.pow(num, 3);
                
                if (cont <=5) {
                    System.out.println(num + " ,"+cuadrado + " ,"+cubo);
                    num++;
                } else {
                    cont++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
