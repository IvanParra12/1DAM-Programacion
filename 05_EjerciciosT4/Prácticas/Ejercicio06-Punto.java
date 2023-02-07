package daw.punto;
import java.awt.Toolkit;
import java.math.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Punto {
    //ATRIBUTOS
    private int x;
    private int y;
    
    //CONSTRUCTORES
    public Punto() {
        x = 0;
        y = 0;
    }
    
    public Punto(int corX, int corY) {
        
        if(corX > Toolkit.getDefaultToolkit().getScreenSize().getWidth() ||
           corY > Toolkit.getDefaultToolkit().getScreenSize().getHeight()) {
            
            y =(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            x =(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            
        } else {
            x = corX;
            y = corY;
        }
    }
    
    public Punto(Punto p) {
        p.x = p.x/2;
        p.y = p.y/2;
    }
    
    public Punto(double angulo, double distancia) {
        
        x = (int) (distancia*Math.cos(angulo));
        y = (int) (distancia*Math.sin(angulo));
    }
    
    //GETTERS
    @Override
    public String toString() {
        String aux = "El punto se encuentra en las coordenada x: " +x+
                " e y: " +y;
        
        return aux;
    }
}
