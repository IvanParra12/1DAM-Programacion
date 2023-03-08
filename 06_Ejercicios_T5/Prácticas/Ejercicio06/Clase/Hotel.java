package daw.ciudad;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Hotel extends Edificio{
    //ATRIBUTOS
    private List <String> clientes = new ArrayList<>();
    private int maximo;
    
    //CONSTRUCTOR
    public Hotel(String d, int np, int m) throws IllegalArgumentException {
        super(d, np);
        if(m <= 0) {
            throw new IllegalArgumentException("Introduce una cantidad"
                    + " positiva");
        } else {
            this.maximo = m;
        }
    }
    
    //SETTERS

    /**
     *
     * @param c El nombre del cliente que vamos a añadir
     * @throws IllegalStateException Cuando se haya excedido el numero
     * maximo de clientes se lanzara la excepcion
     */
    public void añadirCliente(String c) throws IllegalStateException{
        if(this.clientes.size() >= this.maximo) {
            throw new IllegalStateException("Se ha excedido el maximo"
                    + " de clientes permitidos");
        } else {
            this.clientes.add(c);
        }
    }
    
    /**
     *
     * @param c El nombre del cliente que vamos a retirar
     * @throws NoSuchElementException Cuando vayamos a quitar un cliente
     * que no esta en el hotel se lanzara la excepcion
     */
    public void retirarCliente(String c) throws NoSuchElementException {
        if(!this.clientes.contains(c)) {
            throw new NoSuchElementException("Este cliente no esta"
                    + " en el hotel");
        } else {
            this.clientes.remove(c);
        }
    }

    @Override
    public String toString() {
        return "\nHotel{" + "clientes=" + this.clientes 
                + "\nMaximo=" + this.maximo + '}';
    }
    
    
}
