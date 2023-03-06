package compras;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Compras {
    //ATRIBUTOS
    private double presupuesto;
    private List<Double> precios = new ArrayList<>();
    
    //CONSTRUCTOR
    public Compras(double presupuesto) {
        
        this.presupuesto = presupuesto;
    }
    //GETTERS

    public double getPresupuesto() {
        return this.presupuesto;
    }

    public List<Double> getPrecios() {
        return this.precios;
    }
    
    //SETTERS
    public void registrarCompra(double dinero) throws Exception {
        if(this.presupuesto < dinero) {
            throw new Exception("No hay suficiente presupuesto."
                    + " Faltan "+Math.abs(this.presupuesto - dinero)+" euros");
        } else {
            this.precios.add(dinero);
        }
    }

    @Override
    public String toString() {
        return "Compras{" 
                + "\nPresupuesto=" + presupuesto 
                + "\nPrecios=" + precios + '}';
    }
    
    
}
