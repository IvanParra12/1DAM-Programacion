package daw.operaciones;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Fraccion {
    //ATRIBUTOS
    private int numerador;
    private int denominador;
    
    //CONSTRUCTORES
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    //GETTERS
    public int getNumerador() {
        return this.numerador;
    }
    
    public int getDenominador() {
        return this.denominador;
    }
    
    public double getValorReal() {
        double op = this.numerador / this.denominador;
        
        return op;
    }
    
    public Fraccion getInversa() {
        Fraccion f = new Fraccion
        (this.denominador, this.numerador);
        
        return f;
    }
    
    public static Fraccion sumar(Fraccion a, Fraccion b) {
        int numerador = ((a.getNumerador() * b.getDenominador())
                        + a.getDenominador() * b.getNumerador());
        int denominador = (a.getDenominador() * b.getDenominador());
        Fraccion f = new Fraccion(numerador, denominador);
        
        return f;
    }
    
    public static Fraccion multiplicar(Fraccion a, Fraccion b) {
        int numerador = (a.getNumerador() * b.getNumerador());
        int denominador = (a.getDenominador() * b.getDenominador());
        
        Fraccion f = new Fraccion(numerador, denominador);
        
        return f;
    }
    
    public static Fraccion dividir(Fraccion a, Fraccion b) {
        int numerador = (a.getNumerador() * b.getDenominador());
        int denominador = (a.getDenominador() * b.getNumerador());
        
        Fraccion f = new Fraccion(numerador, denominador);
        
        return f;
    }
    
    @Override
    public String toString() {
        String aux = "Fraccion: " +this.numerador + "/" + this.denominador;
        
        return aux;
    }
}
