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
        System.out.println("Escribe la primera frase: ");
        String l1 = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe la primera frase: ");
        String l2 = new Scanner(System.in).nextLine();
        
        String conjunto = l1+ " " +l2;
        
        System.out.println(conjunto);
    }
    
}
