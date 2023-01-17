package ejercicio12;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repetir = true;
        int pablo, pedro, paco ,media;

        while(repetir) {
            System.out.println("Cual es la nota de pablo: ");
            pablo  = new Scanner(System.in).nextInt();
            
            System.out.println("Cual es la nota de pedro: ");
            pedro = new Scanner(System.in).nextInt();
            
            System.out.println("Cual es la nota de paco: ");
            paco = new Scanner(System.in).nextInt();
            
            if(pablo == -1 || pedro == -1 || paco == -1) {
                if(pablo > pedro) {
                    if(pablo > paco) {
                        System.out.println("Pablo tiene la mayor nota :"
                                +pablo);
                    } else {
                        System.out.println("Paco tiene la mayor nota :"
                                +paco);
                    }
                } else if(pedro > paco) {
                    System.out.println("Pedro tiene la mayor nota :"
                            +pedro);
                } else {
                    System.out.println("Paco tiene la mayor nota :"
                            +paco);
                } if(pablo < pedro) {
                    if(pablo < paco) {
                        System.out.println("Pablo tiene la menor nota :"
                                +pablo);
                    } else {
                        System.out.println("Paco tiene la menor nota :"
                                +paco);
                    }
                } else if(pedro < paco) {
                    System.out.println("Pedro tiene la menor nota :"
                            +pedro);
                } else {
                    System.out.println("Paco tiene la menor nota :"
                            +paco);
                }
                media = (pablo + pedro + paco) / 3;
                System.out.println("La media es de un : " +media);
                repetir = false;
            }               
        }
    }

}
