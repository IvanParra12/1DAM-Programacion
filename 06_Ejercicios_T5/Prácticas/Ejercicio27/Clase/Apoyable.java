package daw.geometria;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public interface Apoyable extends FiguraGeométrica{
    //METODOS
    public int getLongitudBase();
    public int getLongitudAltura();
    
    
    //METODOS DEFAULT
    public default boolean esHorizontal(){
        if(this.getLongitudBase() > this.getLongitudAltura()){
            return true;
        } else {
            return false;
        }
    }
    
    public default boolean esVertical(){
        if(!(this.getLongitudBase() > this.getLongitudAltura())){
            return true;
        } else {
            return false;
        }
    }
}
