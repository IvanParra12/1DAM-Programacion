package daw.persona;
import daw.persona.*;
import java.math.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class CuentaCorriente {
    //ATRIBUTOS
    private int numero;
    private double saldo;
    
    //CONSTRUCTORES
    public CuentaCorriente() {
        numero = (int)Math.floor(Math.random()*1000);
        saldo = 0;
    }
    
    public CuentaCorriente(int n) {
        numero = n;
        saldo = 0;
    }
    
    public CuentaCorriente(int n, double s) {
        numero = n;
        saldo = s;
    }
    
    //SETTERS
    public void sumarDinero(int cantidad) {
        saldo += cantidad;
    }
    
    public void retirarDinero(int cantidad) throws Exception {
        if(cantidad > this.saldo) {
            Exception e = new Exception("Cantidad superior "
                    + "al sueldo actual");
        } else {
            this.saldo -= cantidad;
        }
    }
    
    //GETTERS
    public double getSaldo() {
        return this.saldo;
    }
}
