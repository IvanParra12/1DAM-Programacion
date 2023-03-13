package daw.empresa;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class TrabajadorTecleante extends Trabajador implements Teclado{
    //ATRIBUTOS
    private int pulsacionesMinuto;
    protected Teclado teclado;
    
    //CONSTRUCTOR

    /**
     *
     * @param n Nombre del Trabajador tecleante
     * @param s Sueldo del Trabajador tecleante
     * @param ndni Numero del DNI del Trabajador tecleante
     * @param ldni Letra del DNI del Trabajador tecleante
     * @param ppm Pulsaciones por minuto del Trabajador tecleante
     */
    public TrabajadorTecleante(String n, int s, int ndni, char ldni, int ppm) {
        super(n, s, ndni, ldni);
        this.pulsacionesMinuto = ppm;
    }
    
    //SETTERS

    /**
     *
     * @param t Asigna un Teclado con el parámetro pasado
     */
    public void setTeclado(Teclado t){}
    
    /**
     *
     * @param mensaje El mensaje que va a escribir el teclado
     */
    @Override
    public void escribirTexto(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    //GETTERS

    /**
     *
     * @return La cantidad de pulsaciones por minuto del trabajador
     */
    public int getPulsacionesMinuto() {
        return this.pulsacionesMinuto;
    }
    
    /**
     *
     * @return El teclado del trabajador
     */
    public Teclado getTeclado(){
        return this.teclado;
    }
    
    @Override
    public String toString() {
        return super.toString()
                +"\nCon unas ppm de: " +this.pulsacionesMinuto
                +"\nCon un teclado: "+this.getTeclado();
    }
    
}
