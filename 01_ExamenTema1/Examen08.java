package examen08;

/**
 *
 * @author usuario-mañana
 */
public class Examen08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] vocales = {"a", "e", "i", "o", "u"};
        double [] decimales = {23.5, 25.2, 27.9, 3.4, 2.3};
        String [] lenguajes = {"java", "JavaScript", "C++", "Ruby", "C#"};
        
        System.out.println(vocales[4]);
        System.out.println(decimales[4]);
        System.out.println(lenguajes[4]);
        
        lenguajes[0] = "Python";
        System.out.println(lenguajes[0]);


    }
    
}
