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
    
    public int getPuntosLocal() {
        return this.puntosLocal;
    }
    
    public int getPuntosVisitante() {
        return this.puntosVisitante;
    }
    
    public boolean ganaLocal(){
        return (this.puntosLocal > this.puntosVisitante);
    }
    
    public boolean ganaVisitante() {
        return (this.puntosLocal < this.puntosVisitante);
    }
    
    public boolean hayEmpate() {
        return (this.puntosLocal == this.puntosVisitante);
    }
    
    @Override
    
    public String toString() {
        String aux = "Hay un partido entre " +nombreLocal+  " y "
                +nombreVisitante+ " ,ambos equipos tienen: " 
                +puntosLocal+ " y " +puntosVisitante+ " puntos respectivamente"
                + " \nY se juega en la fecha: " +fecha;
        return aux;
    }
    
    //SETTERS
    public void anadirCanasta(char equipo, int puntos) {
       
        if(equipo == 'L') {
            
            this.puntosLocal += puntos;
        }
        else if(equipo == 'V') {
            
            this.puntosVisitante += puntos;
        }
    }
    
    public void reset() {
        
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
    }
}
