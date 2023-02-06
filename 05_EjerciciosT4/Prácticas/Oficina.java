package daw.persona;
import daw.persona.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Oficina {
    //ATRIBUTOS
    private String nombre;
    private ArrayList <Persona> trabajadores;
    
    
    //CONSTRUCTORES
    public Oficina() {
        nombre = "Industrias DAW";
        trabajadores.add(new Persona("Ana Diaz Diaz",
                33333333, 'P', 1200, 
                LocalDate.parse("21/05/1985", 
                        DateTimeFormatter.ofPattern
                                ("dd/MM/yyyy"))));
        trabajadores.add(new Persona("Luis Lopez Lopez",
                22222222, 'J', 1000, 
                LocalDate.parse("10/09/1995", 
                        DateTimeFormatter.ofPattern
                                ("dd/MM/yyyy"))));
        trabajadores.add(new Persona("Antonio Perez Perez",
                11111111, 'H', 900, 
                LocalDate.parse("28/02/2000", 
                        DateTimeFormatter.ofPattern
                                ("dd/MM/yyyy"))));
    }
    
    public Oficina(String n) {
        nombre = n;
        trabajadores = null;
    }
    
    public Oficina(String n, int tipo) {
        nombre = n;    
        
        if(tipo == 0 || tipo > 3) {
            trabajadores = null;
        } else if(tipo == 1) {
            trabajadores.add(new Persona("Antonio Perez Perez",
                11111111, 'H', 900, 
                LocalDate.parse("28/02/2000", 
                        DateTimeFormatter.ofPattern
                                ("dd/MM/yyyy"))));
        } else if(tipo == 2) {
            trabajadores.add(new Persona("Luis Lopez Lopez",
                22222222, 'J', 1000, 
                LocalDate.parse("10/09/1995", 
                        DateTimeFormatter.ofPattern
                                ("dd/MM/yyyy"))));
        } else if(tipo == 3) {
            trabajadores.add(new Persona("Ana Diaz Diaz",
                33333333, 'P', 1200, 
                LocalDate.parse("21/05/1985", 
                        DateTimeFormatter.ofPattern
                                ("dd/MM/yyyy"))));
        }
    }
}
