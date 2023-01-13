package ejercicio01;
import bpc.daw.reproductor.*;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoMP3 c1 = new ArchivoMP3("C:\\Users\\Iván Darío Parra"
                + "\\Documents\\NetBeansProjects\\Tema3\\Musica"
                + "\\Bruno Mars - 24K Magic.mp3");
        ArchivoMP3 c2 = new ArchivoMP3("C:\\Users\\Iván Darío Parra"
                + "\\Documents\\NetBeansProjects\\Tema3\\Musica"
                + "\\Bruno Mars - Locked Out Of Heaven.mp3");
        ArchivoMP3 c3 = new ArchivoMP3("C:\\Users\\Iván Darío Parra"
                + "\\Documents\\NetBeansProjects\\Tema3\\Musica"
                + "\\Michael Jackson - Thriller.mp3");
        ArchivoMP3 c4 = new ArchivoMP3("C:\\Users\\Iván Darío Parra"
                + "\\Documents\\NetBeansProjects\\Tema3\\Musica"
                + "\\Queen - Don't Stop Me Now.mp3");
        ArchivoMP3 c5 = new ArchivoMP3("C:\\Users\\Iván Darío Parra"
                + "\\Documents\\NetBeansProjects\\Tema3\\Musica"
                + "\\Queen - Killer Queen.mp3");
        
        
        System.out.println("1 - Bruno Mars - 24K Magic.mp3");
        System.out.println("2 - Bruno Mars - Locked out of heaven.mp3");
        System.out.println("3 - Michael Jackson - Thriller.mp3");
        System.out.println("4 - Queen - Don't Stop Me Now.mp3");
        System.out.println("5 - Queen - Killer Queen.mp3");
        
        System.out.println("\nElige una cancion: ");
        int num = new Scanner(System.in).nextInt();
        
        switch(num) {
            case 1: 
                System.out.println("Se está reproduciendo 24K Magic de "
                        + "Bruno Mars");
                Reproductor repro1 = new Reproductor(c1,
                        false, true);
                repro1.play();
                break;
            case 2:
               System.out.println("Se está reproduciendo "
                       + "Locked out of heaven de "
                        + "Bruno Mars");
                Reproductor repro2 = new Reproductor(c2,
                        false, true);
                repro2.play();
                break;
            case 3:
                System.out.println("Se está reproduciendo Thriller de "
                        + "Michael Jackson");
                Reproductor repro3 = new Reproductor(c3,
                        false, true);
                repro3.play();
                break;
            case 4:
                System.out.println("Se está reproduciendo Don't Stop Me Now de "
                        + "Queen");
                Reproductor repro4 = new Reproductor(c4,
                        false, true);
                repro4.play();
                break;
            case 5:
                System.out.println("Se está reproduciendo Killer Queen de "
                        + "Queen");
                Reproductor repro5 = new Reproductor(c5,
                        false, true);
                repro5.play();
                break;
        }
        
        

    }

}
