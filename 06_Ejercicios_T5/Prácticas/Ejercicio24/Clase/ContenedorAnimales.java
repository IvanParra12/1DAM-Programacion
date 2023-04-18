package daw.zoo;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public abstract class ContenedorAnimales {
    //ATRIBUTOS
    protected Set <Animal> animales;
    
    //CONSTRUCTOR
    public ContenedorAnimales(){
        this.animales = new HashSet();
    };
    
    //GETTERS
    public int getPesoActual(){
        int peso = 0;
        
        for (Animal animal: animales){
            peso += animal.getPeso();
        }
        
        return peso;
    }
    
    public int getNumeroAnimales(){
        return this.animales.size();
    }
    
    //SETTERS
    public boolean añadir(Animal a){
        boolean resp = true;
        
        if(this.comprobarDisponibilidadPlaza(a) == true){
            this.animales.add(a);
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }
    
    public boolean retirar(Animal a){
        if(this.animales.contains(a)){
            this.animales.remove(a);
        } else {
            return false;
        }
        return true;
    }
    
    //METODOS ABSTRACTOS
    public abstract boolean comprobarDisponibilidadPlaza(Animal a);
}
