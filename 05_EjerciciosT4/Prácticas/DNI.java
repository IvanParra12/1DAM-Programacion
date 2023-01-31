package daw.persona;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class DNI {
    //ATRIBUTOS
    private int numero;
    private char letra;
    private String completo;
    
    //CONSTRUCTORES
    public DNI(int n, char l) {
        numero = n;
        letra = l;
    };
    
    public DNI(String dni) {
        completo = dni;
        String num = dni.substring(0,7);
        numero = Integer.parseInt(num);
        letra = dni.charAt(dni.length()-1);
        
    }
    
    //GETTERS
    public String getDNI() {
       return completo;
    };
}
