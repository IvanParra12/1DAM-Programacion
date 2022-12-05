package ejercicio48;
import bpc.daw.objetos.*;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MarcadorMejorado partido = new MarcadorMejorado("Estudiantes",
       "CB Granada");
       
       final int local = MarcadorMejorado.CANASTA_LOCAL;
       final int vis = MarcadorMejorado.CANASTA_VISITANTE;
       final int normal = MarcadorMejorado.NORMAL;
       final int libre = MarcadorMejorado.TIRO_LIBRE;
       final int triple = MarcadorMejorado.TRIPLE;
              
       partido.anotarCanasta(local,normal);
       partido.anotarCanasta(vis,triple);
       partido.anotarCanasta(local,normal);
       partido.anotarCanasta(vis,normal);
       partido.anotarCanasta(vis,triple);
       partido.anotarCanasta(local,libre);
       partido.anotarCanasta(local,libre);
       partido.anotarCanasta(vis,normal);
       
       System.out.println(partido.toString());
            
       System.out.println("Va ganando el equipo: "
               +partido.getNombreEquipoGanador()+ 
               "\nY el equipo que va perdido es: "
               +partido.getNombreEquipoPerdedor());
    }

}
