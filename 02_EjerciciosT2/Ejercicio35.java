package ejercicio35;
import bpc.daw.reproductor.*;


/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoMP3 a = new ArchivoMP3("C:\\Users\\Iván Darío Parra"
                + "\\Documents\\NetBeansProjects"
                + "\\Tema2\\Death Grips - Get Got.mp3");
        
        ArchivoMP3 b = new ArchivoMP3("C:\\Users\\Iván Darío Parra"
                + "\\Documents\\NetBeansProjects"
                + "\\Tema2\\Death Grips - Get Got.mp3");
        
        boolean primero = a==b;
        boolean segundo = a.equals(b);
        int tercero = a.hashCode();
        int cuarto = b.hashCode();
        boolean quinto = tercero == cuarto;

        //Apartado a)        
        System.out.println("Usando ==: " +primero);
        System.out.println("Usando equals: " +segundo);
        System.out.println("Hashcode de a: " +tercero+
                " ," + "\nHashcode de b: " +cuarto+
                " ," + "\nSon iguales?: " +quinto);
        
        //Apartado b)        
        Reproductor repro = new Reproductor(a, true, true);
        String cambio = repro.toString();
        
        System.out.println(cambio);
        //Aparece el nombre del paquete y de la variable con numeros
        
        //Apartado c)        
        ArchivoMP3 c = new ArchivoMP3("C:\\Users\\Iván Darío Parra"
                + "\\Documents\\NetBeansProjects"
                + "\\Tema2\\Death Grips - Get Got.mp3");
        String cambio2 = c.toString();
        
        System.out.println(cambio2);
        /*Pone 'Get got', no tiene el mismo formato porque
        creo que la clase ArchivoMP3 tiene reprogramado
        el metodo toString
        */
    }

}
