package examen06;
import java.lang.*;
/**
 *
 * @author Iván Darío Parra
 */
public class Examen06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo1, tipo2, tipo3, tipo4, tipo5;
        
        tipo1 = 49;
        tipo2 = 50;
        tipo3 = 51;
        tipo4 = 52;
        tipo5 = 53;
        
        System.out.println("El valor de tipo1 es: " +tipo1);
        System.out.println("El valor de tipo2 es: " +tipo2);
        System.out.println("El valor de tipo3 es: " +tipo3);
        System.out.println("El valor de tipo4 es: " +tipo4);
        System.out.println("El valor de tipo5 es: " +tipo5);
        
        double ej1 = 15.4;
        int castTipo1 = (int) ej1;        
        System.out.println("El valor de tipo1 es: " +castTipo1);
        
        int ej2 = 48;
        byte castTipo2 = (byte) ej2;
        System.out.println("El valor de tipo2 es: " +castTipo2);

        long ej3 = 49;
        short castTipo3 = (short) ej3;
        System.out.println("El valor de tipo2 es: " +castTipo3);
        


    }
    
}
