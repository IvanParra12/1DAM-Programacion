package daw.ciudad;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Edificio {
    //ATRIBUTOS
    private String direccion;
    private int nPlantas;
    
    //CONSTRUCTOR

    /**
     *
     * @param direccion Indica la direccion del edificio
     * @param nPlantas Indica el numero de plantas del edificio
     */
    public Edificio(String direccion, int nPlantas) {
        
        this.direccion = direccion;
        this.nPlantas = nPlantas;
    }
    
    //GETTERS

    /**
     *
     * @return Devuelve la direccion del edificio
     */
    public String getDireccion() {
        
        return this.direccion;
    }
    
    /**
     *
     * @return Devuelve el numero de plantas del edificio
     */
    public int getNumeroPlantas() {
        
        return this.nPlantas;
    }

    @Override
    public String toString() {
        return "Edificio{" + "direccion=" + direccion 
                + "\nNumero de Plantas=" + nPlantas + '}';
    }
    
    
}
