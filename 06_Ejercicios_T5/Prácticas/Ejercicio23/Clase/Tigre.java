package daw.zoo;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Tigre extends Animal{
    //CONSTRUCTOR
    public Tigre(String n, int p) {
        super(n, p);
    }
    //METODOS ABSTRACTOS
    @Override
    public void emitirSonido() {
        System.out.println("*Sonido de tigre*");
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString();
    }
}
