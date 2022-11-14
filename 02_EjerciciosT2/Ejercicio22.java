package ejercicio22;
import bpc.daw.objetos.TarjetaCredito;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarjetaCredito tarjeta = new TarjetaCredito(5000, 1111);
        
        try {
           tarjeta.getSaldo(1111);
           System.out.println("El saldo de la cuenta es :"
                   +tarjeta.getSaldo(1111));
        } catch(Exception sueldo) {
            System.out.println("La contraseña es incorrecta");
        }
        
        try {
            tarjeta.sacarDinero(2000, 1111);
            System.out.println("El saldo de la cuenta después de sacar dinero es :"
                    +tarjeta.getSaldo(1111));
        } catch (Exception ingreso) {
            System.out.println("La contraseña es incorrecta");
        }
        
    }
    
}
