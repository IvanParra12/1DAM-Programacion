package daw.zoo;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Jaula extends ContenedorAnimales{
    //ATRIBUTOS
    private int capacidadMaxima;
    private int pesoMaximo;
    
    //CONSTRUCTOR
    public Jaula(int cm, int pm){
        this.capacidadMaxima = cm;
        this.pesoMaximo = pm;
    }
    
    //GETTERS
    public int getCapacidadMaxima(){
        return this.capacidadMaxima;
    }
    
    public int getPesoMaximo(){
        return this.pesoMaximo;
    }
    
    //METODOS ABSTRACTOS
    @Override
    public boolean comprobarDisponibilidadPlaza(Animal a) {
       if(this.getCapacidadMaxima() >= this.capacidadMaxima 
               && this.getPesoActual()>= this.pesoMaximo) {
           return false;
       } 
       return true;
    }
    
}
