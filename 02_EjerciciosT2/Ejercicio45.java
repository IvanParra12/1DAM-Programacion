package ejercicio45;
import java.time.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2100, 2, 28);
        
        DayOfWeek dia = fecha.getDayOfWeek();
                
        System.out.println("El dia de la semana del 28/2/2100 es: "
                +dia.name());
    }
    
}
