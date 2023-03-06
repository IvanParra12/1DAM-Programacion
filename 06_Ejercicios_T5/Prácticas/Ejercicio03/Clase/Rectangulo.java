package daw.figuras;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Rectangulo {
    //ATRIBUTOS
    private int base;
    private int altura;
    private int area;
    
    //CONSTRUCTOR
    public Rectangulo(int base, int altura) {
        
        this.base = base;
        this.altura = altura;
    }
    
    //SETTERS
    public void setBase(int b) {
        
        this.base = b;
    }
    
    public void setAltura(int a) {
        
        this.altura = a;
    }
    
    //GETTERS
    public int getArea() {
        
        return this.area = (this.base * this.altura);
    }

    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base 
                + "\nAltura=" + altura 
                + "\nArea=" + area + '}';
    }
    
    
}
