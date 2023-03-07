package daw.ciudad;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Rascacielos extends Edificio{
    //ATRIBUTOS
    private int altura;
    
    //CONSTRUCTOR

    /**
     *
     * @param d Indica la direccion del rascacielos
     * @param np Indica el numero de plantas del rascacielos
     * @param a Indica la altura del rascacielos
     * @throws IllegalArgumentException En caso de que la altura sea negativa
     * se lanzara la excepcion
     */
    public Rascacielos(String d, int np, int a) 
            throws IllegalArgumentException{
        super(d, np);
        if(a <= 0) {
            throw new IllegalArgumentException("Introduce una cantidad"
                    + " positiva");
        } else {
            this.altura = a;
        }
    }
    
    //GETTERS

    /**
     *
     * @return Devuelve la altura del rascacielos
     */
    public int getAltura() {
        
        return this.altura;
    }

    @Override
    public String toString() {
        return "\nRascacielos{" + "Altura=" + altura 
                +"\nDireccion: "+this.getDireccion()
                +"\nNumero de Plantas: "+this.getNumeroPlantas()+'}';
    }
    
    
}
