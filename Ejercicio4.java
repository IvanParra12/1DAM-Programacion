package ejercicio4;

import bpc.daw.mario.*;

/**
 *
 * @author Your Name <iparigl784@g.educaand.es>
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mario m1 = null;
        Luigi l1 = null;
        
        l1 = new Luigi(900,500);
        m1 = new Mario(950, 500);
        
        double distanciaLX = l1.getX();
        double distanciaLY = l1.getY();

        double distanciaMX = m1.getX();
        double distanciaMY = m1.getY();

        
        
        System.out.println("Mario está en las coordenadas: " +distanciaMX+ " ," +distanciaMY);
        System.out.println("Luigi está en las coordenadas: " +distanciaLX+ " ," +distanciaMY);


    }
    
}
