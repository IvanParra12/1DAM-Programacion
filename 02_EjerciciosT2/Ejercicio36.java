package ejercicio36;
import java.math.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a)
        double raiz = Math.sqrt(150);
        System.out.println("La raiz cuadrada de 150 es: "
                +raiz);
        
        //b)
        double elevar = Math.pow(2, 9);
        double logaritmo = Math.log(6);
        double div = elevar / logaritmo;
        
        System.out.println("El resultado del apartado b es: "
                + div);
        
        //c)
        double coseno = Math.cos(16);
        
        System.out.println("El coseno de 16 radianes es: "
                + coseno);
        
        //d)
        double angulo = 45.0 * Math.PI/180.0;
        double seno = Math.sin(angulo);
        
        System.out.println("El resultado del apartado d es: "
                + seno);

    }

}
