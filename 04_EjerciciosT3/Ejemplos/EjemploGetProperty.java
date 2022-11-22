package ejemplo.getproperty;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class EjemploGetProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreSO = "os.name";
        String directorio = "java.home";
        String versionSO = "os.version";
        String arquitecturaSO = "os.arch";
        System.out.println("\n Informacion sobre el SO: ");
        System.out.println("\nNombre del SO: " 
                + System.getProperty(nombreSO));
        System.out.println("Version del SO: " 
                + System.getProperty(versionSO));
        System.out.println("Arquitectura del SO: " 
                + System.getProperty(arquitecturaSO));
        System.out.println("Directorio de instalacion: " 
                + System.getProperty(directorio));
    }
}
