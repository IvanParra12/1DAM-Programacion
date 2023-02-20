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
    public boolean getEstado() {
        if(abierto) {
            return true;
        } else{
           return false;
        }
    }
    
    public String getMensaje() {
        if(this.abierto == false) {
            return null;
        } else{
            return this.mensaje;
        }
    }
    
    //SETTERS
    public void setMensaje(String m) {
        if(abierto) {
            mensaje = m;
        }
    }
    
    public void pasarMayusculas() {
        mensaje = mensaje.toUpperCase();
    }
    
    public void abrir() {
        this.abierto = true;
    }
    
    public void cerrar() {
        this.abierto = false;
    }
    
}
