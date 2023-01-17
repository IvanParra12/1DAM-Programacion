package ejercicio11;

import java.util.*;
import java.io.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repetir = true;
        int op;
        String dni = "";
        String nom = "";
        String dir = "";
        String tel = "";

        File archivo = new File(dni + ".txt");
        PrintWriter wri = null;
        try {
            wri = new PrintWriter(archivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        while (repetir) {
            System.out.println("Selecciona una opción: "
                    + "\n1. Añadir nuevo alumno"
                    + "\n2. Ver los datos de un alumno"
                    + "\n3. Salir");
            op = new Scanner(System.in).nextInt();

            switch (op) {
                case 1:
                    System.out.println("DNI: ");
                    dni = new Scanner(System.in).nextLine();

                    System.out.println("Nombre: ");
                    nom = new Scanner(System.in).nextLine();

                    System.out.println("Direccion: ");
                    dir = new Scanner(System.in).nextLine();

                    System.out.println("Telefono: ");
                    tel = new Scanner(System.in).nextLine();

                    try {
                        archivo.createNewFile();
                        wri.println(nom);
                        wri.println(dir);
                        wri.println(tel);
                        wri.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Datos guardados!");
                    break;
                case 2:
                    System.out.println("Escribe el DNI: ");
                    String dni2 = new Scanner(System.in).nextLine();
                    String ruta = dni2 + ".txt";
                    System.out.println("Mostrando el contenido del"
                            + " archivo: ");
                    try {
                        BufferedReader leer
                                = new BufferedReader(new FileReader(archivo));
                        while (leer.ready()) {
                            System.out.println(leer.readLine());
                        }
                        leer.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Ha finalizado el programa");
                    repetir = false;
                    break;
                default:
                    System.out.println("Numero incorrecto");
            }
        }
    }
}


