package daw.geometria;
import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Cuadrado extends Rectangulo{
    //ATRIBUTOS
    private int longitudLado;
    
    //CONSTRUCTOR
    public Cuadrado(Point esquinaSuperiorIzquierda, 
            int longitudLado, Color color){
        super(esquinaSuperiorIzquierda, 
                new Point(esquinaSuperiorIzquierda.x + longitudLado,
                           esquinaSuperiorIzquierda.y + longitudLado)
                ,color);
        
        this.longitudLado = longitudLado;
    }
}
