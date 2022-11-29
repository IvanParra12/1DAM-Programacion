package ejercicio39;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreSO = "os.name";
        String versionSO = "os.version";
        String arquitecturaSO = "os.arch";
        String usuario = "user.name";
        String temp = "TMP";
        System.out.println("Informacion sobre el ordenador: ");
        System.out.println("\nSistema operativo: " 
                + System.getProperty(nombreSO));
        System.out.println("Version del SO: " 
                + System.getProperty(versionSO));
        System.out.println("Arquitectura del SO: " 
                + System.getProperty(arquitecturaSO));
        System.out.println("Usuario actual: " 
                + System.getProperty(usuario));
        System.out.println("Carpeta de archivos temporales: " 
                + System.getenv(temp));
    }

}
