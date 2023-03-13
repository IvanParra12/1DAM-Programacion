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

    /**
     *
     * @param n Nombre del Programador
     * @param s Sueldo del Programador
     * @param ndni Numero del DNI del Programador
     * @param ldni Letra del DNI del Programador
     * @param ppm Pulsaciones por minuto del Programador
     */
    public Programador(String n, int s, int ndni, char ldni, int ppm){
        super(n, s, ndni, ldni, ppm);
    }
    
    //SETTERS

    /**
     *
     * @param lenguaje Introduce el nombre del lenguaje que se va a aprender
     * @param holaMundo Introduce como se programa la frase Hola Mundo en
     * ese lenguaje
     */
    public void aprenderLenguaje(String lenguaje, String holaMundo){
        
        this.lenguajes.put(lenguaje, holaMundo);
    }
    
    //GETTERS

    /**
     *
     * @param lenguaje El lenguaje que se va a comprobar
     * @return Devuelve como se programa la frase Hola Mundo con el 
     * lenguaje pasado como parámetro
     * @throws IllegalStateException Lanza una excepción 
     * en caso de que el lenguaje introducido no esté en el Map
     * 
     */
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
