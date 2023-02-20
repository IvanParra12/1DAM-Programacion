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
    private ArrayList<Persona> trabajadores;

    //CONSTRUCTORES
    public Oficina() {
        nombre = "Industrias DAW";
        
        trabajadores = new ArrayList<Persona>();
        trabajadores.add(new Persona("Ana Diaz Diaz",
                33333333, 'P', 1200,
                LocalDate.parse("21/05/1985",
                        DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        trabajadores.add(new Persona("Luis Lopez Lopez",
                22222222, 'J', 1000,
                LocalDate.parse("10/09/1995",
                        DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        trabajadores.add(new Persona("Antonio Perez Perez",
                11111111, 'H', 900,
                LocalDate.parse("28/02/2000",
                        DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }

    public Oficina(String n) {
        nombre = n;
        trabajadores = null;
    }

    public Oficina(String n, int tipo) {
        nombre = n;

        if (tipo <= 0 || tipo > 3) {
            trabajadores = new ArrayList<Persona>();
        } else if (tipo == 1) {
            trabajadores.add(new Persona("Antonio Perez Perez",
                    11111111, 'H', 900,
                    LocalDate.parse("28/02/2000",
                            DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        } else if (tipo == 2) {
            trabajadores.add(new Persona("Luis Lopez Lopez",
                    22222222, 'J', 1000,
                    LocalDate.parse("10/09/1995",
                            DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            trabajadores.add(new Persona("Antonio Perez Perez",
                    11111111, 'H', 900,
                    LocalDate.parse("28/02/2000",
                            DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        } else if (tipo == 3) {
            trabajadores.add(new Persona("Ana Diaz Diaz",
                    33333333, 'P', 1200,
                    LocalDate.parse("21/05/1985",
                            DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            trabajadores.add(new Persona("Luis Lopez Lopez",
                    22222222, 'J', 1000,
                    LocalDate.parse("10/09/1995",
                            DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            trabajadores.add(new Persona("Antonio Perez Perez",
                    11111111, 'H', 900,
                    LocalDate.parse("28/02/2000",
                            DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        }
    }

    //GETTERS
    public ArrayList<Persona> getTrabajadores() {
        return this.trabajadores;
    }
    
    public int getTotalEmpleados() {
        return this.trabajadores.size();
    }
    
    public int getTotalEmpleadosMileuristas() {
        int total = 0;
        
        for(Persona p : trabajadores) {
            if(p.esMileurista()) {
                total++;
            }
        }
        return total;
    }
    
    public List<Persona> getMileuristas() {
        ArrayList<Persona> lista = new ArrayList();
        
        for(Persona p : trabajadores) {
            if(p.esMileurista()) {
                lista.add(p);
            }
        }
        return lista;
    }
    
    public boolean trabaja(Persona p) {
        
        boolean estado = true;
        if(this.trabajadores.contains(p)) {
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }
    @Override
    public String toString() {
        String aux = "Nombre: " + this.nombre + "\n";
        
        for(Persona p : trabajadores) {
            aux += p.toString() + "\n";
        }
        return aux;
    }
    
    //SETTERS
    public void sumarEmpleado(Persona p) {
        
        this.trabajadores.add(p);
    }
    
    public void sumarEmpleado(String nombre, String DNI, double sueldo,
                                LocalDate fechaNac) {
        DNI dni = new DNI(DNI);
        Persona p = new Persona(nombre, dni, sueldo, fechaNac);
        
        this.trabajadores.add(p);
    }
    
    public void pagarEmpleados() {
        for(Persona p : trabajadores) {
            p.cobrarSueldo();
        }
    }
    
    public void mostrarinformeEmpleados() {
        String mil;
        for (Persona p : trabajadores){
            mil = p.esMileurista() == true ? "Si":"No";
            System.out.println("El nombre de la persona es: "
                    +p.getNombre()+" con un sueldo de: "
                    +p.getSueldo()+" Es mileurista?: "+mil);
        }
    }
}
