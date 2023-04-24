package daw.geometria;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Triángulo implements Apoyable{
    //ATRIBUTOS
    private Point[] vertices = new Point[3];
    
    //CONSTRUCTOR
    public Triángulo(Point v1, Point v2, Point v3){
        this.vertices[0] = v1;
        this.vertices[1]= v2;
        this.vertices[2] = v3;
    }
    
    //GETTERS
    private double getLongitud(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) 
                + Math.pow(a.getY() - b.getY(), 2));
    }
    
    @Override
    public int getLongitudBase() {
        double lado1 = getLongitud(vertices[0], vertices[1]);
        int aux = (int) Math.round(lado1);
        return aux;
    }

    @Override
    public int getLongitudAltura() {
        double lado1 = getLongitud(vertices[0], vertices[1]);
        double lado2 = getLongitud(vertices[1], vertices[2]);
        double lado3 = getLongitud(vertices[2], vertices[0]);
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return (int)(2 * area / lado1);
    }

    @Override
    public double getArea() {
        double lado1 = getLongitud(vertices[0], vertices[1]);
        double lado2 = getLongitud(vertices[1], vertices[2]);
        double lado3 = getLongitud(vertices[2], vertices[0]);
        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;
    }

    @Override
    public int getPerimetro() {
        double lado1 = getLongitud(vertices[0], vertices[1]);
        double lado2 = getLongitud(vertices[1], vertices[2]);
        double lado3 = getLongitud(vertices[2], vertices[0]);
        double perimetro = lado1 + lado2 + lado3;
        return (int) perimetro;
    }

    @Override
    public void dibujar(Graphics g) {
        g.create();
    }

    @Override
    public Color getColor() {
        return this.getColor();
    }
    
}
