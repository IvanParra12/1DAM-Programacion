package daw.persona;
import daw.persona.DNI;
import java.time.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private CuentaCorriente cuenta;
    
    //CONSTRUCTORES
    public Persona(String n, DNI d) {
        dni = d;
        nombre = n;
        sueldo = 1000;
        fechaNacimiento = LocalDate.of(2003, 
                Month.JANUARY, 31);
        cuenta = new CuentaCorriente();
    }
    
    public Persona(String n, DNI d, double s, LocalDate f) {
        dni = d;
        nombre = n;
        sueldo = s;
        fechaNacimiento = f;
        cuenta = new CuentaCorriente();
    }
    
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate f) {
        dni = new DNI(numDNI,letraDNI);
        sueldo = s;
        fechaNacimiento = f;
        nombre = n;
        cuenta = new CuentaCorriente();
    }
    
    public Persona(String n, int numDNI, char letraDNI) {
        dni = new DNI(numDNI,letraDNI);
        nombre = n;
        sueldo = 900;
        fechaNacimiento = LocalDate.of(2003, 
                Month.JANUARY, 31);
        cuenta = new CuentaCorriente();
    }
    
    //GETTERS
    public String toString() {
        String aux = "El/Ella es " +nombre+ " con DNI: " +dni.getDNI()+ " ,cobra: "
                +sueldo+ " y nacio en el: " +fechaNacimiento;
        return aux;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public DNI getDNI() {
        return this.dni;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
    
    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public CuentaCorriente getCuentaCorriente() {
        return this.cuenta;
    }
    
    public boolean esMayorEdad() {
        
        LocalDate actual = LocalDate.now();
        Period etapa = Period.between(this.fechaNacimiento,
                actual);
        
        if(etapa.getYears() >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean tieneDinero() {
        if(this.getSueldo() > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean esMileurista() {
        if(this.getSueldo() < 1200) {
            return true;
        } else {
            return false;
        }
    }
    
    //SETTERS
    public void aumentarSueldo(int porcentaje) {
        if (porcentaje>0) {
            double op = ((double)porcentaje / 100) * this.sueldo;
            this.sueldo += op;
        }    
    }
    
    public void cobrarSueldo() {
        
        this.cuenta.sumarDinero((int)this.sueldo);
    }
}
