package ejercicio23;
import bpc.daw.objetos.TarjetaCredito;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarjetaCredito tarjeta = new TarjetaCredito(1000, 2222);
        
        try {
           System.out.println("El saldo de la cuenta es :"
                   +tarjeta.getSaldo(2222)+ " €");
        } catch(Exception sueldo) {
            System.out.println("La contraseña es incorrecta");
        }
        
        try {
            tarjeta.ingresarDinero(100);
            System.out.println("El saldo de la cuenta es :"
                   +tarjeta.getSaldo(2222)+ " €");
        } catch (Exception ingreso) {
            System.out.println("La contraseña es incorrecta");
        }
        
        try {
            if (tarjeta.getSaldo(2222) >= 2800) {
                tarjeta.sacarDinero(2800, 2222);
                System.out.println("El saldo de la cuenta es :"
                   +tarjeta.getSaldo(2222)+ " €");
            } else {
                System.out.println("No hay saldo suficiente");
            }
        } catch (Exception sacar) {
            System.out.println(sacar.getMessage());
        } 

    }
    
}
