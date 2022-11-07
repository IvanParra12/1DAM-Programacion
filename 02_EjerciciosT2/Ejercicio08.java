package ejercicio08;
import bpc.daw.objetos.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DepositoAgua deposito1, deposito2 = null;
        
        deposito1 = new DepositoAgua(15, 20);
        deposito2 = new DepositoAgua(5, 20);
        
        deposito1.dibujar();
        deposito2.dibujar();
        
        deposito1.retirarLitro();
        deposito1.retirarLitro();
        deposito1.retirarLitro();
        deposito1.retirarLitro();
        deposito1.retirarLitro();
        
        deposito2.añadirLitro();
        deposito2.añadirLitro();
        deposito2.añadirLitro();
        deposito2.añadirLitro();
        deposito2.añadirLitro();

        deposito1.dibujar();
        deposito2.dibujar();

    }
    
}
