package ejercicio41;
import java.math.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double op = 0.38*4.93;
        double elevar = Math.pow(op, -0.36);
        double resultado = Math.round(elevar);
        
        System.out.println("El resultado de la operacion es: "
                +resultado);
    }
    
}
