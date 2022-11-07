package ejercicio3;

import bpc.daw.mario.*;

/**
 *
 * @author Your Name <iparigl784@g.educaand.es>
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mario m1 = null;
        Luigi l1 = null;
        Seta s1 = null;
        Planta p1, p2, p3 = null;
        Cañon c1 = null;
        Disparo d1 = null;
        int obj1 = 600, obj2 = 500;        

        
        // Invocando Objetos
        m1 = new Mario(550,500);
        l1 = new Luigi(600,500);
        c1 = new Cañon(850, 500);
        d1 = new Disparo(850, 500, obj1, obj2);
        s1 = new Seta(700, 500);
        p1 = new Planta(400, 500);
        p2 = new Planta(450, 500);
        p3 = new Planta(500, 500);
        
        //Acciones
        s1.andarHacia(0, 0);
        m1.saltar();
        p1.comer(true);
        p2.comer(true);
        p3.comer(true);
        l1.correrHacia(0, 0);

        
    }
    
}
