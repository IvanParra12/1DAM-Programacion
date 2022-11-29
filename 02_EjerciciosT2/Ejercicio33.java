package ejercicio33;
import bpc.daw.reproductor.*;


/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArchivoMP3 a = new ArchivoMP3("C:\\Users\\Iván Darío Parra\\Documents\\NetBeansProjects\\Tema2\\Death Grips - Get Got.mp3");
      ArchivoMP3 a2 = new ArchivoMP3("C:\\Users\\Iván Darío Parra\\Documents\\NetBeansProjects\\Tema2\\Bruno_Mars_Locked_out_of_Heaven.mp3");
      ArchivoMP3 a3 = new ArchivoMP3("C:\\Users\\Iván Darío Parra\\Documents\\NetBeansProjects\\Tema2\\Work Drugs - License to Drive.mp3");
      ArchivoMP3 [] varias = {a, a2, a3};
      
      PlayList lista = new PlayList();
      
      lista.setTitulo("Lista de Ejemplo");
      lista.añadirVarias(varias);
      
      try{
        lista.guardar("C:\\Users\\Iván Darío Parra\\Documents\\lista.txt");
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
      
      Reproductor repro = new Reproductor(lista, true,true);
      repro.play();
      
    }

}
