package ejercicio31;
import bpc.daw.reproductor.*;
import bpc.daw.musica.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c1 = new Cancion("EJ31");
        
        NotaMusical n1 = new NotaMusical(0,2);
        NotaMusical n2 = new NotaMusical(0,2);
        NotaMusical n3 = new NotaMusical(4,2);
        NotaMusical n4 = new NotaMusical(4,2);
        NotaMusical n5 = new NotaMusical(5,2);
        NotaMusical n6 = new NotaMusical(5,2);
        NotaMusical n7 = new NotaMusical(4,1);
        NotaMusical n8 = new NotaMusical(3,3);
        NotaMusical n9 = new NotaMusical(3,3);
        NotaMusical n10 = new NotaMusical(2,3);
        NotaMusical n11 = new NotaMusical(2,3);
        NotaMusical n12 = new NotaMusical(1,4);
        NotaMusical n13 = new NotaMusical(2,4);
        NotaMusical n14 = new NotaMusical(3,4);
        NotaMusical n15 = new NotaMusical(1,4);
        NotaMusical n16 = new NotaMusical(0,2);
        
        c1.añadir(n1);
        c1.añadir(n2);
        c1.añadir(n3);
        c1.añadir(n4);
        c1.añadir(n5);
        c1.añadir(n6);
        c1.añadir(n7);
        c1.añadir(n8);
        c1.añadir(n9);
        c1.añadir(n10);
        c1.añadir(n11);
        c1.añadir(n12);
        c1.añadir(n13);
        c1.añadir(n14);
        c1.añadir(n15);
        c1.añadir(n16);
        
        Piano p = new Piano();
        Guitarra g = new Guitarra();
        
        p.reproducir(c1);
        g.reproducir(c1);


    }

}
