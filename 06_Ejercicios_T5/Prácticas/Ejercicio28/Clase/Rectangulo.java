package daw.geometria;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Rectangulo implements Centrable, Apoyable{
    //ATRIBUTOS
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;
    
    //CONSTRUCTOR
    public Rectangulo (Point esi, Point eid, Color c){
        
        this.esquinaInferiorDerecha = eid;
        this.esquinaSuperiorIzquierda = esi;
        this.color = c;
    }

    //GETTERS
    @Override
    public Point getCentro() {
      int l1 = (int)(this.esquinaInferiorDerecha.getX() 
              + this.esquinaSuperiorIzquierda.getY()) / 2;
      int l2 = (int)(this.esquinaInferiorDerecha.getY()
              + this.esquinaSuperiorIzquierda.getX()) / 2;
      
      return new Point(l1,l2);
    }

    @Override
    public int getLongitudBase() {
        return (int)this.esquinaInferiorDerecha.getX();
    }

    @Override
    public int getLongitudAltura() {
          return (int)this.esquinaSuperiorIzquierda.getY();
    }

    @Override
    public double getArea() {
        double area = this.getLongitudAltura() * this.getLongitudBase();
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro = 2 * (this.getLongitudAltura() 
                * this.getLongitudBase());
        
        return perimetro;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
    
    //SETTERS
    @Override
    public void dibujar(Graphics g) {
        g.create();
    }
}
