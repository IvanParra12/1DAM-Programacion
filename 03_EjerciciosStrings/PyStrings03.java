package pystrings03;
import java.util.Scanner;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PyStrings03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce una frase para traducirla a latin: ");
        String cadena = new Scanner(System.in).nextLine();
        
        char vocalA = 'a';
        char vocalE = 'e';
        char vocalI = 'i';
        char vocalO = 'o';
        char vocalU = 'u';

        int posFinal = cadena.length()-1; //Restas uno para obtener el índice del ultimo caracter
        char caracterFinal = cadena.charAt(posFinal);//obtienes el carácter de dicha posición
        
        if (caracterFinal == vocalA) {
            System.out.println(cadena.substring(0, cadena.length()-1) + "us");
        } else if (caracterFinal == vocalE) {
            System.out.println(cadena.substring(0, cadena.length()-1) + "us");
        } else if (caracterFinal == vocalI) {
            System.out.println(cadena.substring(0, cadena.length()-1) + "us");
        } else if (caracterFinal == vocalO) {
            System.out.println(cadena.substring(0, cadena.length()-1) + "us");
        } else if (caracterFinal == vocalU) {
            System.out.println(cadena.substring(0, cadena.length()-1) + "us");
        } else {
            System.out.println(cadena + "us");
        }
    }
    
}
