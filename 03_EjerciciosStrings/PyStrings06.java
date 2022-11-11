package pystring06;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PyString06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String l1 = "hola caballo casa";
        String l2 = "teclado cuadro coche";
        
        StringBuilder cadena = new StringBuilder(l1);
        StringBuilder cadena2 = new StringBuilder(l2);
        
        cadena.append(cadena2);
        
        cadena.toString();
        
        System.out.println(cadena);
    }
    
}
