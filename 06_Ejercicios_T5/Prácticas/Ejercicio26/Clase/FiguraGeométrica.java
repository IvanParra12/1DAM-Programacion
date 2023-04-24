package daw.geometria;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public interface FiguraGeométrica extends Coloreable{
    //METODOS
    public double getArea();
    public int getPerimetro();
    public void dibujar(Graphics g);
    
    //METODOS DEFAULT
    public default Cuadrado crearCuadradoIgualArea
        (Point esquinaSuperiorIzquierda){
            double area = this.getArea();
            double lado = Math.sqrt(area);
            return new Cuadrado (esquinaSuperiorIzquierda, 
                    (int)lado, Color.BLACK);
        }
}
