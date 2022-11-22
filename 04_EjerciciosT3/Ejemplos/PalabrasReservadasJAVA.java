package palabras.reservadas.java;
import java.util.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class PalabrasReservadasJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String mal = "\u001B[31m";
        final String bien = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_RESET = "\u001B[0m";
        
        ArrayList<String> reservadas = new ArrayList<>();
        reservadas.add("abstract"); reservadas.add("instanceof");
        reservadas.add("assert");   reservadas.add("int");
        reservadas.add("boolean");  reservadas.add("interface"); 
        reservadas.add("break");    reservadas.add("long");
        reservadas.add("byte");     reservadas.add("native");
        reservadas.add("case");     reservadas.add("new");
        reservadas.add("catch");    reservadas.add("package");
        reservadas.add("char");     reservadas.add("private");
        reservadas.add("class");    reservadas.add("protected");
        reservadas.add("const");    reservadas.add("public");
        reservadas.add("continue"); reservadas.add("return");
        reservadas.add("default");  reservadas.add("short");
        reservadas.add("do");       reservadas.add("static");
        reservadas.add("double");   reservadas.add("strictfp");
        reservadas.add("else");     reservadas.add("super");
        reservadas.add("enum");     reservadas.add("switch");
        reservadas.add("extends");  reservadas.add("synchronized");
        reservadas.add("final");    reservadas.add("this");
        reservadas.add("finally");  reservadas.add("throw");
        reservadas.add("float");    reservadas.add("throws");
        reservadas.add("for");      reservadas.add("transient");
        reservadas.add("goto");     reservadas.add("try");
        reservadas.add("if");       reservadas.add("void");
        reservadas.add("implements"); reservadas.add("volatile");
        reservadas.add("import");   reservadas.add("while");

        ArrayList<String> acertadas = new ArrayList<>();
        
        int contador = 0;
        final int max = 50;
        
        System.out.println(ANSI_YELLOW + "|      PALABRAS RESERVADAS DE JAVA         |");
        System.out.println(ANSI_YELLOW + "|       Cuantas puedes adivinar?           |");
        System.out.println(ANSI_YELLOW + "|    Presiona '.' para quitar el juego     |\n" + ANSI_RESET);

        
        System.out.println("Escribe todas las palabras reservadas de Java "
                + "que conozcas: ");
        
        boolean repetir = true;
        
        while (repetir || contador == max) {
            String palabras = new Scanner(System.in).nextLine().toLowerCase();
            
            if (palabras.contains(".")) {
                System.out.println("Has acertado las siguientes palabras: "
                        + acertadas);
                repetir = false;
            } else {
                if(reservadas.contains(palabras)) {
                    palabras = bien + palabras;
                    acertadas.add(palabras);
                    contador++;
                } else {
                    System.out.println(mal + "No es correcto" + ANSI_RESET);
                }
                if (contador == 50) {
                    System.out.println("ENHORABUENA!!!");
                    System.out.println("Has acertado todas las palabras "
                            + "reservadas");
                    repetir = false;
                }
            }
            
        }
        
        
    }

}
