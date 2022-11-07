package examen07;

/**
 *
 * @author Iván Darío Parra
 */
public class Examen07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1 = "123";
        String n2 = "69";
        
        int n3 = Integer.parseInt(n1);
        int n4 = Integer.parseInt(n2);

        
        int suma, division, multiplicacion, producto, resto;
        
        suma = n3 + n4;
        division = n3 / n4;
        multiplicacion = n3 * n4;
        resto = n3 % n4;
        producto = n3 * n4;
        
        System.out.println("La suma da: " +suma);
        System.out.println("El producto es: " +producto);
        System.out.println("La division da: " +division);
        System.out.println("La multiplicacion da: " +multiplicacion);
        System.out.println("El resto da: " +resto);

    }
    
}
