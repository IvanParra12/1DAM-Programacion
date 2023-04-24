package daw.geometria;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Circulo implements FiguraGeométrica, Centrable{
    //ATRIBUTOS
    private Point centro;
    private int radio;
    private Color color;
    
    //CONSTRUCTOR
    public Circulo(Point centro, int radio, Color color){
        
        this.centro = centro;
        this.color = color;
        this.radio = radio;
    }

    //GETTERS
    @Override
    public double getArea() {
        double area = 0;
        area = Math.PI * this.radio;
        
        return area;
    }

    @Override
    public int getPerimetro() {
         int area = 0;
         area = 2 * (int)Math.PI * radio;
         
         return area;
    }

    @Override
    public Color getColor() {
       return this.color;  
    }

    @Override
    public Point getCentro() {
        return this.centro;
    }
    
    //SETTERS
    @Override
    public void dibujar(Graphics g) {
       g.create();
    }
}
