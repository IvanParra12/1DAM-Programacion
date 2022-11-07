package ejercicio07;
import bpc.daw.objetos.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DepositoAgua deposito = null;
        
        deposito = new DepositoAgua(15, 50);
        
        deposito.dibujar();
        
        double capacidad = (50 * 15) / 100;
        
        System.out.println("La ocupacion del deposito es de un: " +capacidad+ " %");
        
    }
    
}
