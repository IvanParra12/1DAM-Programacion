package ejercicio03;
import java.math.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repetir = true;

        while(repetir) {
            int num = (int)(Math.random()*10+1);
            System.out.println(num);
            if(num == 10) {
                repetir = false;
            }
        }
    }

}
