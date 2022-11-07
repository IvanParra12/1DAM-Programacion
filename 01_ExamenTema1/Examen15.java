package examen015;

/**
 *
 * @author usuario-mañana
 */
public class Examen015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean x, y, z, op1, op2, op3;
        
        x = true;
        y = false;
        z = true;
        
        op1 = x || y || x && !z && !y;
        op2 = (x || !y) && (!x || z);
        op3 = !x || !z || z && x && !y;
        
        System.out.println("El valor de op1 es: " +op1);
        System.out.println("El valor de op2 es: " +op2);
        System.out.println("El valor de op3 es: " +op3);

    }
    
}
