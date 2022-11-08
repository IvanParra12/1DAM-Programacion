package ejercicio12;
import bpc.daw.objetos.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcadorBaloncesto partido = null;
        
        partido = new MarcadorBaloncesto("Estudiantes", "CB Granada");
        
        partido.anotarCanasta('L', 2);
        partido.anotarCanasta('V', 3);
        partido.anotarCanasta('L', 2);
        partido.anotarCanasta('V', 2);
        partido.anotarCanasta('V', 3);
        partido.anotarCanasta('L', 1);
        partido.anotarCanasta('L', 1);
        partido.anotarCanasta('V', 2);

        String local = partido.getNombreLocal();
        String visitante = partido.getNombreVisitante();
        
        int localpts = partido.getPuntosLocal();
        int visitantepts = partido.getPuntosVisitante();
        
        String gana = partido.getNombreEquipoGanador();
        String pierde = partido.getNombreEquipoPerdedor();
        
        System.out.println("Los equipos que juegan son: " +local+ " y " +visitante);
        System.out.println("Tienen: " +localpts+ " y " +visitantepts+ " puntos respectivamente");
        System.out.println("Va ganando: " +gana+ " y va perdiendo: " +pierde);
        

    }
    
}
