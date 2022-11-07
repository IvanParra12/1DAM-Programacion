package examen014;

/**
 *
 * @author usuario-mañana
 */
public class Examen014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dinero = 500;
        
        int billete500, billete100, billete50, billete20, billete10, moneda2, moneda1;
        
        billete500 = dinero / 500;
        billete100 = dinero / 100;
        billete50 = dinero / 50;
        billete20 = dinero / 20;
        billete10 = dinero / 10;
        moneda2 = dinero / 2;
        moneda1 = dinero / 1;
        
        System.out.println("El total en billetes de 500 es: " +billete500);
        System.out.println("El total en billetes de 500 es: " +billete100);
        System.out.println("El total en billetes de 500 es: " +billete50);
        System.out.println("El total en billetes de 500 es: " +billete20);
        System.out.println("El total en billetes de 500 es: " +billete10);
        System.out.println("El total en billetes de 500 es: " +moneda2);
        System.out.println("El total en billetes de 500 es: " +moneda1);

        
    }
    
}
