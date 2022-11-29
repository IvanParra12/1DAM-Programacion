package ejercicio43;
import java.text.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pi = 4 * Math.tan(1);
        
        NumberFormat valor = NumberFormat.getInstance();
        valor.setMaximumFractionDigits(4);
        String resultado = valor.format(pi);
        
        System.out.println("Resultado con 4 cifras: "
                +resultado);
    }
    
}
