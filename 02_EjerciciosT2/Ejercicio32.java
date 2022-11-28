package ejercicio32;
import bpc.daw.reproductor.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoMP3 a = new ArchivoMP3("C:\\Users\\Iván Darío Parra\\Documents\\NetBeansProjects\\Tema2\\Death Grips - Get Got.mp3");
        
        
        
        Reproductor repro = new Reproductor(a, false,true);
        repro.play();
        System.out.println("Titulo: " +a.getTitulo()+
                           "\nAutor: " +a.getAutor()+
                           "\nDuración: " +a.getDuracion());
    }

}
