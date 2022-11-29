package ejercicio44;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        String primer = "dd/MMMM/yyyy";
        String segundo = "dd-MMMM-yyyy";
        String formato1 = fecha.format(DateTimeFormatter.ofPattern
            (primer));
        
        System.out.println("Primer formato de fecha: "
                +formato1);
        
        String formato2 = fecha.format(DateTimeFormatter.ofPattern
            (segundo));
        
        System.out.println("Segundo formato: "
                +formato2);
    }
    
}
