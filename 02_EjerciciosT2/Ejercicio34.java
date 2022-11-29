package ejercicio34;
import bpc.daw.reproductor.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            PlayList lista = new PlayList("C:\\Users\\Iván Darío Parra"
                    + "\\Documents\\lista.txt");
            Reproductor repro = new Reproductor(lista, true,true);
            repro.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }

}
