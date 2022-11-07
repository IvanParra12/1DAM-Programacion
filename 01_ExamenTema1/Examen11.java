package examen011;

/**
 *
 * @author Iván Darío Parra
 */
public class Examen011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anio = 2024;
        int cond1 = 400;
        int cond2 = 4;
        int cond3 = 100;
        
        int resto1 = anio % cond1;
        int resto2 = anio % cond2;
        int resto3 = anio % cond3;
        
        if (resto1 == 0) {
            System.out.println("Es bisiesto");
        } else if (resto1 != 0) {
            if (resto2 == 0) {
                if(resto3 != 0) {
                    System.out.println("Es bisiesto");
                } 
            } else {
                System.out.println("No es bisiesto");
            }
        }  
        
    }
    
}
