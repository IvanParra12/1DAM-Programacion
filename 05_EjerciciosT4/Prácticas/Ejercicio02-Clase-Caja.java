package daw.objetos;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Caja {
    //ATRIBUTOS
    private boolean abierto;
    private String mensaje;
    
    //CONSTRUCTORES
    public Caja() {
        abierto = false;
        mensaje = "Viva el tema 7";
    };
    
    public Caja(String m) {
        mensaje = m;
        abierto = false;
    }
    
    public Caja(boolean a, String m) {
        abierto = a;
        mensaje = m;
    }
    //GETTERS
    public String getMensaje() {
        return mensaje;
    }
    
    public boolean getEstado() {
        if(abierto) {
            return true;
        } else{
           return false;
        }
    }
    
}
