package daw.zoo;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class TransporteAnimales extends Jaula {

    //CONSTRUCTOR
    public TransporteAnimales() {
        super(6, 500);
    }

    @Override
    public boolean comprobarDisponibilidadPlaza(Animal a) {
        int cantLeon = 0;
        int cantTigre = 0;
        this.animales.add(a);
        
        for(Animal an : animales){
            if(an instanceof Leon) {
                cantLeon+=1;
            } else {
                cantTigre+=1;
            }
        }
        
        if(cantLeon <= 6 && cantTigre == 0){
            this.animales.remove(a);
            return true;
        } else if (cantTigre <= 6 && cantLeon == 0) {
            this.animales.remove(a);
            return true;
        } else {
            this.animales.remove(a);
            return false;
        }
    }
}
