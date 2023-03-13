package daw.empresa;
import java.time.LocalDate;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Administrativo extends TrabajadorTecleante{
    //CONSTRUCTOR

    /**
     *
     * @param n Nombre del trabajador Administrativo
     * @param s Sueldo del trabajador Administrativo
     * @param ndni Numero del DNI del trabajador Administrativo
     * @param ldni Letra del DNI del trabajador Administrativo
     * @param ppm Numero de pulsaciones por minuto
     * del trabajador Administrativo
     */
    public Administrativo(String n, int s, int ndni, char ldni, int ppm){
        super(n, s, ndni, ldni, ppm);
    }
    
    //SETTERS
    /**
     *
     * @param t Introduce un String con el informe al que se le va
     * a añadir una hora.
     */
    public void escribirInforme(String t){
        LocalDate l = LocalDate.now();
        t += l.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
