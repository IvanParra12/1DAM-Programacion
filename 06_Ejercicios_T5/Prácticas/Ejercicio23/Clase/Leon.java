package daw.zoo;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Leon extends Animal{
    //CONSTRUCTOR
    public Leon(String n, int p) {
        super(n, p);
    }
    //METODO ABSTRACTO
    @Override
    public void emitirSonido() {
        System.out.println("*Sonido de leon*");
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString();
    }
}
