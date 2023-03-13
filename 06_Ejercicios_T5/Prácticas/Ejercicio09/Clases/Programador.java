package daw.empresa;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Programador extends TrabajadorTecleante{
    //ATRIBUTOS
    private Map <String, String> lenguajes = new HashMap<>();
    
    //CONSTRUCTOR
    public Programador(String n, int s, int ndni, char ldni, int ppm){
        super(n, s, ndni, ldni, ppm);
    }
    
    //SETTERS
    public void aprenderLenguaje(String lenguaje, String holaMundo){
        
        this.lenguajes.put(lenguaje, holaMundo);
    }
    
    //GETTERS
    public String programarHolaMundo(String lenguaje) 
            throws IllegalStateException {
        if(!this.lenguajes.containsKey(lenguaje)) {
            throw new IllegalStateException("Lenguaje desconocido");
        }
        return this.lenguajes.get(lenguaje);
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nQue ha aprendido estos lenguajes: "
                +this.lenguajes;
    }
    
    
}
