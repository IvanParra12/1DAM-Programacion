package daw.partido;
import java.time.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class MarcadorBaloncesto {
    //ATRIBUTOS
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;
    
    //CONSTRUCTORES
    public MarcadorBaloncesto(String nL, String nV) {
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = LocalDate.now();
    }
    
    public MarcadorBaloncesto(String nL, String nV, LocalDate f)  {
        nombreLocal = nL;
        nombreVisitante = nV;
        fecha = f;
        puntosLocal = 0;
        puntosVisitante = 0;
    }
    
    public MarcadorBaloncesto(String nL, int pL, 
            String nV, int pV, LocalDate f) {
        nombreLocal = nL;
        nombreVisitante = nV;
        fecha = f;
        puntosLocal = pL;
        puntosVisitante = pV;
    }
    
    //GETTERS
    public LocalDate getFecha() {
        return fecha;
    }
    
    public String toString() {
        String aux = "Hay un partido entre " +nombreLocal+  " y "
                +nombreVisitante+ " ,ambos equipos tienen: " 
                +puntosLocal+ " y " +puntosVisitante+ " puntos respectivamente"
                + " \nY se juega en la fecha: " +fecha;
        return aux;
    }
}
