package ejercicio46;
import java.math.*;
import java.time.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double numAleatorio = Math.floor(Math.random()*10);
       long pausa = (long) numAleatorio;
       
       Instant antes = Instant.now();

       try{
           Thread.sleep(pausa * 1000);
       } catch(Exception e) {
           System.out.println(e.getMessage());
       }
       
       Instant desp = Instant.now();
       
       Duration tiempo = Duration.between(antes, desp);
       
       
       System.out.println("La pausa ha durado: " +tiempo.getSeconds()+ " s");
    }

}
